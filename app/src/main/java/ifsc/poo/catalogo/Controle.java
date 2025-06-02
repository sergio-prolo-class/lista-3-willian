package ifsc.poo.catalogo;

import java.util.Scanner;

public class Controle {

    private Catalogo catalogo;

    Scanner teclado = new Scanner(System.in);

    public Controle() {
        catalogo = new Catalogo();
    }

    public void executar() {
        int opcao = 0;

        do {
            mostrarMenu();
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    adicionarFilme();
                    break;

                case 2:
                    removerFilme();
                    break;
                
                case 3:
                    System.out.println();
                    catalogo.listarTodosFilmesPorTitulo();
                    System.out.println();
                    break;
            
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 8);

    }

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("Selecione uma opção: ");
        System.out.println("[1] Adicionar filme");
        System.out.println("[2] Remover filme");
        System.out.println("Listar os filmes por:");
        System.out.println("    [3] Alfabética de título");
        System.out.println("    [4] Alfabética de gênero");
        System.out.println("    [5] De ano de lançamento");
        System.out.println("[6] Listar os dados de todos os filmes, por ordem");
        System.out.println("[7] Buscar os filmes lançados em um determinado ano");
        System.out.println("[8] Sair");
    }

    public void adicionarFilme() {
        System.out.println("Digite o título: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o gênero: ");
        String genero = teclado.nextLine();


        Filme filme = new Filme(titulo, anoDeLancamento, genero);

        catalogo.adicionarFilme(filme);

    }

    public void removerFilme() {
        System.out.println("Digite o título do filme que deseja removê-lo: ");
        String titulo = teclado.nextLine();

        catalogo.removerFilme(titulo);
    }
}
