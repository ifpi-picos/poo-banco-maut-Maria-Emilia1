public class App {
    public static void main(String[] args) {

         Cliente cliente = new Cliente("Emilia", "123456789", "01/01/1990", "Rua Principal, 123");

         System.out.println("Nome do cliente: " + cliente.getNome());
         System.out.println("CPF: " + cliente.getCpf());
         System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
         System.out.println("Endereço: " + cliente.getEndereco());


         cliente.setNome("Ludymila");
         cliente.setDataNascimento("02/02/1985");
         cliente.setEndereco("Avenida Secundária, 456");


         System.out.println("\nInformações atualizadas do cliente:");
         System.out.println("Nome do cliente: " + cliente.getNome());
         System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
         System.out.println("Endereço: " + cliente.getEndereco());

         Conta conta = new Conta(123456, 654321, cliente, 0.0);

         conta.depositar(100.0);
         System.out.println("\nSeu saldo é:" + conta.getSaldo());
    }
}