public class Main {
    public static void main(String[] args) {
      
        Funcionario funcionario = new Funcionario("feliphe", 1996, 3000.00);
        
        Gerente gerente = new Gerente("fulano", 1994, 8000.00, "Projeto Tal");
        
        Programador programador = new Programador("Ciclano", 1998, 5000.00, "Java");

        
        System.out.println(funcionario.informarSalario());
        System.out.println(funcionario.calcularIdade());

        System.out.println(gerente.informarSalario());
        System.out.println(gerente.calcularIdade());
        System.out.println(gerente.informarProjeto());

        System.out.println(programador.informarSalario());
        System.out.println(programador.calcularIdade());
        System.out.println(programador.informarLinguagem());
    }
}