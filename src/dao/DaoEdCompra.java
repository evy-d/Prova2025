/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.ed_compra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class DaoEdCompra extends DaoAbstract{
    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_compra compra = (ed_compra) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into ed_compra values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, compra.getEd_idCompra());
            pst.setDate(2, new java.sql.Date(compra.getEd_DataCompra().getTime()));
            pst.setDouble(3, compra.getEd_Total());
            pst.setString(4, compra.getEd_nota_fiscal());
            pst.setString(5, compra.getEd_status());
            pst.setInt(6, compra.getEd_fk_Fornecedor());
            pst.setInt(7, compra.getEd_fk_Usuarios());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        // Método vazio conforme solicitado
    }

    @Override
    public void delete(Object object) {
        ed_compra compra = (ed_compra) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_compra where ed_idCompra=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, compra.getEd_idCompra());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}
