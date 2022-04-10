package md.tekwill.lectia5;

public class Patrat extends FiguraGeometrica {
    public Patrat(double marimeaLaturiiAtribuite) {
        latura = marimeaLaturiiAtribuite;
    }

    private double latura;

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public double getLatura() {
        return latura;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = latura * latura;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetru() {
        this.perimetruFigurii = 4 * latura;
        return this.perimetruFigurii;
    }
}
