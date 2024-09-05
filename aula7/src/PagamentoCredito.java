import java.time.LocalDate;


public class PagamentoCredito extends Pagamento{
    private final String numeroCartao;
    private final LocalDate dataValidade;

    public PagamentoCredito(double valor, LocalDate dataPagamento, String numeroCartao, LocalDate dataValidade){
        super(valor, dataPagamento);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean processarPagamento() {
        LocalDate hoje = LocalDate.now();

        if (this.dataValidade.isAfter(hoje)  && 13<= this.numeroCartao.length() && this.numeroCartao.length() <= 19){
            System.out.println("Transação no cartão de crédito aprovada com sucesso");
            return true;
        }
        else {
            System.out.println("Transação recusada. Número e/ou validade do cartão incorreto(s)");
            return false;
        }
    }
}

