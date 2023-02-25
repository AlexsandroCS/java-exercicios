package entity;

public class Employee {
    public String Name;
    public double Salary;
    public double Tax;

    public double NetSalary(){
        return Salary - Tax;
    }

    public void IncreaseSalary(double Percentage){
        Salary += Salary * Percentage/100.0;
    }

    public String toString(){
        return "Employee: " + Name + " | Salary: " + String.format("%.2f",NetSalary());
    }
}
