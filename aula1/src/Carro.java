public class Carro {

    String nome;
    String modelo;
    int ano;
    String marca;
    String cor;
    String placa;
    boolean ligado;
    int velocidade;
    double quantidadeCombustivel;

    public Carro(String nome){
        this.nome = nome;
    }

    public Carro(String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
    }

    public void ligar(){
        if(this.quantidadeCombustivel <= 0 ){
            throw new RuntimeException("Carro sem combustivel");
        }
        this.ligado = true;
        this.velocidade = 0;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void acelerar(){
        if(this.ligado){
            this.velocidade += 1;
            this.quantidadeCombustivel -= 1;
        } else {
            throw new RuntimeException("Carro não esta ligado");
        }
    }

    public void abastecer(double quantidadeCombustivel){
        this.quantidadeCombustivel += quantidadeCombustivel;
    }

    public double getQuantidadeCombustivel(){
        return this.quantidadeCombustivel;
    }

    public void buzinar(){
        System.out.println("Buzinando");
    }


}
