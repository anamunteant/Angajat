package md.tekwill.lectia2;

public class Persoana {
    public Persoana(String prenumeAtribuit, String numeAtribuit, int varstaAtribuita, String genAtribuit, double greutateAtribuita){
        prenume = prenumeAtribuit;
        nume = numeAtribuit;
        varsta = varstaAtribuita;
        gen = genAtribuit;
        greutate = greutateAtribuita;
    }

    String prenume;
    String nume;
    int varsta;
    private String gen;
    double greutate;

    public void afiseazaPersoana(){
        System.out.println(prenume + " " + nume + " are " + varsta + " ani, este de genul " + gen + " si are " + greutate + " kilograme.");
    }

    public void seteazaGenPersoana(String genAtribuit){
        this.gen = genAtribuit;
        System.out.println("Genul a fost setat: " + gen);

    }

}
