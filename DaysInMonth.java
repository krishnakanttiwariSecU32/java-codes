import java.util.*;
public class DaysInMonth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int month;
        System.out.println("Enter the Month");
        month=sc.nextInt();
       switch (month) {
        case 1:
        case 3:
        case 4:
        case 6:
        case 5:
        case 7:
        case 8:
        System.out.println("The Number of days is 30 ");
            break;
        case 9:
        case 10:
        case 11:
        case 12:
        System.out.println("The Number of days is 31");
        break;
        case 2:
        System.out.println("The Number of days is 28");
        break;

        default:
        System.out.println("You need to Enter between 1 to 12 ");
            break;
       } 
    }
}
