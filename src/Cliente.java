public class Cliente {
    private String nome;
    private final String cpf;
    private String dataNascimento;
    private String endereco;


     public Cliente(String nome, String cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;

    }
    public String getNome() {
         return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
   }

   public String getCpf() {
    return cpf;
}

public String getDataNascimento() {
    return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}
}
