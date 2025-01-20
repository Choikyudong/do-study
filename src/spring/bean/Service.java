package spring.bean;

@Component
public class Service {

	private final SubService subService;

	public Service(SubService subService) {
		this.subService = subService;
	}

	public void doService() {
		subService.method();
		System.out.println("Service On");
	}
}
