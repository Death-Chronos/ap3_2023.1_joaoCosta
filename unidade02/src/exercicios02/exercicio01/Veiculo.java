package src.exercicios02.exercicio01;

public class Veiculo {
    // Crie uma hierarquia de classes para representar veículos. A classe base deve ser chamada de Veiculo e ter os atributos comuns a todos os veículos, como marca, modelo, e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo. Cada uma dessas subclasses deve adicionar atributos específicos, como numeroPortas para carros e cilindrada para motos.

    private String marca;
    private String modelo;
    private int ano;
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
