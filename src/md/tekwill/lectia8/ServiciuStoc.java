package md.tekwill.lectia8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte amintiriDinCopilarie = new Carte("Amintiri din Copilarie", "Ion Creanga", 3939, 56);
        Carte moaraCuNoroc = new Carte("Moara cu Noroc", "Nicolae Labis", 44939, 96);
        Carte ion = new Carte("Ion", "Ion D", 444399, 126);
        Carte veverita = new Carte("Veverita", "Baba Dochia", 139, 26);
        Carte laculLebedelor = new Carte("Lacul Lebedelor", "Tceaicovski", 335639, 156);

        Stoc magazinulDeLaBotanica = new Stoc(1, "str Independentei 3");
        Stoc magazinulDeLaCiocana = new Stoc(2, "str Sadoveanu 2");

        magazinulDeLaBotanica.adaugaCarteInStoc(amintiriDinCopilarie);
        magazinulDeLaBotanica.adaugaCarteInStoc(ion);
        magazinulDeLaBotanica.adaugaCarteInStoc(veverita);

        System.out.println("Carti in magazinul de la botanica avem: " + magazinulDeLaBotanica.numarDeCartiInStoculCurent());

        magazinulDeLaBotanica.stergeCarteaDinStoc(veverita);
        System.out.println("Carti in magazinul de la botanica avem: " + magazinulDeLaBotanica.numarDeCartiInStoculCurent());

        System.out.println(magazinulDeLaBotanica.esteStoculGol());
        System.out.println(magazinulDeLaBotanica.existaCarteaInAcestStoc(veverita));

    }
}
