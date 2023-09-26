import java.util.*;
public class vowelConsonent
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character : ");
        ch=sc.nextChar();
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("It is vowel");
        }
        else 
        {
            System.out.println("It is Consonent");
        }
    }
}
