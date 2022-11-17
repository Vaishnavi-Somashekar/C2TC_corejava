package access_modifiers_demo;

public class test3 {
	int i=10;
	void show()  {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		test1 t1=new test1();
		t1.show();
		System.out.println(t1.i);
	}

}
