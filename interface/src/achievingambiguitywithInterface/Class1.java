package achievingambiguitywithInterface;

public class Class1 implements Interface1, Interface2 {

	@Override
	public void m1() {
		System.out.println("This is m1");
	}

	@Override
	public void m2() {
		System.out.println("This is m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		Interface2.super.m3();
	}


}
