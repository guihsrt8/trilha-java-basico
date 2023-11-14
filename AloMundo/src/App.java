public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x = 10;
        double y = x / 3;
        System.out.println("o resultado da divisao é " + y);

        int idade = 20, anoAtual = 2021;
        int anoNascimento = anoAtual - idade;
        System.out.println("o ano de nascimento é: " + anoNascimento);

        int b = 2;
        int c = 3;

        if (b == 2 && c < 10 ) {
            System.out.println("condição a ");
        } else if (b >= 3 || c <= 5) {
            System.out.println("condição b");
        } else {
            System.out.println("condição c");
        }

         int z = 10;
    while (z > 0) {
        System.out.println(z);
        z--;
     }

     for (int t = 1; t <= 10; t++) {
        System.out.println(t);
     }
   }
}

