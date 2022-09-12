package Entidade;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import Enumerador.Motor.Atributo;

public class Modelo {
    private Field[] campos;
    private String versao = "0.0.1";

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String toSQL() {
        return "";
    }

    public List<Atributo> test() {
        Field[] fields = this.getClass().getDeclaredFields();
        List<Atributo> atributos = new ArrayList<>();

        String sql = "";
        String campos = "";
        String valores = "404";

        for (int i = 0; i < fields.length; i++) {
            // Popular o valor com o metodo da classe
            String valor = "";
            String chave = fields[i].getName();
            atributos.add(new Atributo(chave, valor));
            // return fields[i].getName();
        }
        return atributos;
        // return valores;

        // sql = "insert into dbo." + this.getClass().getSimpleName().toLowerCase() +
        // "(" + campos + ")values("
        // + valores + ");";
        // return sql;
    }

}
