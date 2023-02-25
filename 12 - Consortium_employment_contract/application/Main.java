package application;

import entity.Employee;
import entity.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();

        List<Employee> listEmployeers = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++){
            System.out.printf("Employee: #%d %n",i+1);

            System.out.print("Employee is Outsourced? (y/n): ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per Hours: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                listEmployeers.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }
            else {
                listEmployeers.add(new Employee(name,hours,valuePerHour));
            }
        }

        System.out.println();

        System.out.println("PAYMENTS");
        for(Employee emp : listEmployeers){
            System.out.println(emp.getName()+" - "+String.format("$%.2f",emp.payment()));
        }
        sc.close();
    }
}