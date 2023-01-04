package Desafios.DesafiosIntermediarios;

import java.util.Scanner;

public class BlueCold {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = (int)(Math.round((Double.valueOf(tamanhoDaFila)/ 2)));
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        System.out.println(pessoasNoCamarote+" pessoas no camarote");
    }
    
}
