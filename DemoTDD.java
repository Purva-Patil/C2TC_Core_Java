import org.junit.jupiter.api.*;

public class DemoTDD {
@Test
//@RepeatedTest(20)
	void sum()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

@Disabled  //to disable test for this method
void display()
{
	System.out.println("Executing TDD");
}
}
