package md.tekwill.lectia6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ContulPersoanei contul001 = new ContulPersoanei();
        contul001.setId(100022);
        contul001.setNumePersoana("James Bond");
        contul001.setSumaCurenta(30200);

        System.out.println("Introduceti numarul de persoane: ");

        Scanner cititor = new Scanner(System.in);
        int numarDePersoane = cititor.nextInt();
        System.out.println("Soldul curent impartit la " + numarDePersoane + "persoane= " + contul001.imparteSoldulLaNPersoane(numarDePersoane));

        contul001.transferCatreOPersoanaAiCareiDateSuntIntrunFisierAruncare("C:\\Users\\Admin\\Desktop\\TAC\\proiecte\\test\\angajat\\src\\md\\tekwill\\lectia2\\Persoana.java");

        contul001.transferCatreOPersoanaAiCareiDateSuntIntrunFisierTratare("C:\\Users\\Admin\\Desktop\\TAC\\proiecte\\test\\angajat\\src\\md\\tekwill\\lectia2\\Persoana.java");
    }
}
