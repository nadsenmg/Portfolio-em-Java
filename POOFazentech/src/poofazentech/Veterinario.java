package poofazentech;
public class Veterinario extends Funcionario {
   private boolean trabalhando;
   private String setor;

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    void salvarFuncionario(){
        System.out.print("NÃO FOI SALVO!");
    }
    
}
