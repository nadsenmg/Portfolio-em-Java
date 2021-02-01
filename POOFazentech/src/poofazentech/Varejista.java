package poofazentech;
public class Varejista {
    protected String nome_varejista;
    protected String cidade_varejista;
    
    public Varejista(){
    }

    public String getNome_varejista() {
        return nome_varejista;
    }

    public void setNome_varejista(String nome_varejista) {
        this.nome_varejista = nome_varejista;
    }

    public String getCidade_varejista() {
        return cidade_varejista;
    }

    public void setCidade_varejista(String cidade_varejista) {
        this.cidade_varejista = cidade_varejista;
    }
    
    public void salvarVarejista(){
        System.out.print("Salvo com Sucesso");
    }
}
