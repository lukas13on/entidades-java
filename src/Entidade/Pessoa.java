package Entidade;

import Entidade.Pessoas.Contato;
import Entidade.Pessoas.Documento;
import Entidade.Pessoas.Endereco;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nascimento;
    protected Documento documento;
    protected Contato contato;
    protected Endereco endereco;
}