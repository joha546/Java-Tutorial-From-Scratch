import java.io.IOException;

public class Buffered {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number: ");
        int num = System.in.read();

        System.out.println("The number is : " + num);  // This will give you the ASCII value of the value you've entered.
    }
}
