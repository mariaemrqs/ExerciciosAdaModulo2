import java.time.LocalDate;


public abstract class Pagamento {
    private double valor;
    private LocalDate DataPagamento;

    public Pagamento(double valor, LocalDate dataPagamento) {
        this.valor = valor;
        this.DataPagamento = dataPagamento;
    }

    public abstract boolean processarPagamento();

}
