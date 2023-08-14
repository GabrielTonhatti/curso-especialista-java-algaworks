import java.util.Arrays;
import java.util.Objects;

public class Principal {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        if (args.length <= 1) {
            System.out.printf("Use: java %s [pt|en] [seu nome]", Principal.class.getName());
        } else if (Objects.equals(args[0], "en")) {
            System.out.printf("Hello, %s!%n", args[1]);
        } else if (Objects.equals(args[0], "pt")) {
            System.out.printf("Olá, %s!%n", args[1]);
        }
    }
}
