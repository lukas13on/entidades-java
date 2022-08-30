package Entidades;

import Entidades.Pessoal.Contato;
import Entidades.Pessoal.Documento;
import Entidades.Pessoal.Endereco;

public class Pessoa {
    private String idPessoa;
    private String nome;
    private String sobrenome;
    private String nascimento;
    protected Documento documento;
    protected Contato contato;
    protected Endereco endereco;

    public Pessoa(String idPessoa, String nome, String sobrenome, String nascimento, Documento documento,
            Contato contato, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.documento = documento;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Documento getDocumento() {
        return this.documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Contato getContato() {
        return this.contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "{" +
                " idPessoa='" + getIdPessoa() + "'" +
                ", nome='" + getNome() + "'" +
                ", sobrenome='" + getSobrenome() + "'" +
                ", nascimento='" + getNascimento() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", contato='" + getContato() + "'" +
                ", endereco='" + getEndereco() + "'" +
                "}";
    }

}
