package DAO;

import Entidades.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SecretariaDAO extends GenericDAO{
    
    Connection cn;
    public List<Secretaria> getAllSecretaria() throws SQLException 
    {
        List<Secretaria> secretaria = new LinkedList<>();
        
        try (ResultSet rs = executeQuery("SELECT * FROM secretaria ")) {
            while(rs.next())
            {
                secretaria.add(populateSecretaria(rs));
            }
        }
        return secretaria;
    }
    
    public List<Secretaria> getAllSecretariaPorNome(String nome_secretaria) throws SQLException 
    {
        List<Secretaria> secretaria = new LinkedList<>();
        
        try ( //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
                ResultSet rs = executeQuery("SELECT * FROM secretaria WHERE nome_secretaria like ?",nome_secretaria+"%")) {
            while(rs.next())
            {
                secretaria.add(populateSecretaria(rs));
            }
        }
        return secretaria;
    }
    
    public List<Secretaria> getAllSecretariaPorCpf(String cpf) throws SQLException 
    {
        List<Secretaria> secretaria = new LinkedList<>();
        
        try ( //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
                ResultSet rs = executeQuery("SELECT * FROM secretaria WHERE cpf like ?",cpf+"%")) {
            while(rs.next())
            {
                secretaria.add(populateSecretaria(rs));
            }
        }
        return secretaria;
    }
    
    public Integer addSecretaria(Secretaria secretaria) throws SQLException
    {
        String query = "INSERT INTO secretaria(nome_secretaria, telefone, cpf, rg, endereco, sexo, senha) VALUES (?,?,?,?,?,?,?)";
        executeComand(query,  secretaria.getNome_secretaria(), secretaria.getTelefone(), secretaria.getCpf(), secretaria.getRg(), secretaria.getEndereco(), secretaria.getSexo(), secretaria.getSenha());        
        return secretaria.getId();
        
    }
    
    public void updateSecretaria(Secretaria secretaria) throws SQLException
    {

        String query = "UPDATE secretaria SET nome_secretaria = ?, telefone = ?, cpf = ?, rg = ?, endereco = ?, sexo = ?, senha = ? WHERE id =?";
        executeComand(query,  secretaria.getNome_secretaria(), secretaria.getTelefone(), secretaria.getCpf(), secretaria.getRg(), secretaria.getEndereco(), secretaria.getSexo(), secretaria.getSenha(), secretaria.getId());        

    }
    
    
    
    public void deleteSecretaria(Secretaria secretaria) throws SQLException{
        String query = "DELETE FROM secretaria WHERE id = ? ";
        executeComand(query, secretaria.getId());
        
        
    }
    
    public Secretaria LoginSecretaria(String cpf, String senha) throws SQLException{
        cn = new GenericDAO().getConnection();
        
        String query = "SELECT * FROM secretaria WHERE cpf = ? AND senha = ?";
        
        PreparedStatement pstm = cn.prepareStatement(query);
        pstm.setString(1, cpf);
        pstm.setString(2, senha);
        
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            Secretaria secretaria = new Secretaria();
            secretaria.setId(rs.getInt("id"));
            secretaria.setNome_secretaria(rs.getString("nome_secretaria"));
            secretaria.setTelefone(rs.getString("telefone"));
            secretaria.setCpf(rs.getString("cpf"));
            secretaria.setRg(rs.getString("rg"));
            secretaria.setEndereco(rs.getString("endereco"));
            secretaria.setSexo(rs.getString("sexo"));
            secretaria.setSenha(rs.getString("senha"));
            return secretaria;
        }else {
             return null;
        }
    }

    
        private Secretaria populateSecretaria(ResultSet rs) throws SQLException {
        Secretaria retorno = new Secretaria();
        
        retorno.setId(Integer.valueOf(rs.getString("id")));
        retorno.setNome_secretaria(rs.getString("nome_secretaria"));
        retorno.setTelefone(rs.getString("telefone"));
        retorno.setCpf(rs.getString("cpf"));
        retorno.setRg(rs.getString("rg"));
        retorno.setEndereco(rs.getString("endereco"));
        retorno.setSexo(rs.getString("sexo"));
        retorno.setSenha(rs.getString("senha"));
        
        return retorno;
        
    }
    
    
}
