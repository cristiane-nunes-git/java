public class Programador extends Funcionario {
  
  private String linguagem;
  
  public Programador(String nome, int nasc, double salario, String linguagem) {
    super(nome, nasc, salario);
    setLinguagem(linguagem);
  }
  
  public String getLinguagem() {
    return linguagem;
  }
  public void setLinguagem(String linguagem) {
    this.linguagem = linguagem;
  }
  
  public String informarLinguagem() {
    return String.format("\nO programador %s trabalha com a linguagem '%s'", getNome(), getLinguagem());
  }
}
