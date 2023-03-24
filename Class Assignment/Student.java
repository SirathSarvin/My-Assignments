package week5.day5;

public class Student {
	public void getStudentInfo(int studId) {
		System.out.println(studId);
     }
	public void getStudentInfo(String studName,int studID) {
		System.out.println(studName);
		System.out.println(studID);
	}
    public void getStudentInfo(long studNumber,String studemail) {
    	System.out.println(studNumber);
    	System.out.println(studemail);
    }
   public static void main(String[] args) {
	Student a1 =new Student();
	a1.getStudentInfo(75758);
	a1.getStudentInfo("vikram",75758);
	a1.getStudentInfo(98765432345l, "vikram@gmail.com");

	
   
}
   
}   
