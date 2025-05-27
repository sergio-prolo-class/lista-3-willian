package ifsc.poo.catalogo;

public class Filme {

    private String titulo;
    private int anoDeLancamento;
    private String genero;

    public Filme(String titulo, int anoDeLancamento, String genero) {

        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
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
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void validarTitulo(String titulo) {

    }

    public void validarAnoDeLancamento(int anoDeLancamento) {

        if (anoDeLancamento < 0) {
            this.anoDeLancamento = 0;
        }

    }

    public void validarGenero(String genero) {

    }

    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
