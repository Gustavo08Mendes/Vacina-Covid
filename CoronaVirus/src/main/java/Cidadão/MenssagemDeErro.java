/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cidadão;

import ABProjeto.ConnectionFactory;
import Administrador.LoginAdministrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class MenssagemDeErro {
    String cpf;


    
    public MenssagemDeErro(String cpf){
    this.cpf = cpf;
    } 
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
   
    public boolean existe(MenssagemDeErro cidadão) throws Exception{
    String sql = "SELECT * FROM cidadao WHERE cpf = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, cidadão.getCpf());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
    
        }
      }
    }
}
