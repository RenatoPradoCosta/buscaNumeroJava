import java.util.Random;
import java.util.Scanner;

public class BuscaNumero {
    public static int[] vetor;

    public static void sortearVetor() {
        Random gerador = new Random();
        vetor = new int [20];
        for (int i = 0; i < 20 ; i++){
            vetor[i] = 1 + gerador.nextInt(100);
        }
    }

    public static int procurarValor(int n) {
        for (int i = 0; i < 20; i++){
            if (n == vetor[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num, pos;
        Scanner teclado = new Scanner(System.in);
        sortearVetor();
        System.out.println("Digite um número:");
        num = teclado.nextInt();
        pos = procurarValor(num);
        if (pos >= 0){
            System.out.printf("Número encontrado na posição %d ",pos);
        } else {
            System.out.println("Número não encontrado");
        }
        teclado.close();
    }

    
}