/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.ed_venda_produto;
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
public class DaoEdVendaProduto extends DaoAbstract {

    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_venda_produto vendaProduto = (ed_venda_produto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into ed_venda_produto values (?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, vendaProduto.getEd_idVendaProduto());
            pst.setInt(2, vendaProduto.getEd_Quantidade());
            pst.setDouble(3, vendaProduto.getEd_ValorUnitario());
            pst.setDouble(4, vendaProduto.getEd_Subtotal());
            pst.setInt(5, vendaProduto.getEd_fk_Venda());
            pst.setInt(6, vendaProduto.getEd_fk_Produtos());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdVendaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
        ed_venda_produto vendaProduto = (ed_venda_produto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_venda_produto where ed_idVendaProduto=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendaProduto.getEd_idVendaProduto());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdVendaProduto.class.getName()).log(Level.SEVERE, null, ex);
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