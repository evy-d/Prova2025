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
public class ed_venda {
    private int ed_idVenda;
    private Date ed_DataVenda;
    private double ed_Total;
    private String ed_FormaPagamento;
    private String ed_status;
    
    private int ed_fk_Cliente;
    private int ed_fk_Usuarios;
    

    public int getEd_idVenda() {
        return ed_idVenda;
    }

    public void setEd_idVenda(int ed_idVenda) {
        this.ed_idVenda = ed_idVenda;
    }

    public Date getEd_DataVenda() {
        return ed_DataVenda;
    }

    public void setEd_DataVenda(Date ed_DataVenda) {
        this.ed_DataVenda = ed_DataVenda;
    }

    public double getEd_Total() {
        return ed_Total;
    }

    public void setEd_Total(double ed_Total) {
        this.ed_Total = ed_Total;
    }

    public String getEd_FormaPagamento() {
        return ed_FormaPagamento;
    }

    public void setEd_FormaPagamento(String ed_FormaPagamento) {
        this.ed_FormaPagamento = ed_FormaPagamento;
    }

    public String getEd_status() {
        return ed_status;
    }

    public void setEd_status(String ed_status) {
        this.ed_status = ed_status;
    }

    public int getEd_fk_Cliente() {
        return ed_fk_Cliente;
    }

    public void setEd_fk_Cliente(int ed_fk_Cliente) {
        this.ed_fk_Cliente = ed_fk_Cliente;
    }

    public int getEd_fk_Usuarios() {
        return ed_fk_Usuarios;
    }

    public void setEd_fk_Usuarios(int ed_fk_Usuarios) {
        this.ed_fk_Usuarios = ed_fk_Usuarios;
    }
    
}
