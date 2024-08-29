public class Funcionario {

    String nome;
    String cargo;
    double salario;

    public Funcionario (){};
    public Funcionario(String nome){
        if (nome.length() < 3){
            throw new RuntimeException("Nome precisa ser maior que 5 caracteres");
        }
        this.nome = nome;
    }

    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }
}
