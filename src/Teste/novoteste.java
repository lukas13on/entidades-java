package Teste;

import Entidade.Pessoas.Documento;
import Enumeracao.Pessoas.Documento.Tipo;

public class novoteste {
    public static void main(String[] args) {
        Documento documento = new Documento(Tipo.CNPJ, "sasas");
        String tipo = documento.getTipo();
        System.out.println(tipo);
    }
}
