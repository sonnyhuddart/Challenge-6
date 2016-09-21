package challenge.pkg6;
import java.util.Scanner;
public class Challenge6 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Height");
        int num1 = myScanner.nextInt();
        System.out.println("Enter Length");
        int num2 = myScanner.nextInt();
        int num3 = num1 * num2;
        System.out.println("The area of the rectangle is " + num3);
   
    }
    
}
