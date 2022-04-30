package md.tekwill.lectia8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    public Stoc(int stockIdAtribuit, String adresaMagazinAtribuit) {
        stockId = stockIdAtribuit;
        adresaMagazin = adresaMagazinAtribuit;
        cartileDinStoc = new ArrayList<>();
    }

    private int stockId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc;

    public void adaugaCarteInStoc(Carte carteAdaugata) {
        this.cartileDinStoc.add(carteAdaugata);
        System.out.println(carteAdaugata.toString() + "A fost adaugata cu succes in stocul: " + stockId + " de pe adresa "
                + adresaMagazin);
    }

    public void stergeCarteaDinStoc(Carte cartePeCareOStergem) {
        boolean carteaAFostStearsa = this.cartileDinStoc.remove(cartePeCareOStergem);
        if (carteaAFostStearsa) {
            System.out.println(cartePeCareOStergem.toString() + " a fost stearsa cu succes din stocul: " + stockId + " de pe adresa "
                    + adresaMagazin);
        } else {
            System.out.println("Cartea nu a fost stearsa.");
        }
    }

    public boolean existaCarteaInAcestStoc(Carte carteInvestigata) {
        return this.cartileDinStoc.contains(carteInvestigata);
    }

    public int numarDeCartiInStoculCurent() {
        return this.cartileDinStoc.size();
    }

    public boolean esteStoculGol() {
        return this.cartileDinStoc.isEmpty();
    }
}

