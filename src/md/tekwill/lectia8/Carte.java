package md.tekwill.lectia8;

public class Carte {
    public Carte(String titluAtribuit, String autorAtribuit, long numarDeSerieAtribuit, int paginiAtribuit) {
        titlu = titluAtribuit;
        autor = autorAtribuit;
        numarDeSerie = numarDeSerieAtribuit;
        pagini = paginiAtribuit;
    }

    private String titlu;
    private String autor;
    private long numarDeSerie;
    private int pagini;

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", numarDeSerie=" + numarDeSerie +
                '}';
    }
}
