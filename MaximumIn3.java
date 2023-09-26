import java.util.Scanner;

public class MaximumIn3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a=sc.nextInt();
        System.out.println("Enter the Second number : ");
        b=sc.nextInt();
        System.out.println("Enter the third numnber : ");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The Maximum Number is : "+a);

        }
        else if(b>a && b>c){
        System.out.println("The Maximum Number is : "+b);
    }
    else{
        System.out.println("The maximum number is : "+c);
    }
    
}
}
