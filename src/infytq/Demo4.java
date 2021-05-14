package infytq;
abstract class Super{
    Super(){
        System.out.println("in super class");
    }
    abstract void display();
}
public class Demo4 extends Super{
    Demo4(){
        System.out.println("child");
    }
    
    public static void main(String[] args) {
        Demo4 s=new Demo4();
        
    }
}
