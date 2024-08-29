public class ContaBancaria {
    int NumeroConta;
    String Titular;
    double Saldo;
    public ContaBancaria(int NumeroConta, String Titular, double Saldo) {
        this.NumeroConta = NumeroConta;
        this.Titular = Titular;
        this.Saldo = Saldo;
    }

    public void Depositar(double valor) {
        this.Saldo += valor;
    }

    public void Sacar(double valor) {
        if (this.Saldo < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.Saldo -= valor;
        }
    }

    public void Receber(double valor) {
        this.Saldo += valor;
    }

    public void Transferir(double valor, ContaBancaria destino) {
        if (this.Saldo < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            destino.Receber(valor);
            this.Saldo -= valor;
        }
    }

    public void ExibirSaldo(){
        System.out.println(this.Saldo);
    }


}
