/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author DELL
 */
public class ed_venda_produto {
    private int ed_idVendaProduto;
    private int ed_Quantidade;
    private double ed_ValorUnitario;
    private double ed_Subtotal;
    
    private int ed_fk_Venda;
    private int ed_fk_Produtos;

    public int getEd_idVendaProduto() {
        return ed_idVendaProduto;
    }

    public void setEd_idVendaProduto(int ed_idVendaProduto) {
        this.ed_idVendaProduto = ed_idVendaProduto;
    }

    public int getEd_Quantidade() {
        return ed_Quantidade;
    }

    public void setEd_Quantidade(int ed_Quantidade) {
        this.ed_Quantidade = ed_Quantidade;
    }

    public double getEd_ValorUnitario() {
        return ed_ValorUnitario;
    }

    public void setEd_ValorUnitario(double ed_ValorUnitario) {
        this.ed_ValorUnitario = ed_ValorUnitario;
    }

    public double getEd_Subtotal() {
        return ed_Subtotal;
    }

    public void setEd_Subtotal(double ed_Subtotal) {
        this.ed_Subtotal = ed_Subtotal;
    }

    public int getEd_fk_Venda() {
        return ed_fk_Venda;
    }

    public void setEd_fk_Venda(int ed_fk_Venda) {
        this.ed_fk_Venda = ed_fk_Venda;
    }

    public int getEd_fk_Produtos() {
        return ed_fk_Produtos;
    }

    public void setEd_fk_Produtos(int ed_fk_Produtos) {
        this.ed_fk_Produtos = ed_fk_Produtos;
    }
}
