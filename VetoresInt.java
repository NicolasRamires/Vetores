package Vetores;

public class VetoresInt {
    public static void main(String[] args){
    int[] vet={5,4,3,2,1,0};
    int count=0;

        System.out.print("Vetor ordem de entrada: " );
        while(count<= vet.length-1){
        System.out.print(vet[count]+"");
        count++;}

        System.out.print("\nVetor ordem inversa: ");
        for(int i= vet.length -1; i>=0; i--){
            System.out.print(vet[i]+"");
        }
    }
}
