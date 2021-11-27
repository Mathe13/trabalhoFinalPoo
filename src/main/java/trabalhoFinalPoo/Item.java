/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinalPoo;
/**
 *
 * @author matheus
 */
public class Item {
    private int id;
    private String nome;
    private String unidade_tamanho;
    private float tamanho;
    private float preco;
    private float custo;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the unidade_tamanho
     */
    public String getUnidade_tamanho() {
        return unidade_tamanho;
    }

    /**
     * @param unidade_tamanho the unidade_tamanho to set
     */
    public void setUnidade_tamanho(String unidade_tamanho) {
        this.unidade_tamanho = unidade_tamanho;
    }

    /**
     * @return the tamanho
     */
    public float getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }
    
    public Item(int id, String nome, String unidade_tamanho, float tamanho, float preco, float custo) {
        this.id = id;
        this.nome = nome;
        this.unidade_tamanho = unidade_tamanho;
        this.tamanho = tamanho;
        this.preco = preco;
        this.custo = custo;
    }

}
