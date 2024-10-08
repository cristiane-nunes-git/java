public class ContaCorrente extends Conta {
  
  private double CHEQUE_ESPECIAL;
  
  public ContaCorrente(String titular) {
    super(titular);
    setChequeEspecial(1000);
  }
  
  public double getChequeEspecial() {
    return CHEQUE_ESPECIAL;
  }
  
  public void setChequeEspecial(double chequeEspecial) {
    this.CHEQUE_ESPECIAL = chequeEspecial;
  }
  
  public boolean usarChequeEspecial(double valor) {
    if (valor > 0 && getSaldo() + getChequeEspecial() >= valor) {
      setSaldo(getSaldo() - valor);
      if (getSaldo() < 0) {
        setChequeEspecial(getChequeEspecial() + getSaldo());
        setSaldo(0);
      }
      return true;
    }
    return false;
  }
  
  @Override
  public void exibirDados() {
    System.out.println("Conta Corrente\nTitular: " + getTitular() + "\nSaldo: R$ " + String.format("%.2f", getSaldo()));
    
    if (getChequeEspecial() < 1000) {
      System.out.println("Cheque especial máximo: R$ 1.000,00");
      System.out.println("Cheque especial utilizado: R$ " + String.format("%.2f", 1000 - getChequeEspecial()));
    }
  }
}