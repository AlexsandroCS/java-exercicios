package application;

import java.util.Scanner;
import entity.Employee;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter your name: ");
        employee.Name = input.nextLine();

        System.out.print("Enter your total salary: ");
        employee.Salary = input.nextDouble();

        System.out.print("Enter the tax amount: ");
        employee.Tax = input.nextDouble();

        System.out.println("Employee: " + employee.Name + " | Salary: R$" + String.format("%.2f",employee.NetSalary()));

        System.out.print("Which percentage to increase salary: ");
        double PercentageSalary = input.nextDouble();
        employee.IncreaseSalary(PercentageSalary);

        System.out.println();
        System.out.println("Update data: " + employee);
        input.close();
    }
}
