package tabelas;

import annotation.TabelaAnnotation;

@TabelaAnnotation("Produtos")
public class Produtos {
    private int id;
    private String nome;
    private double preco;
    private String categoria;
    
    public Produtos() {
    	
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
    
    
}
