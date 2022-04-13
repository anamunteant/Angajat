package md.tekwill.lectia5;

public abstract class FiguraGeometrica {

    protected double ariaFigurii;
    protected double perimetruFigurii;

    public abstract double returneazaAria();

    public abstract double returneazaPerimetru();

    public double getAriaFigurii() {
        return ariaFigurii;
    }

    public double getPerimetruFigurii() {
        return perimetruFigurii;
    }
}

