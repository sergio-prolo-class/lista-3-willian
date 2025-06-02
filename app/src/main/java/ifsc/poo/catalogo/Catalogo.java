package ifsc.poo.catalogo;

import java.util.HashSet;
import java.util.Set;

public class Catalogo {

    private Set<Filme> filmes;

    public Catalogo() {
        filmes = new HashSet<>();
    }

    public boolean adicionarFilme(Filme filme) {
        return filmes.add(filme);
    }

    public boolean removerFilme(String titulo) {
        return filmes.removeIf(filme -> filme.getTitulo().equalsIgnoreCase(titulo));
    }

}
