import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutME {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o seu nome");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura");
        Double altura = scanner.nextDouble();

        System.out.println("olá me chamo " + nome.toLowerCase() + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + " cm ");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.err.println("os campos idade e altura precisam ser numéricos");
        }
    }
}
