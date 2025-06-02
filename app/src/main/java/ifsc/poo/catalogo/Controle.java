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



        } while (opcao != 5);

    }

    public void mostrarMenu() {
        StringBuilder sb = new StringBuilder("MENU");
        sb.append("\n Selecione uma opção: ");
        sb.append("\n [1] Adicionar filme");
        sb.append("\n [2] Remover filme");
        sb.append("\n [3] Listar os dados de todos os filmes, por ordem");
        sb.append("\n [4] Buscar os filmes lançados em um determinado ano");
        sb.append("\n [5] Sair");
        
    }
    
}
