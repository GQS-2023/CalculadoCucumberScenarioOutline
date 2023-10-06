/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora2;

/**
 *
 * @author rafaelamoreira
 */
public class Calculadora2 {

    private final String nome;
    private String operacao;
    private int a;
    private int b;

    public Calculadora2(String nome) {
        this.nome = nome;
    }

    public void pressNumber1(int a) {
        this.a = a;
    }

    public void pressNumber2(int b) {
        this.b = b;
    }

    public void selecionarOperacao(String op) {
        this.operacao = op;
    }

    public int calcular() {
        int result = 0;
        switch (operacao) {
            case "soma" -> result = a + b;
            case "subtracao" -> result = a - b;
            case "multiplicacao" -> result = a * b;
            case "divisao" -> {
                if (b != 0) {
                    result = a / b;
                }
            }
        }
        return result;
    }
}
