import java.awt.*;
import java.time.LocalDate;


public class PagamentoDebito extends Pagamento {

    private String numeroDaAgencia;
    private String numeroDaConta;
    private boolean temSaldoSuficiente;

    public PagamentoDebito(double valor, LocalDate dataPagamento, String numeroDaAgencia, String numeroDaConta, boolean temSaldoSuficiente) {
        super(valor, dataPagamento);
        this.numeroDaAgencia = numeroDaAgencia;
        this.numeroDaConta = numeroDaConta;
        this.temSaldoSuficiente = temSaldoSuficiente;
    }

    @Override
    public boolean processarPagamento() {
        if (temSaldoSuficiente) {
            System.out.println("Pagamento no cartão de débito autorizado e efetuado");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void definirSaldoSuficiente(){ this.temSaldoSuficiente = true; }

    public void definirSaldoInsuficiente(){ this.temSaldoSuficiente = false; }

}

