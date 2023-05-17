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
public class PrimeiraDose {
    String Dose1;
    
    public PrimeiraDose(String Dose1){
    this.Dose1 = Dose1;
    } 

    public String getDose1() {
        return Dose1;
    }

    public void setDose1(String Dose1) {
        this.Dose1 = Dose1;
    }

    
   
        public boolean existe(PrimeiraDose doses) throws Exception{
    String sql = "SELECT * FROM cidadao WHERE PrimeiraDose = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, doses.getDose1());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
    
        }
      }
    }
  
}
