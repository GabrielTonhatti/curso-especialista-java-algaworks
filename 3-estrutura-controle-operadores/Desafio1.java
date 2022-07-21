import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        System.out.println("Digite 10 números pares: ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("#%dº número: ", i);
            int numero = entrada.nextInt();
            
            if (numero % 2 != 0) {
                continue;
            }
            
            soma += numero;
        }
        
        System.out.printf("Soma dos números pares digitados: %d%n", soma);
        
    }
}
