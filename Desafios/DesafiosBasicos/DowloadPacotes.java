package Desafios.DesafiosBasicos;

import java.util.Scanner;

public class DowloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        String barra = "/";
        String barraDownload = barra.repeat(tamanho);
        
        System.out.println(barraDownload);
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
    
}
