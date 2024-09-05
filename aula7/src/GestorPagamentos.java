import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GestorPagamentos {
    private List<Pagamento> listaDePagamentos;

    public GestorPagamentos() {
        listaDePagamentos = new ArrayList<Pagamento>();
    }

    public void adicionarPagamentoNaLista(Pagamento pagamento){
        listaDePagamentos.add(pagamento);
    }

    public void processarPagamentos(){
        for(Pagamento pagamento : listaDePagamentos){
            pagamento.processarPagamento();
        }
    }

    public static void main(String[] args) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        PagamentoBoleto boleto = new PagamentoBoleto(5000, LocalDate.parse("25/10/2024", formatador));
        PagamentoCredito cartaoCredito = new PagamentoCredito(250, LocalDate.parse("25/10/2024", formatador), "2000000555555444", LocalDate.parse("25/09/2024", formatador));
        PagamentoDebito cartaoDebito = new PagamentoDebito(125.23, LocalDate.parse("20/10/2024", formatador), "2488", "35789-2", true);


        GestorPagamentos gestor = new GestorPagamentos();
        gestor.adicionarPagamentoNaLista(boleto);
        gestor.adicionarPagamentoNaLista(cartaoCredito);
        gestor.adicionarPagamentoNaLista(cartaoDebito);

        gestor.processarPagamentos();
    }

}

