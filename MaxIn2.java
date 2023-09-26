import java.util.*;
public class MaxIn2 {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        a=sc.nextInt();
        System.out.println("Enter the Second number : ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("The Maximum Number is : "+a);

        }
        else 
        System.out.println("The Maximum Number is : "+b);
    }
}
