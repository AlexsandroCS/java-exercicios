package application;

// Import.
import entity.ImportedProduct;
import entity.Product;
import entity.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listProducts = new ArrayList<>();
        SimpleDateFormat newFormatDate = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for (int i = 0; i < numberProducts; i++){
            System.out.printf("Product #%d data:%n",i+1);

            System.out.print("Common, used or imported (c|u|i): ");
            char tagProduct = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (tagProduct == 'c'){
                    listProducts.add(new Product(name,price));
            } else if (tagProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = newFormatDate.parse(sc.next());

                listProducts.add(new UsedProduct(name,price,date));
            }
            else{
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                listProducts.add(new ImportedProduct(name,price,customsFee));
            }
        }
        System.out.println();

        System.out.println("PRICE TAGS:");
        for (Product product: listProducts){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}