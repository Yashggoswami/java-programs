package infytq;

public class Student{
    private int studentId;
    private String studentName;
    private int yearOfEnrollment;
    public static int counter;
    static{
        //line 1
        counter=500;
    }
    public Student(String name,int yearOfEnrollment)
    {
        this.studentName=name;
        this.yearOfEnrollment=yearOfEnrollment;
        //line 2
        this.studentId=++Student.counter;
        System.out.println(this.studentId);
    }

    public static int getNoOfStudent()
    {
        //line 3
        return (Student.counter-500);
    }
    public static void main(String[] args)
    {
        Student obj=new Student("yash",2017);
        System.out.println(Student.getNoOfStudent());
        Student obj1=new Student("yash g",2018);
        System.out.println(Student.getNoOfStudent());
        Student obj2=new Student("yash gg",2019);
        System.out.println(Student.getNoOfStudent());
        Student.getNoOfStudent();
    } 
}