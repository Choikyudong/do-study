package spring.bean;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;

public class IoCContainer {

	private final List<Class<?>> registeredClasses = new ArrayList<>();
	private final Map<Class<?>, Object> beans = new HashMap<>();

	public void scanAndRegister(String packageName) throws Exception {
		String path = packageName.replace(".", "/");
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URL resource = classLoader.getResource(path);

		if (resource == null) {
			throw new IllegalArgumentException("패키지를 찾을 수 없습니다: " + packageName);
		}

		File directory = new File(resource.getFile());
		if (!directory.exists()) {
			throw new IllegalArgumentException("패키지가 존재하지 않습니다: " + packageName);
		}

		for (File file : Objects.requireNonNull(directory.listFiles())) {
			if (file.getName().endsWith(".class")) {
				String className = packageName + '.' + file.getName().replace(".class", "");
				Class<?> clazz = Class.forName(className);
				registeredClasses.add(clazz); // 클래스 등록
			}
		}

		for (Class<?> clazz : registeredClasses) {
			if (clazz.isAnnotationPresent(Component.class)) {
				registerBean(clazz);
			}
		}
	}

	private void registerBean(Class<?> clazz) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
		Constructor<?>[] constructors = clazz.getConstructors();

		if (constructors.length > 0) {
			Constructor<?> constructor = constructors[0];
			Class<?>[] parameterTypes = constructor.getParameterTypes();

			Object[] dependencies = new Object[parameterTypes.length];
			for (int i = 0; i < parameterTypes.length; i++) {
				dependencies[i] = getBean(parameterTypes[i]);
				if (dependencies[i] == null) {
					registerBean(parameterTypes[i]);
					dependencies[i] = getBean(parameterTypes[i]);
				}
			}

			beans.put(clazz, constructor.newInstance(dependencies));
		} else {
			beans.put(clazz, clazz.getDeclaredConstructor().newInstance());
		}
	}

	public <T> T getBean(Class<T> clazz) {
		return clazz.cast(beans.get(clazz));
	}

}
