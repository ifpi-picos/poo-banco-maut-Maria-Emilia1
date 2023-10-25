public class ContaC extends Conta { 
    private double chequeEspecial;
    private int transferenciaSemTaxa;


    public ContaC(int numeroAgencia, int numeroConta, Cliente cliente, double chequeEspecial, Notificacao notificacao,double saldo) {
          super(numeroAgencia, numeroConta, cliente,saldo);
          this.chequeEspecial = chequeEspecial;
          this.transferenciaSemTaxa = 0;
    }

    public double chequeEspecial() {
          return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
         this.chequeEspecial = chequeEspecial;
    }

    public void transferTax1 (Conta contaDestino, double valor) {
         if (valor > (getSaldo() + chequeEspecial)) {
             System.out.print("Saldo Insuficiente.");
             return;
         }
    
         if (transferenciaSemTaxa < 2) {
             super.transferir(contaDestino, valor);
             transferenciaSemTaxa++;
         } else {
             double taxa = valor * 0.10;
             if (getSaldo () >= valor + taxa) {
                 super.transferir(contaDestino, valor + taxa);
            } else {
                 System.out.print("Saldo insuficiente.");
            }
        }
    }

    public void transfer(Conta contaDestino, double valor) {
         transferTax1(contaDestino, valor);
    }

    public String toString() {
         return "\nAgencia: " + getNumeroAgencia() +
                "\nConta: " + getNumeroConta() +
                "\nCheque Especial: " + chequeEspecial();
    }

    }


