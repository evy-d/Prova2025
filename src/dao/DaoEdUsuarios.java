package dao;

import bean.ed_usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoEdUsuarios extends DaoAbstract {

    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_usuarios ed_usuarios = (ed_usuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into ed_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, ed_usuarios.getEd_idUsuarios());
            pst.setString(2, ed_usuarios.getEd_Nome());
            pst.setString(3, ed_usuarios.getEd_Apelido());
            pst.setString(4, ed_usuarios.getEd_Cpf());
            // Conversão de java.util.Date para java.sql.Date
            pst.setDate(5, new java.sql.Date(ed_usuarios.getEd_DataDeNascimento().getTime()));
            pst.setInt(6, ed_usuarios.getEdNivel());
            pst.setString(7, ed_usuarios.getEd_Senha());
            pst.setString(8, ed_usuarios.getEd_Ativo());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        ed_usuarios ed_usuarios = (ed_usuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "update ed_usuarios set ed_Nome=?, ed_Apelido=?, ed_Cpf=?, "
                       + "ed_DataDeNascimento=?, ed_Nivel=?, ed_Senha=?, ed_Ativo=? "
                       + "where ed_idUsuarios=?";
            
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, ed_usuarios.getEd_Nome());
            pst.setString(2, ed_usuarios.getEd_Apelido());
            pst.setString(3, ed_usuarios.getEd_Cpf());
            pst.setDate(4, new java.sql.Date(ed_usuarios.getEd_DataDeNascimento().getTime()));
            pst.setInt(5, ed_usuarios.getEdNivel());
            pst.setString(6, ed_usuarios.getEd_Senha());
            pst.setString(7, ed_usuarios.getEd_Ativo());
            pst.setInt(8, ed_usuarios.getEd_idUsuarios());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        ed_usuarios ed_usuarios = (ed_usuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_usuarios where ed_idUsuarios=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, ed_usuarios.getEd_idUsuarios());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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