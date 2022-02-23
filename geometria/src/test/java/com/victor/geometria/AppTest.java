package com.victor.geometria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    Geometria G1 = new Geometria();
    Geometria G2 = new Geometria(2);

  //metodo area del cuadrado
    @Test
  	public void testareacuadrado(){
  		int resultadocuadrado = G1.areacuadrado(4);
  		int esperado = 16;
  		assertEquals(esperado,resultadocuadrado);
  		}
  	
  	//metodo area del circulo
    @Test
  	public void testareaCirculo(){
  		Double resultadocirculo = G1.areaCirculo(1);
  		Double esperado = 3.1416;
  		assertEquals(esperado,resultadocirculo);	
  	}
  	
  	//metodo area del triangulo
    @Test
  	public void testareatriangulo(){
  		int resultadotriangulo = G1.areatriangulo(4,4);
  		int esperado = 8;
  		assertEquals(esperado,resultadotriangulo);
  		}
    
  	//metodo area del rectangulo
    @Test
  	public void testarearectangulo(){
  		int resultadorectangulo = G1.arearectangulo(4,4);
  		int esperado = 16;
  		assertEquals(esperado,resultadorectangulo);
  		}
  	
  	//metodo area del rectangulo
    @Test
  	public void testareapentagono(){
  		int resultadopentagono = G1.areapentagono(4,4);
  		int esperado = 8;
  		assertEquals(esperado,resultadopentagono);
  		}
  	
  	//metodo area del rectangulo
    @Test
  	public void testarearombo(){
  		int resultadorombo = G1.arearombo(4,4);
  		int esperado = 8;
  		assertEquals(esperado,resultadorombo);
  		}
  	
  	//metodo area del rectangulo
    @Test
  	public void testarearomboide(){
  		int resultado = G1.arearomboide(4,4);
  		int esperado = 16;
  		assertEquals(esperado,resultado);
  		}
  	
  	//metodo area del rectangulo
    @Test
  	public void testareatrapecio (){ 
  		int resultado = G1.areatrapecio(4,4,4);
  		int esperado = 16;
  		assertEquals(esperado,resultado);
  		}
    
    @Test
    public void testfigura1() {
    	String resultado = G1.figura(1);
  		String esperado = "cuadrado";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura2() {
    	String resultado = G1.figura(2);
  		String esperado = "Circulo";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura3() {
    	String resultado = G1.figura(3);
  		String esperado = "Triangulo";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura4() {
    	String resultado = G1.figura(4);
  		String esperado = "Rectangulo";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura5() {
    	String resultado = G1.figura(5);
  		String esperado = "Pentagono";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura6() {
    	String resultado = G1.figura(6);
  		String esperado = "Rombo";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura7() {
    	String resultado = G1.figura(7);
  		String esperado = "Romboide";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura8() {
    	String resultado = G1.figura(8);
  		String esperado = "Trapecio";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testfigura10() {
    	String resultado = G1.figura(10);
  		String esperado = "Default";
  		assertEquals(esperado,resultado);
    }
    
    @Test
    public void testgetId() {
		int resultado = G2.getId();
  		int esperado = 2;
  		assertEquals(esperado,resultado);
	}
    
    @Test
	public void setId() {
		G2.setId(4);
		int resultado = G2.getId();
  		int esperado = 4;
  		assertEquals(esperado,resultado);
	}
    
    @Test
	public void testgetNom() {
		String resultado = G2.getNom();
  		String esperado = "Circulo";
  		assertEquals(esperado,resultado);
	}

    @Test
	public void testsetNom() {
		G2.setNom("a");
		String resultado = G2.getNom();
  		String esperado = "a";
  		assertEquals(esperado,resultado);
	}

    @Test
	public void testgetArea() {
		G2.setArea(3);
		Double resultado = G2.getArea();
		Double esperado = 3.0;
		assertEquals(esperado,resultado);
	}

    @Test
	public void testsetArea() {
		G2.setArea(3);
		Double resultado = G2.getArea();
		Double esperado = 3.0;
		assertEquals(esperado,resultado);
	}

    @Test
	public void testtoString() {
		G2.setArea(3.1416);
		G2.setId(2);
		String resultado = G2.toString();
		String esperado = "Geometria [id=2, nom=Circulo, area=3.1416]";
		assertEquals(esperado,resultado);
	}
    
      
    @Test
    public void testMain() {
    	JUnit.Junit09_Geometria.App.main(null);
    }
    
    
}

