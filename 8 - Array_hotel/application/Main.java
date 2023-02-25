package application;

import entity.Clientes;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Number of rented rooms: ");
        int quantityRentedRooms = input.nextInt();

        Clientes[] roomArray = new Clientes[10];

        for (int x = 0; x < quantityRentedRooms; x++){
            System.out.println("Register #"+(x+1));

            System.out.print("Enter your name: ");
            String name = input.next();
            System.out.print("Enter your email: ");
            String email = input.next();

            System.out.print("Enter the room number: ");
            int number = input.nextInt();

            roomArray[number] = new Clientes(name,email,number);
        }

        System.out.println("Occupied rooms.");
        for (Clientes clientes : roomArray) {
            if (clientes != null) {
                System.out.println("Number: " + clientes.getNumberGuest() + " | Name: " + clientes.getRoomGuest() + " | E-mail: " + clientes.getEmailGuest());
            }
        }
    }
}
