public class Main {
    public static void main(String[] args) {

        Frota frota = new Frota();


        Carro carro1 = new Carro("ABC1234", "Impala", 1967);
        Carro carro2 = new Carro("XYZ5678", "Civic", 2020);
        Carro carro3 = new Carro("LMN9101", "Celta", 2005);

        frota.adicionarCarro(carro1);
        frota.adicionarCarro(carro2);
        frota.adicionarCarro(carro3);


        System.out.println("Total de carros criados: " + Frota.getTotalCarros());


        System.out.println("Carros disponíveis: " + frota.listarDisponiveis());


        System.out.println("\nLista de carros na frota:");
        frota.listarCarros();


        System.out.println("\nTentando alugar o carro com placa ABC1234:");
        carro1.alugar();
        System.out.println("\nTentando alugar novamente o carro com placa ABC1234:");
        carro1.alugar();

        System.out.println("\nTentando devolver o carro com placa ABC1234:");
        carro1.devolver();
        System.out.println("\nTentando devolver novamente o carro com placa ABC1234:");
        carro1.devolver();


        System.out.println("\nTotal de carros criados: " + Frota.getTotalCarros());
        System.out.println("Carros disponíveis: " + frota.listarDisponiveis());
    }
}
