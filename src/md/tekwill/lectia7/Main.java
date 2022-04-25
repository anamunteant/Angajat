package md.tekwill.lectia7;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String adresaFisierului = "src\\md\\tekwill\\lectia7\\fisierulDeLucru.txt";

        String dateDeScriere = "Test Data care se scrie in fisier";
        FileManager.scriereaInformatieiTextInFisier(adresaFisierului, dateDeScriere);

        String dateDeScriereDinIncercarea2 = "Alte date";
        FileManager.scriereaInformatieiTextInFisier(adresaFisierului, dateDeScriereDinIncercarea2);

        FileManager.alipireaInformatieiLaFisier(adresaFisierului, "Info 1 ");
        FileManager.alipireaInformatieiLaFisier(adresaFisierului, "Info 3 ");

        String continutFisierDejaCitit = FileManager.citireDateDinFisier(adresaFisierului);
        System.out.println(continutFisierDejaCitit);
        }

    }
}
