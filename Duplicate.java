import java.util.*;
public class Duplicate{
public static void main(String[]args){
int a,i;
Scanner input=new Scanner(System.in);
ArrayList<Integer>arr=new ArrayList<>();
System.out.println("enter he elements of array");
for(i=0;i<5;)
{
    a=input.nextInt();

    if(!(arr.contains(a)))
    {
        arr.add(a);
        i++;
}    }
System.out.println("the required array is");
    for(i=0;i<5;i++)
    {
        System.out.println(arr.get(i));

    }

}
}

