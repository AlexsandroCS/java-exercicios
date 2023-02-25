package application;

import entity.BancoAccout;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting registration.");

        int numberAccount;
        String nameAccount, initialValueAccount;
        double valueAccout;

        // Instanciamento.
        Scanner input = new Scanner(System.in);
        BancoAccout BancoAccout;

        System.out.print("Enter with account number: ");
        numberAccount = input.nextInt();
        input.nextLine();

        System.out.print("Enter account name: ");
        nameAccount = input.nextLine();

        System.out.print("Start account with value? [Y|N]: ");
        initialValueAccount = input.nextLine();

        if (Objects.equals(initialValueAccount, "Y")){
            System.out.print("Enter the starting value: ");
            valueAccout = input.nextDouble();

            BancoAccout = new BancoAccout(numberAccount, nameAccount, valueAccout);

        }else{
            System.out.println("Your account balance is: 0");
            BancoAccout = new BancoAccout(numberAccount, nameAccount);
        }

        System.out.println(BancoAccout.toString());
        System.out.println();

        // Deposit
        System.out.print("Enter the deposit amount: ");
        double valueAmount = input.nextDouble();
        BancoAccout.Deposit(valueAmount);
        System.out.println("Update account...");
        System.out.println(BancoAccout.toString());

        // Withdraw
        System.out.print("Enter the amount you want to withdraw: ");
        double valueWithdraw = input.nextDouble();
        BancoAccout.Withdraw(valueWithdraw);
        System.out.println("Update account...");
        System.out.println(BancoAccout.toString());
    }
}