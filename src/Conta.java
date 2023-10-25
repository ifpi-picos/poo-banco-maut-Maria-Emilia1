import java.util.ArrayList;
import java.util.List;

public class Conta {
    private static int proximoNumeroConta = 1;
    private int numeroConta;
    private int numeroAgencia;
    private double saldo;
    private Cliente cliente;
    private List<Transacao> transacoes;

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

public Transacao getTransacoes() {
      return (Transacao) transacoes;
}

public void sacar(double valor) {
     if (valor > 0 && valor <= saldo) {
     saldo -= valor;
     System.out.print("saque de " + valor + " realizado com sucesso.");
     } else {
        System.out.print("Saque nao pode ser realizado. Saldo insuficiente.");
     }
}

public void depositar(double valor) {
      if (valor > 0) {
         saldo += valor;
         System.out.print("Deposito de " + valor + " realizado com sucesso");
     } else {
     System.out.print("Deposito invalido. O valor deve ser maior que zero");
     }
}

public void transferir(Conta destino, double valor) {
      if (valor > 0 && saldo >= valor) {
           saldo -= valor;
           destino.depositar(valor);
           System.out.print("Transferencia de" + valor + "para a conta" + destino.getNumeroConta() + "realizada com sucesso.");
     } else {
      System.out.print("Transferencia invalida. Verifique o valor e o saldo da conta de origem.");
     }
}
}
