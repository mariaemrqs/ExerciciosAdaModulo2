public class Termostato {
    double temperaturaAtual;
    double temperaturaDesejada;

    public Termostato(double temperaturaAtual, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void aumentarTemperatura(double valor) {
        this.temperaturaAtual += valor;
    }

    public void diminuirTemperatura(double valor) {
        this.temperaturaAtual -= valor;
    }

    public void ajustarTemperaturaDesejada(double valor) {
        this.temperaturaDesejada = valor;
    }
    
    public void exibirStatus(){
        System.out.println("Temperatura Atual: " + temperaturaAtual);
        System.out.println("Temperatura Desejada: " + temperaturaDesejada);
        if(temperaturaAtual > temperaturaDesejada){
            System.out.println("Temperatura atual está acima da desejada");
        } else if (temperaturaAtual < temperaturaDesejada) {
            System.out.println("Temperatura atual está abaixo da desejada");
        } else {
            System.out.println("Temperatura atual é igual a temperatura desejada");
        }

    }
}
