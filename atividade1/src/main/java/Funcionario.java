public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aumentarSalario(double aumento){
        salario = salario + aumento;
        System.out.println("Salaraio aumentado: "+salario);
    }

}
