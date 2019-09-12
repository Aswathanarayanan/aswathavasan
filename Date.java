import java.util.*;
public class Date{
  int day;
  int month;
  int year;
  void set()
  {
  Scanner input=new Scanner(System.in);
  System.out.println("day:");
  day=input.nextInt();
  System.out.println("month:");
  month=input.nextInt();
  System.out.println("year:");
  year=input.nextInt();
  }
  int getday(){
  return day;
  }
  int getmonth(){
  return month;
  }
  int getyear()
  {
   return year;
  }
  void display()
  {
      System.out.printf("%d/%d/%d",getday(),getmonth(),getyear());
  }
  Date()
  {
  day=0;
  month=0;
  year=0;
  }
};

