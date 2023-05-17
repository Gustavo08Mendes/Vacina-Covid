/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atendente;

import ABProjeto.ConnectionFactory;
import Cidadão.MenssagemDeErro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class ErroMenssagemAtendente {
        String RG;


    
    public ErroMenssagemAtendente(String RG){
    this.RG = RG;
    } 
    public String getRG(){
        return RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    
   
    public boolean existeAtendete(ErroMenssagemAtendente atendente) throws Exception{
    String sql = "SELECT * FROM usuario_atd WHERE RG = ?";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao();            
        PreparedStatement ps = c.prepareStatement(sql)){
    ps.setString(1, atendente.getRG());
    try (ResultSet rs = ps.executeQuery()){ 
      return rs.next();
    
        }
      }
    }
}
