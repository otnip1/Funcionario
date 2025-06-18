public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Gerente(); // referência da superclasse

        System.out.println("Salário do Funcionário: R$ " + f1.calcularSalario());
        System.out.println("Salário do Gerente: R$ " + f2.calcularSalario());
    }
}