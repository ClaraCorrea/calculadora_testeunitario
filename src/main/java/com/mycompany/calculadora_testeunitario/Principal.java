package com.mycompany.calculadora_testeunitario;
import javax.swing.JOptionPane;

/**
@author Clara Correa
*/

public class Principal {
    public static void main(String[] args) {
        String opcao="";
        Calculadora calculadora = new Calculadora();
            while(!opcao.equals("9")){
                opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Adicao \n3 - Subtracao \n4 - Multiplicação \n5 - Divisao \n9 - Sair");
                switch (Integer.parseInt(opcao)) {
                    case 1 -> {
                        calculadora.setValorA(Double.parseDouble(JOptionPane.
                                showInputDialog("Digite o valor A")));
                        calculadora.setValorB(Double.parseDouble(JOptionPane.
                                showInputDialog("Digite o valor B")));
                }
                    case 2 -> JOptionPane.showMessageDialog(null,"Soma: " + calculadora.getSoma());
                    case 3 -> JOptionPane.showMessageDialog(null,"Diferenca: " + calculadora.getDiferenca());
                    case 4 -> JOptionPane.showMessageDialog(null,"Produto: " + calculadora.getProduto());
                    case 5 -> JOptionPane.showMessageDialog(null,"Quociente: " + calculadora.getQuociente());
                }
            }
    }
}
