class student2{
	int rollno;
	String name;
	static String college="Siet";
	static {
		college="SIET";
	}
	student2(int r, String n){
		rollno=r;
		name=n;
		
	}
	static void change() {
		college="Sit";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}


	public static void main(String[] args) {
		student2 s1=new student2(11,"Vaish");
		student2 s2=new student2(12,"Shash");
		change();
		s1.display();
		s2.display();
		

	}

}
