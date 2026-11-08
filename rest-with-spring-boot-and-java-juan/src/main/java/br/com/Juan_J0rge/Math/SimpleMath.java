package br.com.Juan_J0rge.Math;

import br.com.Juan_J0rge.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public Double sum(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }

    public Double subtraction(double numberOne, double numberTwo){
        return numberOne - numberTwo;
    }

    public Double multiplication(double numberOne, double numberTwo){
        return numberOne * numberTwo;
    }

    public Double division(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }

    public Double mean(double numberOne, double numberTwo){
        return (numberOne + numberTwo) /2;
    }
    public Double squareRoot(double number){
        return mathSquareRoot(number);
        // ou return Math.sqrt(number); mas eu quis fazer a lógica da raiz quadrada.
    }

    private Double mathSquareRoot(Double squareRoot) {
        for (int i = 0; i <= squareRoot; i++) {
            if (i * i == squareRoot) {
                double resultado = i;
                return resultado;
            }
        }
        return 0D;
    }
}
