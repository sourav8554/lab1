package operators1;



	
		class Teacher {
			   String designation = "Teacher";
			   String collegeName = "BIET";
			   void does(){
				System.out.println("Teaching");
			   }
			}

			public class Class_teacher extends Teacher{
			   String mainSubject = "IT";
			   public static void main(String args[]){
				   Class_teacher obj = new Class_teacher();
				System.out.println(obj.collegeName);
				System.out.println(obj.designation);
				System.out.println(obj.mainSubject);
				obj.does();
			   }
			}
	

