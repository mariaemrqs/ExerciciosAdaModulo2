
import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Carro> carros;

    public Frota() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public int listarDisponiveis() {
        int count = 0;
        for (Carro carro : carros) {
            if (carro.isDisponivel()) {
                count++;
            }
        }
        return count;
    }

    public void listarCarros() {
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }

    public static int getTotalCarros() {
        return Carro.getTotalCarros();
    }
}
