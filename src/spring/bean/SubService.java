package spring.bean;

@Component
public class SubService {

	private final int t = 1;

	public void method() {
		System.out.println("SubService Method On");
	}

}
