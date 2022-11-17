
class Student1{
	int rollno;
	String name;
	static String college="Siet";
	Student1 (int r,String n){
		rollno=r;
		name=n;
		
	}
	static void change()
{
		college="sit";
		}
	void display() {
		System.out.println(rollno+ " "+name+ " "+college);
	}
	public static void main(String[] args) {
	 Student s1=new Student(111,"Vaish");
	 Student s2=new Student(222,"Sonu");
	 change();
	 s1.display();
	 s2.display();

	}

}
