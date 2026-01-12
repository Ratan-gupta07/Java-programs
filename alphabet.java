import java.util.Scanner;

public class alphabet {
    public static void main(String args[]) {
    
    System.out.print("Enter charcter:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if( (ch >= 'a' && ch >= 'z') || (ch >= 'A' && ch >= 'Z') ) {
        System.out.println(ch + " Is Alphabet");
        }

        if( ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
            System.out.println(ch + " Is Vowel");
        }

    }
        
}
