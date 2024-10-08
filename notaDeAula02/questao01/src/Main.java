import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner tecladoInt = new Scanner(System.in);
    Scanner tecladoDouble = new Scanner(System.in);
    Scanner tecladoString = new Scanner(System.in);
    
    Conta conta = null;
    
    System.out.println("Selecione o tipo de conta:");
    System.out.println("1. Conta Corrente");
    System.out.println("2. Conta Poupança");
    int tipoConta = tecladoInt.nextInt();
    
    System.out.print("Digite o nome do titular: ");
    String titular = tecladoString.nextLine();
    
    if (tipoConta == 1) {
      conta = new ContaCorrente(titular);
    } else if (tipoConta == 2) {
      System.out.print("Digite a taxa Selic: ");
      double selic = tecladoDouble.nextDouble();
      conta = new ContaPoupanca(titular, selic);
    }
    
    if (conta != null) {
      
      int opcao;
      
      do {
        System.out.println("\nMenu de opções:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        
        if (conta instanceof ContaCorrente) {
          System.out.println("3. Usar cheque especial");
        } else if (conta instanceof ContaPoupanca) {
          System.out.println("3. Calcular rendimento");
        }
        
        System.out.println("4. Exibir dados da conta");
        System.out.println("5. Sair");
        opcao = tecladoInt.nextInt();
        
        switch (opcao) {
          
          case 1:
            System.out.print("Digite o valor para depositar: ");
            double valorDeposito = tecladoDouble.nextDouble();
            conta.depositar(valorDeposito);
            break;
          
          case 2:
            System.out.print("Digite o valor para sacar: ");
            double valorSaque = tecladoDouble.nextDouble();
            if (!conta.sacar(valorSaque)) {
              System.out.println("Saldo insuficiente.");
            }
            break;
          
          case 3:
            if (conta instanceof ContaCorrente) {
              System.out.print("Digite o valor para usar do cheque especial: ");
              double valorCheque = tecladoDouble.nextDouble();
              if (!((ContaCorrente) conta).usarChequeEspecial(valorCheque)) {
                System.out.println("Saldo insuficiente, mesmo com cheque especial.");
              }
            } else if (conta instanceof ContaPoupanca) {
              ((ContaPoupanca) conta).calcularRendimento();
            }
            break;
          
          case 4:
            conta.exibirDados();
            break;
          
          case 5:
            System.out.println("Saindo...");
            break;
          
          default:
            System.out.println("Opção inválida.");
        }
      } while (opcao != 5);
    }
    
    tecladoInt.close();
    tecladoDouble.close();
    tecladoString.close();
  }
}