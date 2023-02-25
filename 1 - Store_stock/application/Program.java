package application;

import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();

        Product product = new Product(name, price);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantityAdd = input.nextInt();

        System.out.print("Enter the number of products to be removed from stock: ");
        int quantityRemove = input.nextInt();

        product.addProducts(quantityAdd);
        product.RemoveProducts(quantityRemove);

        System.out.println(product);
        input.close();
    }
}
