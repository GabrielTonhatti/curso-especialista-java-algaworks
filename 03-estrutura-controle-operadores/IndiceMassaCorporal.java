import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Sexo (M - Masculino, F - Feminino): ");
        String sexo = entrada.nextLine();
        
        System.out.print("Peso: ");
        int peso = entrada.nextInt();
        
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        
        double imc = peso / (altura * altura);
        
        if (sexo.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso ideal.");
            } else if (imc >= 20.8 && imc < 26.4) {
                System.out.println("Peso ideal.");
            } else if (imc >= 26.5 && imc < 27.8) {
                System.out.println("Um pouco acima do peso.");
            } else if (imc >= 27.9 && imc < 31.1) {
                System.out.println("Acima do peso ideal.");
            } else {
                System.out.println("Obeso.");
            }
        } else {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso ideal.");
            } else if (imc < 25.8) {
                System.out.println("Peso ideal.");
            } else if (imc >= 25.9 && imc < 27.3) {
                System.out.println("Um pouco acima do peso.");
            } else if (imc >= 27.4 && imc < 32.3) {
                System.out.println("Acima do peso ideal.");
            } else {
                System.out.println("Obeso.");
            }
        }
    
        System.out.println("Fim do programa.");
        
    }

}
