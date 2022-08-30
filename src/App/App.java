package App;

import Entidades.Produto;
import Entidades.Produtos.Atributo;
import Entidades.Produtos.Dimensao;
import Entidades.Produtos.Variacao;

public class App {
    public static void main(String[] args) {

        String idVariacao1 = lib.Geradores.Strings.gerar(10);
        String idVariacao2 = lib.Geradores.Strings.gerar(10);
        String idAtributo1 = lib.Geradores.Strings.gerar(10);
        String idAtributo2 = lib.Geradores.Strings.gerar(10);

        Variacao variacao1 = new Variacao(
                idVariacao1,
                1500.50);

        Variacao variacao2 = new Variacao(
                idVariacao2,
                1450.50);

        Variacao[] variacoes = { variacao1, variacao2 };

        Atributo atributo1 = new Atributo(
                idAtributo1,
                "Memoria Ram",
                "2GB");

        Atributo atributo2 = new Atributo(
                idAtributo2,
                "Memoria Interna",
                "16GB");

        Atributo[] atributos = { atributo1, atributo2 };

        Dimensao dimensao = new Dimensao(
                10,
                10,
                10,
                10);

        Produto produto = new Produto(
                "Smartphone LG K9",
                "O smartphone ideal para você...",
                1500.50,
                dimensao,
                variacoes,
                atributos);

        System.out.println(produto.toString());

    }
}
