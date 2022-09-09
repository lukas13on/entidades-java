package Teste;

import com.google.gson.Gson;

import Entidade.Deposito;
import Entidade.Produto;
import Entidade.Produtos.Atributo;
import Entidade.Produtos.Dimensao;
import Entidade.Produtos.Estoque;
import Entidade.Produtos.Imagem;
import Entidade.Produtos.Estoques.Lancamento;

public class ProdutoSimples {
        public static void main(String[] args) {

                String idDeposito = lib.Geradores.Strings.gerar(10);
                String idDeposito2 = lib.Geradores.Strings.gerar(10);
                String idImagem1 = lib.Geradores.Strings.gerar(10);
                String idImagem2 = lib.Geradores.Strings.gerar(10);
                String idProduto = lib.Geradores.Strings.gerar(10);

                Gson gson = new Gson();

                // Deposito 1

                Deposito deposito = new Deposito(idDeposito, "Deposito padrao");

                // Deposito 2

                Deposito deposito2 = new Deposito(idDeposito2, "Deposito sul");

                // lancamento 1

                Lancamento item1 = new Lancamento(idProduto,
                                null,
                                deposito,
                                7);

                Lancamento item2 = new Lancamento(idProduto,
                                null,
                                deposito2,
                                9);

                Lancamento[] lancamentos = { item1, item2 };

                // imagens 1

                Imagem imagem1 = new Imagem(
                                idImagem1,
                                "smartphone.jpg",
                                "C:/imagens/smartphone.jpg",
                                "jpg",
                                1920,
                                1080);

                Imagem imagem2 = new Imagem(
                                idImagem2,
                                "smartphone2.jpg",
                                "C:/imagens/smartphone2.jpg",
                                "jpg",
                                1920,
                                1080);

                Imagem[] imagens = { imagem1, imagem2 };

                // estoque variacao 1

                Estoque estoque = new Estoque(lancamentos);

                // atributos

                Atributo atributo1 = new Atributo(
                                null,
                                "Memoria Ram",
                                "2GB");

                Atributo atributo2 = new Atributo(
                                null,
                                "Memoria Interna",
                                "16GB");

                Atributo[] atributos = { atributo1, atributo2 };

                Dimensao dimensao = new Dimensao(
                                10,
                                10,
                                10,
                                10);

                Produto produto = new Produto(
                                idProduto,
                                "Smartphone LG K9",
                                "O smartphone ideal para você...",
                                1500.75,
                                dimensao,
                                imagens,
                                atributos,
                                estoque);

                String jsonString = gson.toJson(produto);
                System.out.println(jsonString);
        }
}
