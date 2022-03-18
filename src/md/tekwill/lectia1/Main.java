package md.tekwill.lectia1;


import md.tekwill.lectia2.Persoana;

public class Main {

    public static void main(String[] args) {
	Angajat ion001;
    ion001 = new Angajat();

    ion001.nume = "Ion";
    ion001.varsta = 29;
    ion001.salariu = 2000;
    ion001.gen = "masculin";

        System.out.println(ion001.nume + " " + "are" + " " + "salariu de" + " " + ion001.salariu + " " + "si genul" + " " + ion001.gen);

        Persoana alex = new Persoana( "Smith", "Alexandru", 22, "masculin", 80);
        alex.afiseazaPersoana();
    }
}

