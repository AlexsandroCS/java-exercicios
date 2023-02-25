package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        try {
            System.out.println("ENTER ACCOUNT DATA:\n");

            System.out.print("Number: ");
            Integer number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            Double withdraw = sc.nextDouble();

            account.withdraw(withdraw);
            System.out.println(account);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("\nUnexpected error!");
        }
        sc.close();
    }
}