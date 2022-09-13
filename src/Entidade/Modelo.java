package Entidade;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import Controlador.Motores.Atributo;
import Controlador.Motores.Sql;

public class Modelo {

    public Modelo(String tabela) {
        this.tabela = tabela;
    }

    private String tabela;

    public List<Atributo> getAtributos() {
        Field[] fields = this.getClass().getDeclaredFields();
        List<Atributo> atributos = new ArrayList<>();

        for (int i = 0; i < fields.length; i++) {

            String chave;
            String valor;
            String name = fields[i].getName();
            Method method;

            try {
                name = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
                method = this.getClass().getMethod(name);
                valor = method.invoke(this).toString();
            } catch (Exception e) {
                continue;
            }

            chave = fields[i].getName();
            atributos.add(new Atributo(chave, valor));

        }
        return atributos;
    }

    public Sql toSql() {
        return new Sql(this);
    }

    public String getTabela() {
        return this.tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

}
