/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.ed_fornecedor;
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
public class DaoEdFornecedor extends DaoAbstract{
    private String url = "jdbc:mysql://localhost:3306/db_evelyn_dutra"; 
    private String user = "root"; 
    private String password = "";

    @Override
    public void insert(Object object) {
        ed_fornecedor fornecedor = (ed_fornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            // 15 campos = 15 interrogações
            String sql = "insert into ed_fornecedor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, fornecedor.getEd_idFornecedor());
            pst.setString(2, fornecedor.getEd_RazaoSocial());
            pst.setString(3, fornecedor.getEd_NomeFantasia());
            pst.setString(4, fornecedor.getEd_Cnpj());
            pst.setString(5, fornecedor.getEd_InscricaoEstadual());
            pst.setString(6, fornecedor.getEd_Email());
            pst.setString(7, fornecedor.getEd_Telefone());
            pst.setString(8, fornecedor.getEd_Representante());
            pst.setString(9, fornecedor.getEd_Cep());
            pst.setString(10, fornecedor.getEd_Logradouro());
            pst.setString(11, fornecedor.getEd_Numero());
            pst.setString(12, fornecedor.getEd_Bairro());
            pst.setString(13, fornecedor.getEd_Cidade());
            pst.setDate(14, new java.sql.Date(fornecedor.getEd_DataDeCadastro().getTime()));
            pst.setString(15, fornecedor.getEd_Ativo());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        ed_fornecedor fornecedor = (ed_fornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "update ed_fornecedor set ed_RazaoSocial=?, ed_NomeFantasia=?, ed_Cnpj=?, "
                       + "ed_InscricaoEstadual=?, ed_Email=?, ed_Telefone=?, ed_Representante=?, "
                       + "ed_Cep=?, ed_Logradouro=?, ed_Numero=?, ed_Bairro=?, ed_Cidade=?, "
                       + "ed_DataDeCadastro=?, ed_Ativo=? where ed_idFornecedor=?";
            
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, fornecedor.getEd_RazaoSocial());
            pst.setString(2, fornecedor.getEd_NomeFantasia());
            pst.setString(3, fornecedor.getEd_Cnpj());
            pst.setString(4, fornecedor.getEd_InscricaoEstadual());
            pst.setString(5, fornecedor.getEd_Email());
            pst.setString(6, fornecedor.getEd_Telefone());
            pst.setString(7, fornecedor.getEd_Representante());
            pst.setString(8, fornecedor.getEd_Cep());
            pst.setString(9, fornecedor.getEd_Logradouro());
            pst.setString(10, fornecedor.getEd_Numero());
            pst.setString(11, fornecedor.getEd_Bairro());
            pst.setString(12, fornecedor.getEd_Cidade());
            pst.setDate(13, new java.sql.Date(fornecedor.getEd_DataDeCadastro().getTime()));
            pst.setString(14, fornecedor.getEd_Ativo());
            pst.setInt(15, fornecedor.getEd_idFornecedor());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        ed_fornecedor fornecedor = (ed_fornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "delete from ed_fornecedor where ed_idFornecedor=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fornecedor.getEd_idFornecedor());
            
            pst.executeUpdate();
            cnt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEdFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
