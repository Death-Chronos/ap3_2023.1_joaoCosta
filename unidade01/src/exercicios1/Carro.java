// Crie uma classe chamada "Carro" que tenha os atributos marca, modelo e ano. Sobrescreva o método toString() para exibir as informações completas do carro. Ao exibir as informações do carro, diga se ele é ou não semi-novo (se tem mais de três anos de fabricação, não é semi-novo). Implemente getters e setters. Crie a classe TestaCarro, com 2 carros.

import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String estado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estado = ((LocalDate.now().getYear() - ano) >=3)?"Não é semi-novo" : "É semi-novo";

    }
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
    @Override
    public String toString() {
        return "Carro: "+
        "marca = " + marca + 
        ", modelo = " + modelo + 
        ", ano = " + ano + 
        ", estado = " + estado;
    }

    


    
}
