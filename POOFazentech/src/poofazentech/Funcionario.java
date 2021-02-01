package poofazentech;

public class Funcionario {
    private String nome;
    private String endereco;
    private String cpf;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    void salvarFuncionario(){
        System.out.print("Funcionário foi salvo com Sucesso!");
    }
    
    public static void main(String[] args) {
        
    Funcionario funcionario = new Funcionario ();
    funcionario.setNome ("Ricardo de Deus");
    funcionario.setEndereco ("Rua das Virtude, 3205, Terra Nova");
    funcionario.setCpf ("111.222.333-44");
    funcionario.setSexo ("masculino");

    System.out.printf ("o nome do funcionário é" + funcionario.getNome ());
    System.out.printf ("o endereço do funcionário é" + funcionario.getEndereco());
    System.out.printf ("CPF" + funcionario.getCpf ());
    System.out.printf("Sexo" + funcionario.getNome ());
}
}
