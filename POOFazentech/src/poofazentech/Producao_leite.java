package poofazentech;
public class Producao_leite {
    protected String nome_vaca;
    protected String especie_vaca;
    protected String ultima_ordenha;
    protected float temperatura_leite;
    protected float qtd_quarto_mamario;
    protected boolean inseminacao;
    protected String estimativa_parto;
    protected String secagem;
    protected String ruminacao_tempo;
    
    public Producao_leite(){
    }

    public String getNome_vaca() {
        return nome_vaca;
    }

    public void setNome_vaca(String nome_vaca) {
        this.nome_vaca = nome_vaca;
    }

    public String getEspecie_vaca() {
        return especie_vaca;
    }

    public void setEspecie_vaca(String especie_vaca) {
        this.especie_vaca = especie_vaca;
    }

    public String getUltima_ordenha() {
        return ultima_ordenha;
    }

    public void setUltima_ordenha(String ultima_ordenha) {
        this.ultima_ordenha = ultima_ordenha;
    }

    public float getTemperatura_leite() {
        return temperatura_leite;
    }

    public void setTemperatura_leite(float temperatura_leite) {
        this.temperatura_leite = temperatura_leite;
    }

    public float getQtd_quarto_mamario() {
        return qtd_quarto_mamario;
    }

    public void setQtd_quarto_mamario(float qtd_quarto_mamario) {
        this.qtd_quarto_mamario = qtd_quarto_mamario;
    }

    public boolean getInseminacao() {
        return inseminacao;
    }

    public void setInseminacao(boolean inseminacao) {
        this.inseminacao = inseminacao;
    }

    public String getEstimativa_parto() {
        return estimativa_parto;
    }

    public void setEstimativa_parto(String estimativa_parto) {
        this.estimativa_parto = estimativa_parto;
    }

    public String getSecagem() {
        return secagem;
    }

    public void setSecagem(String secagem) {
        this.secagem = secagem;
    }

    public String getRuminacao_tempo() {
        return ruminacao_tempo;
    }

    public void setRuminacao_tempo(String ruminacao_tempo) {
        this.ruminacao_tempo = ruminacao_tempo;
    }
    
    public void salvarDadosVaca(){
    }
}
