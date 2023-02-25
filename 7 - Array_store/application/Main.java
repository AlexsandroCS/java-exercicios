package application;

import java.util.Scanner;
import java.util.Locale;

import entity.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity of products: ");
        int quantityProduct = input.nextInt();

        Product[] array = new Product[quantityProduct];

        for(int i = 0; i < array.length; i++){
            input.nextLine();
            System.out.print("Enter the product name: ");
            String name = input.nextLine();

            System.out.print("Enter the product price: ");
            double price = input.nextDouble();

            array[i] = new Product(name, price);
        }

        double sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i].getPrice();
        }
        sum = sum/ array.length;
        System.out.printf("The average of the %d products is R$ %.2f",array.length,sum);

        input.close();
    }
}