import java.time.LocalDate;

import java.util.Random;

public class PagamentoBoleto extends Pagamento{
    private String numeroBoleto = "";

    public PagamentoBoleto(double valor, LocalDate dataPagamento) {
        super(valor, dataPagamento);
    }

    @Override
    public boolean processarPagamento() {
        Random random = new Random();
        for(int i =0; i<54; i++){
            if(i==5) numeroBoleto = numeroBoleto.concat(".");
            else if(i==11) numeroBoleto = numeroBoleto.concat(" ");
            else if(i==17) numeroBoleto = numeroBoleto.concat(".");
            else if(i==24) numeroBoleto = numeroBoleto.concat(" ");
            else if(i==30) numeroBoleto = numeroBoleto.concat(".");
            else if(i==37) numeroBoleto = numeroBoleto.concat(" ");
            else if(i==39) numeroBoleto = numeroBoleto.concat(" ");
            else numeroBoleto = numeroBoleto.concat(String.valueOf(random.nextInt(9)));
        }
        System.out.println("Boleto gerado com sucesso. Código: "+numeroBoleto);
        return true;
    }
}

