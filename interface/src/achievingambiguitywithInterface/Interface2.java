package achievingambiguitywithInterface;

public interface Interface2 {

	void m1();
	
	void m2();
	
	default void m3() {
		System.out.println("This default m3 in I2");
	}
}
