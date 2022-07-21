import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite números inteiros: ");
        
        int soma = 0;
        while (soma < 100) {
            System.out.print("Informe o próximo número: ");
            int numero = entrada.nextInt();
            
            soma += numero;          
        }
        
        System.out.printf("Soma dos números: %d%n", soma);
    }
}
