package md.tekwill.lectia5;

public class Main {
    public static void main(String[] args) {
        Cerc cercIon = new Cerc();
        Patrat patratJohn = new Patrat(12.2);
        Romb rombDan = new Romb();

        cercIon.setRazaCercului(3.146787);
        System.out.println("Aria figurii manipulate cerc este: " + cercIon.returneazaAria());
        System.out.println("Perimetrul figurii manipulate cerc este: " + cercIon.returneazaPerimetru());

        System.out.println("Aria figurii manipulate patrat este: " + patratJohn.returneazaAria());
        System.out.println("Perimetrul figurii manipulate patrat este: " + patratJohn.returneazaPerimetru());

        rombDan.setDiagonalaMica(20);
        rombDan.setDiagonalaMare(30);

        rombDan.returneazaAria();
        System.out.println("Aria figurii manipulate romb este: " + rombDan.getAriaFigurii());

        rombDan.setLaturaMare(34);
        rombDan.setLaturaMica(24);

        rombDan.returneazaPerimetru();
        System.out.println("Perimetrul figurii manipulate romb este: " + rombDan.getPerimetruFigurii());

    }
}
