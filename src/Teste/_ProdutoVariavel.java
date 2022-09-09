package Teste;

import com.google.gson.Gson;

import Entidade.Deposito;
import Entidade.Produto;
import Entidade.Produtos.Atributo;
import Entidade.Produtos.Dimensao;
import Entidade.Produtos.Estoque;
import Entidade.Produtos.Imagem;
import Entidade.Produtos.Variacao;
import Entidade.Produtos.Estoques.Lancamento;

public class _ProdutoVariavel {
        public static void main(String[] args) {

                String idDeposito = lib.Geradores.Strings.gerar(10);
                String idDeposito2 = lib.Geradores.Strings.gerar(10);
                String idImagem1 = lib.Geradores.Strings.gerar(10);
                String idImagem2 = lib.Geradores.Strings.gerar(10);
                String idVariacao1 = lib.Geradores.Strings.gerar(10);
                String idVariacao2 = lib.Geradores.Strings.gerar(10);
                String idProduto = lib.Geradores.Strings.gerar(10);

                Gson gson = new Gson();

                // Deposito 1

                Deposito deposito = new Deposito(idDeposito, "Deposito padrao");

                // Deposito 2

                Deposito deposito2 = new Deposito(idDeposito2, "Deposito sul");

                // lancamento 1

                Lancamento item1 = new Lancamento(idProduto,
                                idVariacao1,
                                deposito,
                                10);

                Lancamento item2 = new Lancamento(idProduto,
                                idVariacao1,
                                deposito2,
                                15);

                Lancamento[] lancamentos = { item1, item2 };

                // lancamento 2

                Lancamento item3 = new Lancamento(idProduto,
                                idVariacao2,
                                deposito2,
                                10);

                Lancamento item4 = new Lancamento(idProduto,
                                idVariacao2,
                                deposito2,
                                15);

                Lancamento[] lancamentos2 = { item3, item4 };

                // imagens 1

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

                // imagens 2

                Imagem imagem3 = new Imagem(
                                idImagem1,
                                "smartphone3.jpg",
                                "C:/imagens/smartphone3.jpg",
                                "jpg",
                                1080,
                                720);

                Imagem imagem4 = new Imagem(
                                idImagem2,
                                "smartphone4.jpg",
                                "C:/imagens/smartphone4.jpg",
                                "jpg",
                                1080,
                                720);

                Imagem[] imagens2 = { imagem3, imagem4 };

                // estoque variacao 1

                Estoque estoque = new Estoque(lancamentos);

                // estoque variacao 2

                Estoque estoque2 = new Estoque(lancamentos2);

                // Atributos variacao 2

                Atributo atributov2 = new Atributo(
                                null,
                                "Cor",
                                "Preta");

                Atributo[] atributosv2 = { atributov2 };

                // Atributos variacao 1

                Atributo atributov1 = new Atributo(
                                null,
                                "Cor",
                                "Preta");

                Atributo[] atributosv1 = { atributov1 };

                // variacoes

                Variacao variacao1 = new Variacao(
                                idVariacao1,
                                estoque,
                                atributosv1,
                                imagens,
                                1500.50);

                Variacao variacao2 = new Variacao(
                                idVariacao2,
                                estoque2,
                                atributosv2,
                                imagens2,
                                1450.50);

                Variacao[] variacoes = { variacao1, variacao2 };

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
                                dimensao,
                                variacoes,
                                atributos);

                String jsonString = gson.toJson(produto);

                System.out.println(produto.toString());
                System.out.println("-----------------------------");
                System.out.println(jsonString);

        }
}
