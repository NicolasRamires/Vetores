package Vetores;

import java.util.Scanner;

public class VetoresString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes  = 0;
        int cout=0;


        do{
            System.out.println("Letra: ");
            String letra= scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")))
            {consoantes[cout]=letra;
            quantidadeConsoantes++;}
            cout++;
        }while(cout<consoantes.length);

        System.out.print("Consoantes: " );

        for(String consoante:consoantes){
            if(consoante != null)
                System.out.print(consoante+" ");}

        System.out.println("Quantidade de Consoantes: "+quantidadeConsoantes);







    }
}
