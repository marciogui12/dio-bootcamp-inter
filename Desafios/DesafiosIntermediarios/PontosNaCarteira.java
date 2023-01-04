package Desafios.DesafiosIntermediarios;

import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        if (velocidade <= 80) {
          System.out.println(multas + " multas. Nao levou pontos na carteira");
          
        }else if(velocidade > 80 && multas < 2){
          multas++;
           System.out.println(multas + " multas. Nao levou pontos na carteira");
        } else{
          multas++;
          System.out.println(multas + " multas. Levou pontos na carteira");
          
        }
    }
}
