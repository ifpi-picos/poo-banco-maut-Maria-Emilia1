public class ContaP extends Conta {
    private double taxaTransferencia;
    private double taxaSaque;
    private double rendimento;

    public ContaP(int numeroAgencia, int numeroConta, Cliente cliente, double taxaTransferencia, double taxaSaque, double rendimento, double saldo, Notificacao notificacao) {
        super(numeroAgencia, numeroConta, cliente, saldo);
        this.taxaTransferencia = taxaTransferencia;
        this.taxaSaque = taxaSaque;
        this.rendimento = rendimento;
    }

    public double getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public void setTaxaTransferencia(double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void realizarSaque(double valor) {
        if (valor > getSaldo()) {
             System.out.print("Saldo Insuficiente.");
        } else {
            super.sacar(valor);
            double taxa = valor * taxaSaque;
            super.sacar(taxa);
        }
    }

    public void transferir(Conta contaDestino, double valor) {
         if (valor > getSaldo()) {
        System.out.print("Saldo Insuficiente.");
        } else {
        super.sacar(valor);
        double taxa = valor * taxaTransferencia;
        super.sacar(taxa);
        contaDestino.depositar(valor);
        }
    }

public void aplicarRendimento() {
     double renda = getSaldo() * (rendimento / 100.0);
     super.depositar(renda);
}         

public String toString() {
     return "\nAgencia: " + getNumeroAgencia() +
            "\nConta: " + getNumeroConta() +
            "\nTaxa de Transferencia: " + taxaTransferencia +
            "\nTaxa de Saque: " + taxaSaque + 
            "\nRendimento: " + rendimento;
}
}
