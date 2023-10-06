/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

/**
 *
 * @author rafaelamoreira
 */
import com.mycompany.calculadora2.Calculadora2;
import io.cucumber.java.ParameterType;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class CalculadoraSteps {

    private Calculadora2 c;
    private int result;
    
    @ParameterType(".*") 
    public String nome(String value) {
        return value;
    }
    
    @ParameterType(".*") 
    public String operacao(String value) {
        return value;
    }
    @Dado("que {nome} esteja na calculadora")
    public void que_esteja_na_calculadora(String nome) {
        c = new Calculadora2(nome);
    }

    @Quando("pressionar o primeiro numero {int}")
    public void pressionar_o_primeiro_numero(int numero1) {
        c.pressNumber1(numero1);
    }

    @Quando("pressionar o segundo numero {int}")
    public void pressionar_o_segundo_numero(int numero2) {
        c.pressNumber2(numero2);
    }

    @Quando("escolher a {operacao}")
    public void escolher_a_operacao(String operacao) {
        c.selecionarOperacao(operacao);
    }

    @Então("o sistema deverá mostrar o {int}")
    public void o_sistema_devera_mostrar_o_resultado(int resultadoEsperado) {
        result = c.calcular();
        Assert.assertEquals(resultadoEsperado, result);
    }
}
