import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args){
        System.out.println("Taking input from user: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("a is : " + a);
    }
}