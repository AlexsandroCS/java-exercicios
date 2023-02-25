package application;

import entity.Department;
import entity.HourContract;
import entity.Worker;
import entity.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataModificada = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String workerName = sc.next();

        System.out.print("Level: ");
        String workerLevel = sc.next();

        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Enter contract #%d data:%n",i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = dataModificada.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration: ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.printf("%nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+ monthAndYear+": "+String.format("%.2f",worker.income(year,month)));
        sc.close();
    }
}