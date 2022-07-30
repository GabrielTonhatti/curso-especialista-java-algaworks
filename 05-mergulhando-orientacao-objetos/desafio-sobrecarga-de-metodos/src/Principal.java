public class Principal {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        double numero4 = 10.0;
        double numero5 = 20.0;
        double numero6 = 30.0;

        System.out.println(NumeroUtil.obterMaiorNumero(numero1, numero2));
        System.out.println(NumeroUtil.obterMaiorNumero(numero1, numero2, numero3));
        System.out.println(NumeroUtil.obterMaiorNumero(numero4, numero5));
        System.out.println(NumeroUtil.obterMaiorNumero(numero4, numero5, numero6));
    }

}
