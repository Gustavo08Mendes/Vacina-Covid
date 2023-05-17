/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atendente;

import ABProjeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class loginAtendente {
    //Atributos do atendente
    String nome;
    String Nasc;
    String data;
    String RG;
    String celular;
    String senha;
    String email;
    
    public loginAtendente(String nome, String senha){
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
    public String getNasc(){
    return Nasc;
    }
    public void setNasc(String Nasc){
        this.Nasc = Nasc;
    }
    
    public String getData(){
    return data;
    }
    public void setData(String data){
        this.data = data;
    }
    
    public String getRG(){
    return RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    
    public String getCelular(){
    return celular;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    } 
        public boolean existe(loginAtendente atendente) throws Exception{
    String sql = "SELECT * FROM usuario_atd WHERE nome = ? AND senha = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, atendente.getNome());
    ps.setString(2, atendente.getSenha());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
    
        }
      }
    }
}
