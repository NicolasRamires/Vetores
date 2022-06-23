package Vetores;

import java.util.Random;

public class VetoresAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeroAleatorio= new int[20];

        for(int i=0; i<numeroAleatorio.length; i++){
            int numero= random.nextInt(100);
            numeroAleatorio[i]=numero;
        }

        System.out.print("Numero Aleatorio: ");
        for(int numero : numeroAleatorio){
            System.out.print(numero+"  ");
        }

        System.out.print("\nSucessores dos numeros aleatorios: ");
        for(int numero:numeroAleatorio){
            System.out.print((numero+ 1)+"  ");
        }
    }
}
