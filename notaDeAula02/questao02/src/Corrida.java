public class Corrida {
  
  private double distancia;
  private int tempoEspera;
  private double tarifaBase;
  private double fatorDemanda;
  
  public Corrida(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
    setDistancia(distancia);
    setTempoEspera(tempoEspera);
    setTarifaBase(tarifaBase);
    setFatorDemanda(fatorDemanda);
  }
  
  public double getDistancia() {
    return distancia;
  }
  
  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }
  
  public int getTempoEspera() {
    return tempoEspera;
  }
  
  public void setTempoEspera(int tempoEspera) {
    this.tempoEspera = tempoEspera;
  }
  
  public double getTarifaBase() {
    return tarifaBase;
  }
  
  public void setTarifaBase(double tarifaBase) {
    this.tarifaBase = tarifaBase;
  }
  
  public double getFatorDemanda() {
    return fatorDemanda;
  }
  
  public void setFatorDemanda(double fatorDemanda) {
    this.fatorDemanda = fatorDemanda;
  }
  
  public double calcularValorCorrida() {
    return (getDistancia() * 2) + (getTempoEspera() * 0.5) + (getTarifaBase() * getFatorDemanda());
  }
  
  public void exibirDetalhesCorrida() {
    double valorFinal = calcularValorCorrida();
    System.out.println("\nDetalhes da Corrida:");
    System.out.println("    Distância: " + getDistancia() + " km");
    System.out.println("    Tempo de Espera: " + getTempoEspera() + " minutos");
    System.out.println("    Tarifa Base: R$ " + getTarifaBase());
    System.out.println("    Fator de Demanda: " + getFatorDemanda());
    System.out.printf("\nValor Final: R$ %.2f\n", valorFinal);
  }
}