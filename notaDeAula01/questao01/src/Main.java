import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner tecladoDouble = new Scanner(System.in);
    Scanner tecladoString = new Scanner(System.in);
    
    System.out.println("\nDigite o nome do aluno: ");
    String nome = tecladoString.nextLine();
    
    System.out.println("Digite a nota 1: ");
    double nota1 = tecladoDouble.nextDouble();
    
    System.out.println("Digite a nota 2: ");
    double nota2 = tecladoDouble.nextDouble();
    
    System.out.println("Digite a nota 3: ");
    double nota3 = tecladoDouble.nextDouble();
    
    Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
    aluno.exibirDetalhesAluno();
    
    tecladoDouble.close();
    tecladoString.close();
  }
}