package com.mycompany.calculadora_testeunitario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
@author Clara Correa
*/

class TestCalculadora {
    @Test
    void testGetSoma(){
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0,2.0);
        //Define o valor esperado para a operação
    double retornoEsperado = 5.0;
        //Chama a operacao getSoma()
    double retornoFeito = calculadora.getSoma();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado,retornoFeito,2);
    }


    @Test
    void testGetDiferenca(){
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0,2.0);
        //Define o valor esperado para a operação
    double retornoEsperado = 2.0; 
        //Chama a operacao getDiferenca()
    double retornoFeito = calculadora.getDiferenca();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado,retornoFeito,0);
    }
    
    @Test
    void testGetProduto(){
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0,2.0);
        //Define o valor esperado para a operação
    double retornoEsperado = 8.0;
        //Chama a operacao getProduto()
    double retornoFeito = calculadora.getProduto();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado,retornoFeito,0);
    }
    
    @Test
    void testGetQuociente(){
        //Instancia um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora(4.0,2.0);
        //Define o valor esperado para a operação
    double retornoEsperado = 2.0;
        //Chama a operacao getQuociente()
    double retornoFeito = calculadora.getQuociente();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado,retornoFeito,0);
    }
}

