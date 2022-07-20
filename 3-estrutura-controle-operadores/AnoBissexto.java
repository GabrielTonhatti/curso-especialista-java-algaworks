import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();
        
        boolean multiploDe400 = ano % 400 == 0;
        boolean multiplosDe4ENaoDe100 = ano % 4 == 0 && ano % 100 != 0;
        boolean isBissexto = multiploDe400 || multiplosDe4ENaoDe100;
        
        System.out.printf("O ano %d é bissexto? %b%n", ano, isBissexto); 
    }

}
