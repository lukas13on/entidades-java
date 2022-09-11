package Testador;

import Entidade.Pessoas.Documento;
import Enumerador.Pessoas.Documento.Tipo;

public class novoteste {
    public static void main(String[] args) {
        Documento documento = new Documento(Tipo.CNPJ, "sasas");
        String tipo = documento.getTipo();
        System.out.println(tipo);
    }
}
