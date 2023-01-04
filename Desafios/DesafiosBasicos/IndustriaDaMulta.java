package Desafios.DesafiosBasicos;

import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        if (velocidadeAtual > 60){
          System.out.print("Foi multado");
        }else{
          System.out.print("Nao foi multado");
        }
        
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

    }
    
}
