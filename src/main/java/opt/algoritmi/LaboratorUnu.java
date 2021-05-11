package opt.algoritmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaboratorUnu {
    Scanner input = new Scanner(System.in);
    private List<String> sirulUnu = new ArrayList<>();
    private List<String> sirulDoi = new ArrayList<>();

    public LaboratorUnu() {
        System.out.println("Introduceti lungimea sirurilor:");
        int size = input.nextInt();
        System.out.println("Initializarea primului sir");
        initializare(sirulUnu, size);
        System.out.println("Initializarea al doilea sir");
        initializare(sirulDoi, size);
        test(size);

    }

    private void initializare(List<String> sir, int size) {
        System.out.println("Introduceti datele sirului");
        for (int i = 0; i < size; i++) {
            System.out.print("\nelementul " + i + ": ");
            String element = input.next();
            sir.add(element);
        }
    }

    private void test(int size){
        boolean check = true;
        for(int i = 0; i < size; i++){
            if (!sirulUnu.get(i).equals(sirulDoi.get(size-i-1))) {
                check = false;
                System.out.println("Sirurul nu poate fi obtinut din celalalt printr-o singura rasturnare a unei secvente finale");
                break;
            }
        }
        if(check) System.out.println("Sirurul poate fi obtinut din celalalt printr-o singura rasturnare a unei secvente finale");
    }
}
