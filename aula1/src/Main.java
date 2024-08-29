import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCarro = scanner.nextLine();

        Carro carro = new Carro(nomeCarro);
        carro.modelo = "2.0";
        carro.ano = 2010;
        carro.placa = "GJU-8956";
        carro.cor = "preta";
        try {
            carro.ligar();
        } catch (Exception ex){
            System.out.println("Controle de Exception");
            carro.abastecer(45);
            carro.ligar();
        }
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        double quantidade = carro.getQuantidadeCombustivel();
        System.out.println("Carro esta ligado? " + carro.ligado);
        System.out.println("Velocidade  " + carro.velocidade);
        System.out.println("Quantidade de Combustivel " + quantidade);

        carro.buzinar();

//        System.out.println(carro.nome);
//        System.out.println(carro.modelo);
//        System.out.println(carro.ano);
//        System.out.println(carro.placa);
//        System.out.println(carro.cor);
//
//        Carro carro2 = new Carro("GOL", "1.0");
//        carro2.ano = 2020;
//        carro2.placa = "PLO-8956";
//        carro2.cor = "Branco";

//
//        Funcionario funcionario1 = new Funcionario();
//        funcionario1.nome = "Allana";
//
//        Funcionario pedro = new Funcionario("Pedro");
//        pedro.salario = 3000.00;
//        pedro.cargo = "Analista";
//
//        Funcionario luiz = new Funcionario("Luiz", "Analista");
//
//        System.out.println(pedro.nome);
//        System.out.println(pedro.salario);
//        System.out.println(pedro.cargo);

//        Computador dell = new Computador();
//        dell.marca = "Dell";
//        dell.processador = "I5";
//        dell.so = "Linux";
//        dell.memoria = "2GB";
//        dell.armazenamento = "1TB";
//        dell.tipo = "notebook";
//
//        Computador lenovo = new Computador();
//        lenovo.marca = "Lenovo";
//        lenovo.processador = "Pentium Gold";
//        lenovo.so = "Windows";
//        lenovo.memoria = "4GB";
//        lenovo.armazenamento = "500GB";
//        lenovo.tipo = "All-in-one";
//
//        System.out.println(dell.marca);
//        System.out.println(dell.processador);
//        System.out.println(dell.so);
//
//        System.out.println("***************");
//
//        System.out.println(lenovo.marca);
//        System.out.println(lenovo.processador);
//        System.out.println(lenovo.so);





    }

}