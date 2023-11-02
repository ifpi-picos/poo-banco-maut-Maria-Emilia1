import java.util.ArrayList;
import java.util.List;

// Conta deveria ser abstrata para não permitir criar instancias a partir dela
public class Conta {
     private static int proximoNumeroConta = 1;
     private int numeroConta;
     private int numeroAgencia;
     private double saldo;
     private Cliente cliente;
     private List<Transacao> transacoes;
     // está faltando o atributo de Notificacao

     public Conta(int numeroAgencia, int numeroConta, Cliente cliente, Double saldo) {
          this.numeroConta = proximoNumeroConta++;
          this.numeroAgencia = numeroAgencia;
          this.cliente = cliente;
          this.saldo = saldo;
          this.transacoes = new ArrayList();
     }

     public int getNumeroConta() {
          return numeroConta;
     }

     public int getNumeroAgencia() {
          return numeroAgencia;
     }

     public double getSaldo() {
          return saldo;
     }

     public Cliente getCliente() {
          return cliente;
     }

     // método com tipo de retorno incorreto, deveria retonar a lista de transacoes ao inves de um
     // objeto único
     public Transacao getTransacoes() {
          return (Transacao) transacoes;
     }

     public void sacar(double valor) {
          if (valor > 0 && valor <= saldo) {
               saldo -= valor;
               System.out.println("saque de " + valor + " realizado com sucesso.");
          } else {
               System.out.println("Saque nao pode ser realizado. Saldo insuficiente.");
          }
     }

     public void depositar(double valor) {
          if (valor > 0) {
               saldo += valor;
               System.out.println("Deposito de " + valor + " realizado com sucesso");
          } else {
               System.out.println("Deposito invalido. O valor deve ser maior que zero");
          }
     }

     public void transferir(Conta destino, double valor) {
          if (valor > 0 && saldo >= valor) {
               saldo -= valor;
               destino.depositar(valor);
               System.out.println("Transferencia de" + valor + "para a conta"
                         + destino.getNumeroConta() + "realizada com sucesso.");
          } else {
               System.out.println(
                         "Transferencia invalida. Verifique o valor e o saldo da conta de origem.");
          }
     }
}
