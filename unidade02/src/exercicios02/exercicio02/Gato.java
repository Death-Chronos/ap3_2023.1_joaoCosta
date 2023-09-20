package src.exercicios02.exercicio02;

public class Gato extends Animal{
    
    public String miar(){
        return "Miaaaauausuas";
    }

    @Override
    public String emitirSons(){
        return miar();
    }
}
