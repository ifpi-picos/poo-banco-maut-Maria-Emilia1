public class Transacao {
    private String descricao;
    private Double valor;

     public Transacao(String descricao, double valor) {
          this.descricao = descricao;
          this.valor = valor;
     }   

     public String getDescricao() {
          return descricao;
     }

     public Double getValor() {
          return valor;
     }

}
