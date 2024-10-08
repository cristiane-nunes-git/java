import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner tecladoInt = new Scanner(System.in);
    Scanner tecladoDouble = new Scanner(System.in);
    
    System.out.print("\nDigite a distância percorrida (km): ");
    double distancia = tecladoDouble.nextDouble();
    
    System.out.print("Digite o tempo de espera (minutos): ");
    int tempoEspera = tecladoInt.nextInt();
    
    System.out.print("Digite a tarifa base (R$): ");
    double tarifaBase = tecladoDouble.nextDouble();
    
    System.out.print("Digite o fator de demanda (1.0 = normal, 1.5 = pico): ");
    double fatorDemanda = tecladoDouble.nextDouble();
    
    
    Corrida corrida = new Corrida(distancia, tempoEspera, tarifaBase, fatorDemanda);
    corrida.exibirDetalhesCorrida();
    
    tecladoInt.close();
    tecladoDouble.close();
  }
}