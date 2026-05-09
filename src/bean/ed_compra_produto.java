/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author DELL
 */
public class ed_compra_produto {
    
   private int ed_idCompraProduto;
    private int ed_Quantidade;
    private double ed_PrecoCusto;
    
    private int ed_fk_Compra;
    private int ed_fk_Produtos;

    public int getEd_idCompraProduto() {
        return ed_idCompraProduto;
    }

    public void setEd_idCompraProduto(int ed_idCompraProduto) {
        this.ed_idCompraProduto = ed_idCompraProduto;
    }

    public int getEd_Quantidade() {
        return ed_Quantidade;
    }

    public void setEd_Quantidade(int ed_Quantidade) {
        this.ed_Quantidade = ed_Quantidade;
    }

    public double getEd_PrecoCusto() {
        return ed_PrecoCusto;
    }

    public void setEd_PrecoCusto(double ed_PrecoCusto) {
        this.ed_PrecoCusto = ed_PrecoCusto;
    }

    public int getEd_fk_Compra() {
        return ed_fk_Compra;
    }

    public void setEd_fk_Compra(int ed_fk_Compra) {
        this.ed_fk_Compra = ed_fk_Compra;
    }

    public int getEd_fk_Produtos() {
        return ed_fk_Produtos;
    }

    public void setEd_fk_Produtos(int ed_fk_Produtos) {
        this.ed_fk_Produtos = ed_fk_Produtos;
    }
    
    
}
