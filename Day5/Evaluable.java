package Day5;
import java.util.Scanner;

public interface Evaluable {
     abstract  double calculateFinal();

}
class Student implements Evaluable{
    private String name;
    private int quiz,assignment,project,RollNo;
    Student(String name,int rollno,int quiz,int assignment,int project){
        this.name=name;
        this.quiz=quiz;
        this.assignment=assignment;
        this.project=project;
        this.RollNo=rollno;
    }
   public String  getName(){
        return name;
   }
   public void setName(String name){
     this.name=name;
   }
   public int getRollNo(){
     return RollNo;
   }
   public void setRollNo(int rollno){
    this.RollNo=rollno;
   }
   public int getAssignment(){
     return assignment;
   }
   public void setAssignment(int assignment){
      this.assignment=assignment;
   }
   public int getQuiz(){
    return quiz;
   }
   public void setQuiz(int quiz){
    this.quiz=quiz;
   }
   public int getProject(){
    return project;
   }
   public void setProject(){
    this.project=project;
   }
   public double calculateFinal(){
        double Average=(quiz+project+assignment)/3;
        System.out.println("Average mark:"+Average);
        return Average;
   }
   public String grade(){
    double a1=calculateFinal();
    if(a1>=90){
        return "A+";
    }
    else if(a1>=80){
        return "A";
    }
    else if(a1>=70){
        return "B+";
    }
    else if(a1>=60){
        return "B";
    }
    else if(a1>=50){
        return "C";
    }
    else{
        return "F";
    }
   }
}
class Driver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String  Name=sc.nextLine();
        System.out.print("Enter the Rollno:");
        int RollNo=sc.nextInt();
        System.out.print("Enter the Assignment mark:");
        int Assignment=sc.nextInt();
        System.out.print("Enter the Project mark:");
        int Project=sc.nextInt();
        System.out.print("Enter the Quiz mark:");
        int Quiz=sc.nextInt();
        Student s1=new Student(Name,RollNo,Quiz,Assignment,Project);
        //System.out.println(s1.getAssignment());
        //s1.calculateFinal();
        System.out.println(s1.grade());

    }
}
