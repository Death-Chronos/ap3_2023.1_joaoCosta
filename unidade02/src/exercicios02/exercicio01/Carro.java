package src.exercicios02.exercicio01;

public class Carro extends Veiculo {
    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String descrever() {
        return super.descrever()+", numero de Portas = " +this.numeroPortas;
    }
    
}
