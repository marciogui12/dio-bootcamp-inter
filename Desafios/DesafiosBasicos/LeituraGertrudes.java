package Desafios.DesafiosBasicos;

import java.util.Scanner;

public class LeituraGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int tempoEstimadoDeLeitura = paginas/paginasLidas;
        System.out.print(tempoEstimadoDeLeitura+ " dias");
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

    }
    
}
