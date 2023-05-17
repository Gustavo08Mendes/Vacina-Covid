/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import ABProjeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class LoginAdministrador {
    //Atributos do atendente
    String nome;
    String senha;

    
    public LoginAdministrador(String nome, String senha){
    this.nome = nome;
    this.senha = senha;
    } 
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
   
        public boolean existe(LoginAdministrador administrador) throws Exception{
    String sql = "SELECT * FROM usuario_adm WHERE nome = ? AND senha = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, administrador.getNome());
    ps.setString(2, administrador.getSenha());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
    
        }
      }
    }
  
}
