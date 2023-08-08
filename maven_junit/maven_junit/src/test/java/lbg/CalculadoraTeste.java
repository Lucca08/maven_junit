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
    public void addnot(){
        assertNotEquals(4, cal.add(1,1));
    }
    @Test
    public void sub(){
        assertEquals(0, cal.sub(1,1));
    }
    @Test
    public void subnot(){
        assertNotEquals(5, cal.add(1,1));
    }
    @Test
    public void div(){
        assertEquals(1, cal.div(1,1));
    }
    @Test
    public void divnot(){
        assertNotEquals(5, cal.add(1,1));
    }
    @Test
    public void mult(){
        assertEquals(1, cal.mult(1,1));
    }
    @Test
    public void multnot(){
        assertNotEquals(6, cal.add(1,1));
    }
}
