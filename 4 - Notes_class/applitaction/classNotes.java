package application;

import java.util.Scanner;
import entity.Notes;

public class classNotes {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Notes notes = new Notes();

        System.out.print("Student name: ");
        notes.name = input.nextLine();

        System.out.print("First period grade: ");
        notes.note1 = input.nextDouble();

        System.out.print("Second period grade: ");
        notes.note2 = input.nextDouble();

        System.out.print("Third period grade: ");
        notes.note3 = input.nextDouble();

        System.out.printf("Final grade: %.2f%n",notes.finalGrade());

        if (notes.finalGrade() < 60.0){
            System.out.println("You don't pass");
            System.out.printf("Missing %.2f points%n",notes.missingPoints());
        }
        else {
            System.out.println("You pass.");
        }
        input.close();
    }
}
