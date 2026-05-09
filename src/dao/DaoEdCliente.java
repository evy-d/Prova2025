package dao;

import bean.ed_cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEdCliente extends DaoAbstract {

    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_cliente ed_cliente = (ed_cliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            // 15 campos = 15 interrogações
            String sql = "insert into ed_cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, ed_cliente.getEd_idCliente());
            pst.setString(2, ed_cliente.getEd_Nome());
            pst.setString(3, ed_cliente.getEd_Cpf());
            pst.setString(4, ed_cliente.getEd_Rg());
            pst.setString(5, ed_cliente.getEd_Sexo());
            pst.setString(6, ed_cliente.getEd_Email());
            pst.setString(7, ed_cliente.getEd_Telefone());
            pst.setString(8, ed_cliente.getEd_Celular());
            pst.setString(9, ed_cliente.getEd_Cep());
            pst.setString(10, ed_cliente.getEd_Logradouro());
            pst.setString(11, ed_cliente.getEd_Numero());
            pst.setString(12, ed_cliente.getEd_Bairro());
            pst.setString(13, ed_cliente.getEd_Cidade());
            pst.setDate(14, new java.sql.Date(ed_cliente.getEd_DataCadastro().getTime()));
            pst.setString(15, ed_cliente.getEd_Ativo());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        ed_cliente ed_cliente = (ed_cliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "update ed_cliente set ed_Nome=?, ed_Cpf=?, ed_Rg=?, ed_Sexo=?, ed_Email=?, "
                       + "ed_Telefone=?, ed_Celular=?, ed_Cep=?, ed_Logradouro=?, ed_Numero=?, "
                       + "ed_Bairro=?, ed_Cidade=?, ed_DataCadastro=?, ed_Ativo=? "
                       + "where ed_idCliente=?";
            
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, ed_cliente.getEd_Nome());
            pst.setString(2, ed_cliente.getEd_Cpf());
            pst.setString(3, ed_cliente.getEd_Rg());
            pst.setString(4, ed_cliente.getEd_Sexo());
            pst.setString(5, ed_cliente.getEd_Email());
            pst.setString(6, ed_cliente.getEd_Telefone());
            pst.setString(7, ed_cliente.getEd_Celular());
            pst.setString(8, ed_cliente.getEd_Cep());
            pst.setString(9, ed_cliente.getEd_Logradouro());
            pst.setString(10, ed_cliente.getEd_Numero());
            pst.setString(11, ed_cliente.getEd_Bairro());
            pst.setString(12, ed_cliente.getEd_Cidade());
            pst.setDate(13, new java.sql.Date(ed_cliente.getEd_DataCadastro().getTime()));
            pst.setString(14, ed_cliente.getEd_Ativo());
            pst.setInt(15, ed_cliente.getEd_idCliente());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        ed_cliente ed_cliente = (ed_cliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_cliente where ed_idCliente=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, ed_cliente.getEd_idCliente());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdCliente.class.getName()).log(Level.SEVERE, null, ex);
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