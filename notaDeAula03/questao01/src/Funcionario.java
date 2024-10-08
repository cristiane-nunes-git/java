public class Funcionario {
  
  protected String nome;
  protected int nasc;
  protected double salario;
  
  public Funcionario(String nome, int nasc, double salario) {
    setNome(nome);
    setNasc(nasc);
    setSalario(salario);
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getNasc() {
    return nasc;
  }
  public void setNasc(int nasc) {
    this.nasc = nasc;
  }
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
  
  public String informarSalario() {
    return String.format("\nO salário do funcionário '%s' é de R$ %.2f", getNome(), getSalario());
  }
  
  public String calcularIdade() {
    return String.format("\nO funcionário '%s' tem %d anos", getNome(), (2024 - getNasc()));
  }
}
