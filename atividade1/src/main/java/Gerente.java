public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String salario, String nome) {
        super(salario, nome);
    }

    @Override
    public void aumentarSalario(String salario) {
        super.aumentarSalario(salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
