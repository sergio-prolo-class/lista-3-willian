package ifsc.poo.catalogo;

public class Filme {

    private String titulo;
    private int anoDeLancamento;
    private String genero;

    private static final String TITULO_PADRAO = "Título indefinido";
    private static final int ANO_DE_LANCAMENTO_PADRAO = 0;
    private static final String GENERO_PADRAO = "Gênero indefinido";

    public Filme(String titulo, int anoDeLancamento, String genero) {

        this.validarTitulo(titulo);
        this.validarAnoDeLancamento(anoDeLancamento);
        this.validarGenero(genero);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setTitulo(String titulo) {
        validarTitulo(titulo);
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        validarAnoDeLancamento(anoDeLancamento);
    }

    public void setGenero(String genero) {
        validarGenero(genero);
    }

    public void validarTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            this.titulo = TITULO_PADRAO;
        }
        this.titulo = titulo;
    }

    public void validarAnoDeLancamento(int anoDeLancamento) {
        if (anoDeLancamento < 0) {
            this.anoDeLancamento = ANO_DE_LANCAMENTO_PADRAO;
        }
        this.anoDeLancamento = anoDeLancamento;

    }

    public void validarGenero(String genero) {
        if (genero.trim().isEmpty()) {
            this.genero = GENERO_PADRAO;
        }
        this.genero = genero;
    }

    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
