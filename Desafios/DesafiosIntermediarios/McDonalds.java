package Desafios.DesafiosIntermediarios;

import java.util.Scanner;

public class McDonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes = ingredientes.split(";");
        
        for(int index = 0; index < listaIngredientes.length; index++) {
           System.out.println(listaIngredientes[index] + "\n");
        }
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
    }
    
}
