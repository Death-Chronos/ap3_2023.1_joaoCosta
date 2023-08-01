// Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente um método para exibir as informações completas do funcionário. 

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome = " + nome + ", cargo = " + cargo + ", salario = " + salario + "]";
    }

}

/* ...: 100098201595?

    É um código secreto que usaremos mais tarde... Hehe
    - Mickey Xico Mouse 

*/ 
