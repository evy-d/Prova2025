/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.ed_produtos;
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
public class DaoEdProdutos extends DaoAbstract{
    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";
    
    @Override
    public void insert(Object object) {
        ed_produtos produto = (ed_produtos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into ed_produtos values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, produto.getEd_idProdutos());
            pst.setString(2, produto.getEd_Nome());
            pst.setDouble(3, produto.getEd_PrecoVenda());
            pst.setDouble(4, produto.getEd_PrecoPromocional());
            pst.setInt(5, produto.getEd_EstoqueAtual());
            pst.setDate(6, new java.sql.Date(produto.getEd_DataValidade().getTime()));
            pst.setString(7, produto.getEd_Promocao());
            pst.setInt(8, produto.getEd_fk_Sabores());
            pst.setInt(9, produto.getEd_fk_Fornecedor());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void delete(Object object) {
        ed_produtos produto = (ed_produtos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_produtos where ed_idProdutos=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, produto.getEd_idProdutos());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void update (Object object) {
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
