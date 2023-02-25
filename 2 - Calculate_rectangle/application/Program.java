package Application;

import java.util.Scanner;
import Entities.Operations;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Operations operation = new Operations();

        System.out.print("Enter the width of the rectangle: ");
        double widthRectangle = input.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double heightRectangle = input.nextDouble();

        operation.widthRet = widthRectangle;
        operation.heightRet = heightRectangle;

        System.out.printf("%nArea of rectangle: " + operation.Area());
        System.out.printf("%nPerimeter of rectangle: " + operation.Perimeter());
        System.out.printf("%nDiagonal of rectangle: " + operation.Diagonal());

        input.close();
    }
}
