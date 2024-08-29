import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num1 = numero.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = numero.nextDouble();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(num1, num2));
        System.out.println(calculadora.subtracao(num1, num2));
        System.out.println(calculadora.multiplicacao(num1, num2));
        System.out.println(calculadora.divisao(num1, num2));


        ContaBancaria maria = new ContaBancaria(1888, "Maria", 5000.00);
        ContaBancaria mateus = new ContaBancaria(1889, "Mateus", 10000.00);
        maria.Depositar(10000.00);
        mateus.Sacar(1000.00);
        maria.Transferir(100.00, mateus);
        maria.ExibirSaldo();
        mateus.ExibirSaldo();


       Termostato termostato = new Termostato(20.0, 10.0);
       termostato.aumentarTemperatura(5.0);
       termostato.diminuirTemperatura(1.0);
       termostato.ajustarTemperaturaDesejada(5.0);
       termostato.exibirStatus();

    }
}
