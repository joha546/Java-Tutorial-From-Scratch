import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedRead {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number: ");
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println("The number is : " + num);  // This will give you the ASCII value of the value you've entered.
    }
}
