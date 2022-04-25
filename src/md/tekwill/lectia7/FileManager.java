package md.tekwill.lectia7;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    static void scriereaInformatieiTextInFisier(String caleaCatreFisier, String dateSupuseScrierii) throws IOException {
        FileWriter lucruriObiectFileWriter = new FileWriter(caleaCatreFisier);
        lucruriObiectFileWriter.write(dateSupuseScrierii);
        lucruriObiectFileWriter.close();
    }
    static void alipireaInformatieiLaFisier(String caleaCatreFisier, String informatie){
        FileWriter lucruriObiectFileWriter = null;
        try {
            lucruriObiectFileWriter = new FileWriter(caleaCatreFisier, true);
            lucruriObiectFileWriter.write(informatie);
            lucruriObiectFileWriter.close();
        } catch (IOException e) {
            System.out.println("Exista o problema, dar programul nu opreste aici.");
        } finally {
            System.out.println("Acest bloc se executa mereu.");
        }

    }
    static String citireDateDinFisier(String caleaCatreFisier) throws IOException {
        return Files.readString(Path.of(caleaCatreFisier));
    }

}
