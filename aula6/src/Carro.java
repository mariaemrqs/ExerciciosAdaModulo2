
public class Carro {

    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;

    private static int totalCarros = 0;

    public Carro(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        setAno(ano);
        this.disponivel = true;
        totalCarros++;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1900) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano deve ser maior que 1900.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    private void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void alugar() {
        if (disponivel) {
            setDisponivel(false);
            System.out.println("Carro alugado com sucesso.");
        } else {
            System.out.println("O carro não está disponível para aluguel.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            setDisponivel(true);
            System.out.println("Carro devolvido com sucesso.");
        } else {
            System.out.println("O carro já está disponível.");
        }
    }

    public static int getTotalCarros() {
        return totalCarros;
    }

    @Override
    public String toString() {
        return String.format("Carro [placa:%s, modelo:%s, ano:%d, disponível:%b]",
                placa, modelo, ano, disponivel);
    }
}
