public class Conta {
  
  protected String titular;
  protected double saldo;
  
  
  public Conta(String titular) {
    setSaldo(0.0);
    setTitular(titular);
  }
  
  
  public double getSaldo() {
    return saldo;
  }
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  public String getTitular() {
    return titular;
  }
  
  public void setTitular(String titular) {
    this.titular = titular;
  }
  
  
  public void depositar(double valor) {
    if (valor > 0) {
      setSaldo(getSaldo() + valor);
    }
  }
  
  
  public boolean sacar(double valor) {
    if (valor > 0 && getSaldo() >= valor) {
      setSaldo(getSaldo() - valor);
      return true;
    }
    return false;
  }
  
  public void exibirDados() {
    System.out.printf("Titular: %s\nSaldo: R$ %.2f\n", getTitular(), getSaldo());
  }
}