public class Animal {
  
  protected String nome;
  protected String raca;
  
  
  public Animal() {
    setNome("Sem nome");
    setRaca("Sem raça");
  }
  
  public Animal(String nome) {
    setNome(nome);
    setRaca("Sem raça");
  }
  
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }
  public void setRaca(String raca) {
    this.raca = raca;
  }
  public String getRaca() {
    return this.raca;
  }
  
  public void caminha() {
    System.out.printf("\nO animal '%s' está caminhando\n", getNome());
  }
}
