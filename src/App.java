public class App {
    public static void main(String[] arg) {
      
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
    }
 }
