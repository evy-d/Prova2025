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
public class ed_compra {
   
    private int ed_idCompra;
    private Date ed_DataCompra;
    private double ed_Total;
    
    // FKs
    private int ed_fk_Fornecedor;
    private int ed_fk_Usuarios;

    public int getEd_idCompra() {
        return ed_idCompra;
    }

    public void setEd_idCompra(int ed_idCompra) {
        this.ed_idCompra = ed_idCompra;
    }

    public Date getEd_DataCompra() {
        return ed_DataCompra;
    }

    public void setEd_DataCompra(Date ed_DataCompra) {
        this.ed_DataCompra = ed_DataCompra;
    }

    public double getEd_Total() {
        return ed_Total;
    }

    public void setEd_Total(double ed_Total) {
        this.ed_Total = ed_Total;
    }

    public int getEd_fk_Fornecedor() {
        return ed_fk_Fornecedor;
    }

    public void setEd_fk_Fornecedor(int ed_fk_Fornecedor) {
        this.ed_fk_Fornecedor = ed_fk_Fornecedor;
    }

    public int getEd_fk_Usuarios() {
        return ed_fk_Usuarios;
    }

    public void setEd_fk_Usuarios(int ed_fk_Usuarios) {
        this.ed_fk_Usuarios = ed_fk_Usuarios;
    }

    
}
