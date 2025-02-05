public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public void aumentarSalario(double salario) {
        super.aumentarSalario(salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
