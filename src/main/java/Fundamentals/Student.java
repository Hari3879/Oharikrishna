

















































class Sample{
    
    Sample(){
      // Java Arrays with Answers
      System.out.println("Hello this is the method of the super class");
   }
   SAmple(int i){
  system.out.println("hi")
   }
}
class MyClass extends Sample {
    MyClass(){
      System.out.println("Hello this is the method of the sub class");
   }
   MyClass(int j){
       system.out.println("hello")
   }
   
   
public  static void main(String args[]){
      MyClass obj = new MyClass();
      
    }
}



































package Fundamentals;

public class Student {
	// instance variables
		public int studentId;
		public String studentName;
		public String courseName;
		public int marks;
		public String grade;

		// default constructor
		public Student() {
			System.out.println("Default Constructor");
		}

		// Parameterized Constructor
		public Student(int studentId, String studentName, String courseName, int marks) {
			
			this.studentId = studentId;
			this.studentName = studentName;
			this.courseName = courseName;
			this.marks = marks;
			
		}
		
		public Student(Student s1,String grade){
			this.studentId = s1.studentId;
			this.studentName = s1.studentName;
			this.courseName = s1.courseName;
			this.grade = grade;
			
		}

		public String grade() {
			String result = "";
	       if(marks>=90){
	    	   result="A Grade";
	       }else {
	    	   result = "B Grade";
	       }
	       return result;
		}

	public static void main(String[] args) {
		Student s1 = new Student(100, "abc", "Java", 60);
		System.out.println("Student Id     :   "+s1.studentId);
		System.out.println("Student Name   :   "+s1.studentName);
		System.out.println("Student Grade : "+s1.grade());

		
	}

}
