package src.exercicios02.exercicio01;

public class Moto extends Veiculo{
    private float cilindrada;

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String descrever() {
        return super.descrever()+", cilindrada=" +this.cilindrada;
    }

    

    
}
