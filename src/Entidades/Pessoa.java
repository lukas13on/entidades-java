package Entidades;

import Entidades.Pessoas.Contato;
import Entidades.Pessoas.Documento;
import Entidades.Pessoas.Endereco;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nascimento;
    protected Documento documento;
    protected Contato contato;
    protected Endereco endereco;
}