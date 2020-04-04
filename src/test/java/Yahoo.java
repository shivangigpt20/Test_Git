import org.testng.annotations.Test;

public class Yahoo extends Base{
	@Test(priority=1)
	public void a(){
		System.out.println("Inside Class Yahoo Test1");
	}
	@Test(priority=2)
	public void b(){
		System.out.println("Inside Class Yahoo Test2");
	}
}
