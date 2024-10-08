public class ContaPoupanca extends Conta {
  
  private double selic;
  
  public ContaPoupanca(String titular, double selic) {
    super(titular);
    setSelic(selic);
  }
  
  public double getSelic() {
    return selic;
  }
  
  public void setSelic(double selic) {
    this.selic = selic;
  }
  
  public void calcularRendimento() {
    double rendimento;
    
    if (getSelic() > 8.5) {
      rendimento = 0.005 * getSaldo();
    } else {
      rendimento = 0.007 * getSelic() * getSaldo();
    }
    
    System.out.println("Rendimento: R$ " + String.format("%.2f", rendimento));
  }
  
  @Override
  public void exibirDados() {
    System.out.println("Conta Poupança\nTitular: " + getTitular() + "\nSaldo: R$ " + String.format("%.2f", getSaldo()));
  }
}