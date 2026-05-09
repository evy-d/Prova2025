/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class ed_produtos {
    private int ed_idProdutos;
    private String ed_Nome;
    private double ed_PrecoVenda;
    private double ed_PrecoPromocional;
    private int ed_EstoqueAtual;
    private Date ed_DataValidade;
    private String ed_Promocao; // "S" ou "N"
    private String ed_TemperaturaIdeal;
    
    private int ed_fk_Sabores;
    private int ed_fk_Fornecedor;

    public int getEd_idProdutos() {
        return ed_idProdutos;
    }

    public void setEd_idProdutos(int ed_idProdutos) {
        this.ed_idProdutos = ed_idProdutos;
    }

    public String getEd_Nome() {
        return ed_Nome;
    }

    public void setEd_Nome(String ed_Nome) {
        this.ed_Nome = ed_Nome;
    }

    public double getEd_PrecoVenda() {
        return ed_PrecoVenda;
    }

    public void setEd_PrecoVenda(double ed_PrecoVenda) {
        this.ed_PrecoVenda = ed_PrecoVenda;
    }

    public double getEd_PrecoPromocional() {
        return ed_PrecoPromocional;
    }

    public void setEd_PrecoPromocional(double ed_PrecoPromocional) {
        this.ed_PrecoPromocional = ed_PrecoPromocional;
    }

    public int getEd_EstoqueAtual() {
        return ed_EstoqueAtual;
    }

    public void setEd_EstoqueAtual(int ed_EstoqueAtual) {
        this.ed_EstoqueAtual = ed_EstoqueAtual;
    }

    public Date getEd_DataValidade() {
        return ed_DataValidade;
    }

    public void setEd_DataValidade(Date ed_DataValidade) {
        this.ed_DataValidade = ed_DataValidade;
    }

    public String getEd_Promocao() {
        return ed_Promocao;
    }

    public void setEd_Promocao(String ed_Promocao) {
        this.ed_Promocao = ed_Promocao;
    }

    public String getEd_TemperaturaIdeal() {
        return ed_TemperaturaIdeal;
    }

    public void setEd_TemperaturaIdeal(String ed_TemperaturaIdeal) {
        this.ed_TemperaturaIdeal = ed_TemperaturaIdeal;
    }

    public int getEd_fk_Sabores() {
        return ed_fk_Sabores;
    }

    public void setEd_fk_Sabores(int ed_fk_Sabores) {
        this.ed_fk_Sabores = ed_fk_Sabores;
    }

    public int getEd_fk_Fornecedor() {
        return ed_fk_Fornecedor;
    }

    public void setEd_fk_Fornecedor(int ed_fk_Fornecedor) {
        this.ed_fk_Fornecedor = ed_fk_Fornecedor;
    }
    
    
}
