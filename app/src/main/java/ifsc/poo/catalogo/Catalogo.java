package ifsc.poo.catalogo;

import java.util.HashSet;
import java.util.Set;

public class Catalogo {

    private Set<Filme> filmes;

    public Catalogo() {
        filmes = new HashSet<>();
    }

    public void adicionarFilme(Filme filme) {
        
        if (filmes.contains(filme)) {
            System.out.println("Inválido. Este filme já está no catálogo.");
        } else {
            filmes.add(filme);
            System.out.println("Filme adicionado.");
        }

    }

    public void removerFilme(String titulo) {

        boolean removido = filmes.removeIf(filme -> filme.getTitulo().equalsIgnoreCase(titulo));

        if (removido) {
            System.out.println("Filme removido.");
        } else {
            System.out.println("Inválido. Filme não encontrado.");
        }
        
    }

    public void listarTodosFilmesPorTitulo() {
        filmes.forEach(System.out::println);
    }

}
