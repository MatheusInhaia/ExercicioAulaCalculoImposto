package Testes;

import Sistema.CalculaImposto;
import Sistema.PessoaFisica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculaImpostoTeste {



    public CalculaImposto imposto;


    @BeforeEach
    public void setUp(){
    }

    @Test
    public void teste01(){
        imposto = new CalculaImposto(new PessoaFisica("Matheus","03146513056",25,2,new BigDecimal(6000.0),new BigDecimal(30000.0) ));
        assertEquals( new BigDecimal(1551.6).setScale(2,BigDecimal.ROUND_UP),imposto.calculoCompleto().setScale(2,BigDecimal.ROUND_UP) );
    }
    @Test
    public void teste02(){
        imposto = new CalculaImposto(new PessoaFisica("bianca", "031465210", new BigDecimal(3000.0), new BigDecimal(10000.0)));
        assertEquals( new BigDecimal(0.00).setScale(2,BigDecimal.ROUND_UP),imposto.calculoSimplificado().setScale(2,BigDecimal.ROUND_UP) );
    }
    @Test
    public void teste03simplificado(){
        imposto = new CalculaImposto(new PessoaFisica("vitor","14523658",66,6,new BigDecimal(10000.0),new BigDecimal(60000.0) ));
        assertEquals(new BigDecimal(7478.75),imposto.calculoCompleto().setScale(2,BigDecimal.ROUND_UP));
    }
    @Test
    public void teste04completo(){
        imposto = new CalculaImposto(new PessoaFisica("maria", "04578258", new BigDecimal(3000.0), new BigDecimal(40000.0)));
        assertEquals(new BigDecimal(4866.25),imposto.calculoSimplificado().setScale(2,BigDecimal.ROUND_UP));

    }

}
