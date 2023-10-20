import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

       System.out.println("Por favor digite o número da agência");
       String agencia = input.nextLine();

       System.out.println("Por favor digite o número da conta");
       int numero = input.nextInt();
       input.nextLine();

       System.out.println("Por favor digite o nome do cliente");
       String nomeCliente = input.nextLine();

       System.out.println("Por favor digite o saldo");
       double saldo = input.nextDouble();

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

       System.out.println("\nInformações da Conta:");
       System.out.println("Agência: " + conta.getAgencia());
       System.out.println("Número da Conta: " + conta.getNumero());
       System.out.println("Nome do Cliente: " + conta.getNomeCliente());
       System.out.println("Saldo: " + conta.getSaldo());

       input.close();
    }
}
