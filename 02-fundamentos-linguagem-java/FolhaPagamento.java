import java.util.Scanner;

public class FolhaPagamento {
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();
        
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();
        
        System.out.print("Valor do desconto: ");
        double valorDesconto = entrada.nextDouble();
        
        double total = valorHora * horasTrabalhadas;
        double totalDevido = total - valorDesconto;
        double desconto = total - totalDevido;
                
        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, total);
        System.out.printf("Desconto: R$%.2f%n", desconto);
        System.out.printf("Total devido: R$%.2f%n", totalDevido);
    }

}
