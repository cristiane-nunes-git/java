public class Gerente extends Funcionario {
  
  private String projeto;
  
  public Gerente(String nome, int nasc, double salario, String projeto) {
    super(nome, nasc, salario);
    setProjeto(projeto);
  }
  
  public String getProjeto() {
    return projeto;
  }
  public void setProjeto(String projeto) {
    this.projeto = projeto;
  }
  
  public String informarProjeto() {
    return String.format("\nO gerente %s está trabalhando no projeto '%s'", getNome(), getProjeto());
  }
}
