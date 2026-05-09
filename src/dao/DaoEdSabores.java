/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.ed_sabores;
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
public class DaoEdSabores extends DaoAbstract {
    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_sabores sabores = (ed_sabores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            // 8 campos: ID + 7 atributos
            String sql = "insert into ed_sabores values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, sabores.getEd_idSabores());
            pst.setString(2, sabores.getEd_Nome());
            pst.setString(3, sabores.getEd_Descricao());
            pst.setString(4, sabores.getEd_TipoBase());
            pst.setInt(5, sabores.getEd_Calorias());
            pst.setString(6, sabores.getEd_Alergenos());
            pst.setString(7, sabores.getEd_Vegano());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdSabores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void delete(Object object) {
        ed_sabores sabores = (ed_sabores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_sabores where ed_idSabores=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, sabores.getEd_idSabores());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdSabores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void update(Object object) {
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
