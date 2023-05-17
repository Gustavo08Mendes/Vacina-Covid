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
public class TelaErroAdm {
    String RG;
  
    public TelaErroAdm(String RG){
    this.RG = RG;
    } 
    public String getRG(){
        return RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    
   
    public boolean existe(TelaErroAdm adm) throws Exception{
    String sql = "SELECT * FROM cadastroadministrador WHERE RG = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, adm.getRG());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
    
        }
      }
    }
    
}
