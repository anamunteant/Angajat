package md.tekwill.lectia6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ContulPersoanei {

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else System.out.println("Soldul nu poate fi negativ.");
    }

    public String getNumePersoana() {
        return this.numePersoana;
    }

    public int getId() {
        return id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Sold insuficient");
        }
        return (sumaCurenta - sumaExtrasa);
    }

    public int imparteSoldulLaNPersoane(int numarDePersoane) {
        int result = 0;
        try {
            result = (int) sumaCurenta / numarDePersoane;
        } catch (ArithmeticException exceptieObiect) {
            System.out.println("Ai introdus valoarea 0, deci returnam 0");
        }
        return result;
    }

    public void transferCatreOPersoanaAiCareiDateSuntIntrunFisierAruncare(String directoriuCuFisierulDat) throws FileNotFoundException {
        File datelePentruTransfer001 = new File(directoriuCuFisierulDat);
        FileReader fileReader001 = new FileReader(datelePentruTransfer001);
    }

    public void transferCatreOPersoanaAiCareiDateSuntIntrunFisierTratare(String directoriuCuFisierulDat) {
        File datelePentruTransfer001 = new File(directoriuCuFisierulDat);
        try {
            FileReader fileReader001 = new FileReader(datelePentruTransfer001);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Please review the entered data");
        } finally {
            System.out.println("Acest cod este rulat indiferent de ce se intampla mai sus");
        }
    }
}