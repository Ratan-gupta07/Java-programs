
import java.util.Scanner;

public class evenodd {
    public static void main(String args[]){
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int num =  sc.nextInt();

        if(num % 2 ==0)
            System.out.println(num + " Is a Even .");
        else 
            System.out.println(num + " Is Odd");

        

    }
}
