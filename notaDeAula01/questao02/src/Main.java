import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner tecladoInt = new Scanner(System.in);
    Scanner tecladoDouble = new Scanner(System.in);
    
    Produto produto = new Produto(123456, "Alho", "1kg", "roxo", 1.5, 15);
    
    produto.exibirInfo();
    
    System.out.println("\nDigite a quantidade que deseja vender no Débito: ");
    int quantidade = tecladoInt.nextInt();
    produto.vender(quantidade, "débito", produto.getValor() * quantidade, 1);
    
    System.out.println("\nDigite a quantidade que deseja vender em Espécie: ");
    quantidade = tecladoInt.nextInt();
    
    System.out.println("Digite o valor recebido: ");
    double valorRecebido = tecladoDouble.nextDouble();
    
    produto.vender(quantidade, "espécie", valorRecebido, 1);
    
    System.out.println("\nDigite a quantidade que deseja vender no Crédito: ");
    quantidade = tecladoInt.nextInt();
    
    System.out.println("Digite o número de parcelas: ");
    int parcelas = tecladoInt.nextInt();
    
    produto.vender(quantidade, "crédito", produto.getValor() * quantidade, parcelas);
    
    tecladoInt.close();
    tecladoDouble.close();
  }
}