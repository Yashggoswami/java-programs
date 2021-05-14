package infytq;


class InvalidEmployeeIdException extends Exception{
    public InvalidEmployeeIdException(String msg){
        super(msg);
    }
}
class Employee {
    private int employeeId;
    public Employee(int employeeId){
        this.employeeId=employeeId;
    }
    public void validateEmployeeId(){
        try{
            if(new Integer(employeeId).toString().length()<6){
                throw new InvalidEmployeeIdException("Invalid employee Id");
                System.out.println("Invalid employee Id");
            }
            else{
                System.out.println("Valid employee Id");
            }
        }catch(InvalidEmployeeIdException ie){
            System.out.println(ie.getMessage());
        }catch(Exception e){
            System.out.println("Default exception in employee");
        }

        System.out.println("Complete validate method");
    }
}

public class Demo1{
    public static void main(String[] args) {
        Employee employee=new Employee(62134);
        try{
            employee.validateEmployeeId();
            System.out.println("complete main method");
        }catch(Exception e){
            System.out.println("Default exception in main");
        }
    }


}
