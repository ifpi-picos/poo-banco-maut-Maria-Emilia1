public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Emilia", "123456789", "01/01/1990", "Rua Principal, 123");


        // Não deveria criar objetos do tipo Conta
        Conta cc = new ContaC(0, 0, cliente, 100, new Sms(), 0);
        Conta cc2 = new ContaC(0, 0, cliente, 100, new Sms(), 0);
        Conta cp = new ContaP(0, 0, cliente, 0.1, 0.1, 0.1, 0, new Email());

        // não está enviando notificações
        cc.depositar(100);
        System.out.println(cc.getSaldo());
        cc.sacar(50);
        System.out.println(cc.getSaldo());
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        // não está cobrando a taxa de transferencia
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        // não está utilizando o limite de cheque especial
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        System.out.println(cc.getSaldo());
        System.out.println(cc2.getSaldo());
        // System.out.println(cc.getTransacoes());

        cp.depositar(100);
        cp.sacar(10);

        System.out.println(cp.getSaldo());

    }
}
