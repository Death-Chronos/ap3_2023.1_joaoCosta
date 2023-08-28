package src.exercicios01.exercicio2;

public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa Dell = new Empresa("Dell");

        Funcionario func1 = new Funcionario("Kleber", 1500);
        Funcionario func2 = new Funcionario("Robson", 2200);
        Funcionario func3 = new Funcionario("Roan", 3333);
        
        Dell.adicionarFuncionario(func3);
        Dell.adicionarFuncionario(func2);
        Dell.adicionarFuncionario(func1);

        System.out.println(Dell.calcularTotalSalarios());

    }
}
