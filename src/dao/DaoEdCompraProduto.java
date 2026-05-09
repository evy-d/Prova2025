/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.ed_compra_produto;
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
public class DaoEdCompraProduto extends DaoAbstract {

    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_compra_produto compraProduto = (ed_compra_produto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into ed_compra_produto values (?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, compraProduto.getEd_idCompraProduto());
            pst.setInt(2, compraProduto.getEd_Quantidade());
            pst.setDouble(3, compraProduto.getEd_PrecoCusto());
            pst.setInt(4, compraProduto.getEd_fk_Compra());
            pst.setInt(5, compraProduto.getEd_fk_Produtos());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCompraProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
        ed_compra_produto compraProduto = (ed_compra_produto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_compra_produto where ed_idCompraProduto=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, compraProduto.getEd_idCompraProduto());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCompraProduto.class.getName()).log(Level.SEVERE, null, ex);
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