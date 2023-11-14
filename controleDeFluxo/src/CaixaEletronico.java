public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        }else
        System.out.println("saldo insuficiente");    

        
    }
}
