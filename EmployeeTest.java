import java.util.Scanner;
public class EmployeeTest extends Employee{
public static void main(String[]args)
{
 Employee emp0=new Employee();
 Employee emp=new Employee();
  Scanner input=new Scanner(System.in);
 emp0.get();
 System.out.println("Name of the person is\n"+emp0.first+emp0.last);
 //System.out.println();
 emp0.yearly();
 emp0.interest();
 emp.get();
 System.out.println(emp.first+emp.last);
 //System.out.println();
 emp.yearly();
 emp.interest();
}
}
