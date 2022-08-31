package App;

import Entidades.Produto;
import Entidades.Produtos.Atributo;
import Entidades.Produtos.Dimensao;
import Entidades.Produtos.Imagem;
import Entidades.Produtos.Variacao;

public class App {
        public static void main(String[] args) {

                // imagens

                String idImagem1 = lib.Geradores.Strings.gerar(10);
                String idImagem2 = lib.Geradores.Strings.gerar(10);

                Imagem imagem1 = new Imagem(
                                idImagem1,
                                "smartphone.jpg",
                                "C:/imagens/smartphone.jpg",
                                "jpg",
                                1080,
                                720);

                Imagem imagem2 = new Imagem(
                                idImagem2,
                                "smartphone2.jpg",
                                "C:/imagens/smartphone2.jpg",
                                "jpg",
                                1080,
                                720);

                Imagem[] imagens = { imagem1, imagem2 };

                // variacoes

                String idVariacao1 = lib.Geradores.Strings.gerar(10);
                String idVariacao2 = lib.Geradores.Strings.gerar(10);

                Variacao variacao1 = new Variacao(
                                idVariacao1,
                                1500.50);

                Variacao variacao2 = new Variacao(
                                idVariacao2,
                                1450.50);

                Variacao[] variacoes = { variacao1, variacao2 };

                // atributos

                String idAtributo1 = lib.Geradores.Strings.gerar(10);
                String idAtributo2 = lib.Geradores.Strings.gerar(10);

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
                                atributos,
                                imagens);

                System.out.println(produto.toString());

        }
}
