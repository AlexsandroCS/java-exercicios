import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method2();

        System.out.print("Program finished!");
    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);
        try{
            // Creating an array that will store multiple values on a line separated by space.
            // That is, every space there is on this line starts a new position in the vector.

            System.out.print("Enter some values on the same line separated by space: ");
            String[] vect = sc.nextLine().split(" ");

            System.out.print("Enter the position of a number that was previously entered: ");
            int position = sc.nextInt();

            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        sc.close();
    }
}
