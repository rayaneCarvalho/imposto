package org.example;

import java.util.HashMap;
import java.util.Map;

public class Impostos {
    private static Map<String, Double> estadoImposto = new HashMap<String, Double>() {{
        put("AC" , 17.0);
        put("AL" , 17.0);
        put("AM" , 18.0);
        put("AP" , 18.0);
        put("BA" , 18.0);
        put("CE" , 18.0);
        put("DF" , 18.0);
        put("ES" , 17.0);
        put("GO" , 17.0);
        put("MA" , 18.0);
        put("MT" , 17.0);
        put("MS" , 17.0);
        put("MG" , 18.0);
        put("PA" , 17.0);
        put("PB" , 18.0);
        put("PR" , 18.0);
        put("PE" , 18.0);
        put("PI" , 18.0);
        put("RN" , 18.0);
        put("RS" , 18.0);
        put("RJ" , 18.0);
        put("RO" , 17.5);
        put("RR" , 17.0);
        put("SC" , 17.0);
        put("SP" , 18.0);
        put("SE" , 18.0);
        put("TO" , 18.0);
    }};
    private String uf;
    private double valor;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

}
