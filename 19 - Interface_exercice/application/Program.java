package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import model.services.UruguaiTaxService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("ENTRE COM OS DADOS DO ALUGUEL:");

        System.out.print("Modelo do veículo: ");
         String modeloCarro = sc.nextLine();

        System.out.print("Data e Hora da retirada do veículo - [00/00/0000 00:00]: ");
        LocalDateTime retiradaCarro = LocalDateTime.parse(sc.nextLine(),fmt);

        System.out.print("Data e Hora da devolução do veículo - [00/00/0000 00:00]: ");
        LocalDateTime entregaCarro = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental carRental = new CarRental(retiradaCarro,entregaCarro,new Vehicle(modeloCarro));

        System.out.print("Entre com um preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com um preço por dia: ");
        double pricePerDay = sc.nextDouble();

        System.out.print("De qual país o imposto dever ser aplicado | Digite [B] para Brasil ou [U] para Uruguai: ");
        char confirmaTax = sc.next().charAt(0);

        RentalService rentalService = null;

        if (confirmaTax == 'B'){
            rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());
        }
        else{
            rentalService = new RentalService(pricePerHour,pricePerDay,new UruguaiTaxService());
        }

        rentalService.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f",carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f",carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}