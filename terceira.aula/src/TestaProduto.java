// Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.

import java.util.ArrayList;

public class TestaProduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>(258);
        for (int i = 0; i < 258; i++) {
            Produto produto = new Produto("Produto " + i,i*100,i*2);
            listaProdutos.add(produto);
        }
    }
}