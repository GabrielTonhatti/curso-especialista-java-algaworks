import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        System.out.print("Digite um número positivo: ");
        int numero = entrada.nextInt();
        int quantidadeDivisores = 0;
        for (int i = 1; i <= numero; i++) {            
            if (numero % i == 0) {
                quantidadeDivisores++;
            }
        }
        
        String isNumeroPrimo = quantidadeDivisores == 2 ? "é um número primo" : "não é um número primo";
        System.out.printf("O número: %d %s%n", numero, isNumeroPrimo);
    }
}
