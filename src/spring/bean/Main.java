package spring.bean;

public class Main {

	public static void main(String[] args) throws Exception {
		IoCContainer ioCContainer = new IoCContainer();
		ioCContainer.scanAndRegister(Main.class.getPackageName());
		Service service = ioCContainer.getBean(Service.class);
		service.doService();
	}

}
