package Desafios.DesafiosIntermediarios;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        array = frase.split("/");

        System.out.print("Imovel: ");
        for (int i=0;i<=array.length-1;i++){
            if(i==1){
                System.out.print("R$");
            }
            System.out.print(array[i]+" ");
        }
        
       
    }
    
}
