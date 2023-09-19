package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpostosTest {

    Impostos impostos;

    @BeforeEach
    void setUp() {
        impostos = new Impostos();
    }

    //GPT que fez essa parte
    @Test
    public void testValorImpostoAc() {
        impostos.setUf("AC");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoAl() {
        impostos.setUf("AL");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoAm() {
        impostos.setUf("AM");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoAp() {
        impostos.setUf("AP");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoBa() {
        impostos.setUf("BA");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoCe() {
        impostos.setUf("CE");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoDf() {
        impostos.setUf("DF");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoEs() {
        impostos.setUf("ES");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoGo() {
        impostos.setUf("GO");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoMa() {
        impostos.setUf("MA");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoMt() {
        impostos.setUf("MT");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoMs() {
        impostos.setUf("MS");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoMg() {
        impostos.setUf("MG");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoPa() {
        impostos.setUf("PA");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoPb() {
        impostos.setUf("PB");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoPr() {
        impostos.setUf("PR");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoPe() {
        impostos.setUf("PE");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoPi() {
        impostos.setUf("PI");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoRn() {
        impostos.setUf("RN");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoRs() {
        impostos.setUf("RS");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoRj() {
        impostos.setUf("RJ");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoRo() {
        impostos.setUf("RO");
        impostos.setValor(100);
        assertEquals(117.5, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoRr() {
        impostos.setUf("RR");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoSc() {
        impostos.setUf("SC");
        impostos.setValor(100);
        assertEquals(117.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoSp() {
        impostos.setUf("SP");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoSe() {
        impostos.setUf("SE");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoTo() {
        impostos.setUf("TO");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoErroUf() {
        impostos.setUf("XX");
        impostos.setValor(100);
        assertEquals(118.0, impostos.calcularImposto());
    }
    @Test
    public void testValorImpostoErroValor() {
        impostos.setUf("BA");
        impostos.setValor(100);
        assertEquals(110.0, impostos.calcularImposto());
    }
}
