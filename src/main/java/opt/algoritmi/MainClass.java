package opt.algoritmi;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Laborator:");
            System.out.println("Nr.1: Rezolvarea algoritmică a problemelorAssignment");
            System.out.println("Nr.2: Algoritmi de sortareAssignment");
            System.out.println("Nr.3: Tehnici de rezolvare algoritmică a problemelorAssignment");
            int nrLaborator = input.nextInt();
            System.out.println("");
            switch (nrLaborator) {
                case 1: {
                    System.out.println("Nr.1: Rezolvarea algoritmică a problemelorAssignment");
                    new LaboratorUnu();
                    break;
                }
                case 2: {
                    System.out.println("Nr.2: Algoritmi de sortareAssignment");
                    new LaboratorDoi();
                    break;
                }
                case 3: {
                    System.out.println("Nr.3: Tehnici de rezolvare algoritmică a problemelorAssignment");
                    new LaboratorTrei();
                    break;
                }

            }
            System.out.println("\nPentru a esi tastati 0, pentru a continua tastati 1");
            try {
                int n = input.nextInt();
                if (n == 0) check = false;
            } catch (Exception e) {

            }
        }
    }
}
