package poofazentech;
public class Produto {
    protected String nome_produto;
    protected String categoria_produto;
    protected float qtd_estoque;
    protected float preco_produto;
    
    public Produto(){
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public float getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(float qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public float getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(float preco_produto) {
        this.preco_produto = preco_produto;
    }
    public void descontoProduto(float preco, float desconto){
    }
}
