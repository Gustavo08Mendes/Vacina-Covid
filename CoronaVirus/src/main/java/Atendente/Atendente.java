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
public class Atendente {
    //Atributos do atendente
    String nome;
    String Nasc;
    String RG;
    String celular;
    String senha;
    String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    
    public void Cadastrar(){
        //1: Definir o comando SQL
        String sql = "INSERT INTO usuario_atd(nome, Nasc, RG, celular, senha) VALUES (?, ?, ?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, Nasc);
            ps.setString(3, RG);
            ps.setString(4, celular);
            ps.setString(5, senha);

            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Atendente consulta(){

        Atendente a = null;
        //Comando Sql
        String sql = "SELECT * FROM usuario_atd WHERE rg = ? ";
        //Abre uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, RG);
            //Compila os commandos
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = new Atendente();
                //Preenche os campos faltando
                a.setId(rs.getString("id"));
                a.setNome(rs.getString("nome"));
                a.setNasc(rs.getString("nasc"));
                a.setRG(rs.getString("RG"));
                a.setSenha(rs.getString("senha"));
                a.setCelular(rs.getString("celular"));  
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;
    }
    
        public void atualizar (){
        String sql = "UPDATE usuario_atd SET nome = ?, Nasc = ?, RG = ?, celular = ?, senha = ? WHERE RG = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, nome);
            ps.setString(2, Nasc);
            ps.setString(3, RG);
            ps.setString(4, celular);
            ps.setString(5, senha);
            ps.setString(6, RG);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void Deletar (){
            //1: Definir o comando SQL
            String sql = "DELETE FROM usuario_atd WHERE id = ?";
            //2: Abrir uma conexão
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, id);
            //5: Executa o comando
            ps.execute();
            }
            catch (Exception e){
            e.printStackTrace();
            }
            }
}
 