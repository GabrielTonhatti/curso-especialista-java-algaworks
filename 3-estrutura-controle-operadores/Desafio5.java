import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean continuarOuParar = true;
        int somaPares = 0;
        int somaImpares = 0;
        do {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();
        
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
            
            System.out.print("Deseja continuar? ");
            continuarOuParar = entrada.nextBoolean();
        } while (continuarOuParar);

        System.out.printf("Soma dos números pares: %d%n", somaPares);
        System.out.printf("Soma dos números ímpares: %d%n", somaImpares);
    }
}
