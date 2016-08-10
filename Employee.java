import java.util.Scanner;
public class Employee{
    String first;
    String last;
    double salary;
void get()
{
    Scanner input=new Scanner(System.in);
  System.out.println("enter the first name");
  first=input.next();
  System.out.println("enter the last name");
  last=input.next();
  System.out.println("enter the salary");
  salary=input.nextDouble();
  if(salary<0)
    set();
}
void set()
{
            System.out.print("Salary cannot be negative\nenter a valid salary");
            Scanner input=new Scanner(System.in);
            salary=input.nextDouble();
}
void yearly()
{
    System.out.println("the yearly salary is");
    salary=salary*12;
    System.out.println(salary);
}
void interest()
{
  double i;
  i=salary*0.1;
  salary=salary+i;
  System.out.println("the salary after increment");
  System.out.println(salary);
}
  Employee(){
        first=null;
        last =null;
        salary=0;
      }};
