class student{
	int rollno;
	String name;
	float fee;
	student(int r,String n,float f){
		this.rollno=r;
		this.name=n;
		this.fee=f;
	}
	void display() {
		System.out.println(rollno+ " "+name+" "+fee);
	}


	public static void main(String[] args) {
		student s=new student(101,"Thanu",50000f);
		student s1=new student(150,"abc",80000f);
		s1.display();
		s.display();
		

	}

}
