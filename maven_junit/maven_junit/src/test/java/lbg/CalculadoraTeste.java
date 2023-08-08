package lbg;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class CalculadoraTeste{
    
    Calculadora cal = new Calculadora();

    @Test
    public void add(){
        assertEquals(2, cal.add(1,1));
    }
    @Test
    public void sub(){
        assertEquals(0, cal.sub(1,1));
    }
    @Test
    public void div(){
        assertEquals(1, cal.div(1,1));
    }
    @Test
    public void mult(){
        assertEquals(1, cal.mult(1,1));
    }
}