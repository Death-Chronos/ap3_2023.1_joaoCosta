// Utilize uma coleção do tipo "HashMap" para armazenar os funcionários, utilizando o nome como chave. Faça uma classe TestaFuncionario com 14 funcionários, sendo 2 gerentes.

import java.util.HashMap;

public class TestaFuncinario {
    public static void main(String[] args) {
        HashMap<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();

        for (int i = 0; i < 14; i++) {
            Funcionario funcionario = new Funcionario("Funcionario "+(i+1),"reles mortal", 1320);
            if(i<2){
                funcionario.setCargo("gerente");
                funcionario.setSalario(3000);
            }
            funcionarios.put(funcionario.getNome(), funcionario);
        }
        System.out.println(funcionarios);
    }
    
}
