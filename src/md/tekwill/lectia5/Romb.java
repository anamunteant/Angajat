package md.tekwill.lectia5;

public class Romb extends FiguraGeometrica {
    private double diagonalaMica;
    private double diagonalaMare;

    private double laturaMica;
    private double laturaMare;

    public void setDiagonalaMare(double diagonalaMare) {
        this.diagonalaMare = diagonalaMare;
    }

    public void setDiagonalaMica(double diagonalaMica) {
        this.diagonalaMica = diagonalaMica;
    }

    public void setLaturaMare(double laturaMare) {
        this.laturaMare = laturaMare;
    }

    public void setLaturaMica(double laturaMica) {
        this.laturaMica = laturaMica;
    }

    public double getDiagonalaMare() {
        return diagonalaMare;
    }

    public double getDiagonalaMica() {
        return diagonalaMica;
    }

    public double getLaturaMare() {
        return laturaMare;
    }

    public double getLaturaMica() {
        return laturaMica;
    }

    @Override
    public double returneazaPerimetru() {
        this.perimetruFigurii = 2 * laturaMica + 2 * laturaMare;
        return this.perimetruFigurii;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = diagonalaMare * diagonalaMica / 2;
        return this.ariaFigurii;
    }
}
