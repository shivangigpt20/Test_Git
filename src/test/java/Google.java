import org.testng.annotations.*;

public class Google extends Base{

@Test(priority=1)
public void a(){
	System.out.println("Inside Class Google Test1");
}
@Test(priority=2)
public void b(){
	System.out.println("Inside Class Google Test2");
}
}
