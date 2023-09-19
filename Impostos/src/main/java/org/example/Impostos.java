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
    private float valor;

    public float calcularImposto(){
        float total;

        return total = (float) (valor + (valor * (estadoImposto.get(uf)/100)));
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (estadoImposto.containsKey(uf)) {
            this.uf = uf;
        }
        else{
            throw new IllegalArgumentException("UF inválido");
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

    //GPT que fez essa parte
    /*public float getTaxaImposto(String uf) {
        if (estadoImposto.containsKey(uf)) {
            return estadoImposto.get(uf);
        } else {
            return 0.0;
        }
    }

    public void setTaxaImposto(String uf, float valor) {
        if (estadoImposto.containsKey(uf)) {
            estadoImposto.put(uf, valor);
        } else {
            throw new IllegalArgumentException("Estado não encontrado");
        }
    }*/

}
