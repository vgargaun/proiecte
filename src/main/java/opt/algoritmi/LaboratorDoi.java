package opt.algoritmi;

import java.util.Random;
import java.util.Scanner;

public class LaboratorDoi {
    Integer[] sir;
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    public LaboratorDoi(){
        int n;
        System.out.println("Introduceti valoarea lui n:");
        n = input.nextInt();
        sir = new Integer[n];
        for(int i = 0; i < n; i++){
            sir[i] = rand.nextInt(1000);
        }
        System.out.println("Sirul initial");
        for(int i = 0; i < n; i++){
            System.out.print(sir[i]+" ");
        }
        sortare();
        System.out.println("\nSirul sortat");
        for(int i = 0; i < n; i++){
            System.out.print(sir[i]+" ");
        }
    }

    private void sortare() {
        int n = sir.length;
        for (int j = 1; j < n; j++) {
            int key = sir[j];
            int i = j-1;
            while ( (i > -1) && ( sir [i] > key ) ) {
                sir [i+1] = sir [i];
                i--;
            }
            sir[i+1] = key;
        }
    }
}
