import java.util.Scanner;
public class Sales
{
public static void main(String[]args)
{
   int salary[]=new int[15];
   int grosspay;
   int[]count=new int[9];
   int i,n;


   Scanner input=new Scanner(System.in);
     System.out.println("Enter the no of employee");
     n=input.nextInt();
     for(i=0;i<n;i++){
    grosspay=input.nextInt();
    salary[i]=grosspay*9/100+200;
     }
     for(i=0;i<n;i++){
       if(salary[i]>=200&&salary[i]<300)
           count[0]++;
       else if(salary[i]>=300&&salary[i]<400)
           count[1]++;
       else if(salary[i]>=400&&salary[i]<500)
          count[2]++;
       else if(salary[i]>=500&&salary[i]<600)
          count[3]++;
       else if(salary[i]>=600&&salary[i]<700)
          count[4]++;
       else if(salary[i]>=700&&salary[i]<800)
          count[5]++;
       else if(salary[i]>=800&&salary[i]<900)
          count[6]++;
       else if(salary[i]>=900&&salary[i]<1000)
         count[7]++;
       else
          count[8]++;
     }
       System.out.println("The no of salesman in the given ranges\n200-299 are" +count[0]+"\n300-399 are"+count[1]+"\n400-499 are"+count[2]+"\n500-599 are"+count[3]);
       System.out.println("600-699 are"+count[4]+"\n700-799 are"+count[5]+"\n800-899 are"+count[6]+"\n900-999 are"+count[7]+"\nabove 1000 are"+count[8]);
       }}

