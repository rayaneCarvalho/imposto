package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpostosTest {

    Impostos valor;

    @BeforeEach
    void setUp() {
        valor = new Impostos();
    }

    //GPT que fez essa parte
    @Test
    public void testTaxaImpostoExistente() {
        double taxaAC = valor.getTaxaImposto("AC");
        assertEquals(17.0, taxaAC);
    }
    @Test
    public void testTaxaImpostoInexistente() {
        double taxaInexistente = valor.getTaxaImposto("XX");
        assertEquals(0.0, taxaInexistente);
    }
}
