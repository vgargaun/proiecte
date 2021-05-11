package opt.algoritmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaboratorTrei {
    Scanner input = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    Integer[] sirulUnu;
    Integer[] sirulDoi;


    public LaboratorTrei() {
        System.out.println("Introduceti lungimea sirurilor:");
        int size = input.nextInt();
        sirulUnu = new Integer[size];
        sirulDoi = new Integer[size];
        System.out.println("Initializarea primului sir");
        initializare(sirulUnu, size);
        System.out.println("Initializarea al doilea sir");
        initializare(sirulDoi, size);
        common(size);
    }

    private void initializare(Integer[] sir, int size) {
        System.out.println("Introduceti datele sirului");
        for (int i = 0; i < size; i++) {
            System.out.print("\nelementul " + i + ": ");
            int element = input.nextInt();
            sir[i] = element;
        }
    }

    private void sortare(Integer[] sir) {
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
    public void common(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(sirulUnu[i]==sirulDoi[j]) list.add(sirulUnu[i]);
            }
        }
        System.out.println("Elementele comune sunt:");
        list.forEach(n ->{
            System.out.print(n+" ");
        });
    }




}
