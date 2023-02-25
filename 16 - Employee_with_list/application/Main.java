package application;

import entity.Employee;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Employee> listaFuncionarios = new ArrayList<>();

        System.out.print("Digite a quantidade de funcinários: ");
        int numFuncionarios = scan.nextInt();

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.printf("Funcionário %d %n", i + 1);

            System.out.print("Informe um ID: ");
            Integer a = scan.nextInt();

            scan.nextLine();

            System.out.print("Informe um Nome: ");
            String b = scan.nextLine();

            System.out.print("Informe um Salário: ");
            Double c = scan.nextDouble();

            Employee cadastro = new Employee(a, b, c);
            listaFuncionarios.add(cadastro);
        }

        System.out.print("Digite o ID do funcionário que vai ter um aumento no salário: ");
        int numIDFuncionario = scan.nextInt();

        Integer position = positionID(listaFuncionarios,numIDFuncionario);

        if (position == null){
            System.out.println("ID não encontrado");
        }
        else{
            System.out.print("Informe a porcentagem que o funcionário vai ter seu salário aumentado: ");
            double bonusSlary = scan.nextDouble();

            listaFuncionarios.get(position).increaseSalary(bonusSlary);
        }

        System.out.println();
        System.out.println("Lista de funcionários");

        for (Employee x: listaFuncionarios){
            System.out.println(x);
        }

        scan.close();
    }

    public static Integer positionID(List<Employee> list, int id){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}