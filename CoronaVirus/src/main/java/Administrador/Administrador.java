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
public class Administrador {
    
    private String id;
    private String nome;
    private String nasc;
    private String rg;
    private String celular;
    private String senha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    public void inserir (){
        //1: Definir o comando SQL
        String sql = "INSERT INTO usuario_adm(id, nome, nasc, RG, celular, senha) VALUES (?, ?, ?, ?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, id);
            ps.setString(2, nome);
            ps.setString(3, nasc);
            ps.setString(4, rg);
            ps.setString(5, celular);
            ps.setString(6, senha);
            ps.execute();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void atualizar (){
        String sql = "UPDATE usuario_adm SET nome = ?, nasc = ?, RG = ?, celular = ?, senha = ? WHERE RG = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, nome);
            ps.setString(2, nasc);
            ps.setString(3, rg);
            ps.setString(4, celular);
            ps.setString(5, senha);
            ps.setString(6, rg);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
        public Administrador consulta(){

        Administrador a = null;
        //Comando Sql
        String sql = "SELECT * FROM usuario_adm WHERE rg = ? ";
        //Abre uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, rg);
            //Compila os commandos
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = new Administrador();
                //Preenche os campos faltando
                a.setId(rs.getString("id"));
                a.setNome(rs.getString("nome"));
                a.setNasc(rs.getString("nasc"));
                a.setRg(rs.getString("RG"));
                a.setSenha(rs.getString("senha"));
                a.setCelular(rs.getString("celular"));  
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return a;
    }
        public void Deletar (){
            //1: Definir o comando SQL
            String sql = "DELETE FROM usuario_adm WHERE id = ?";
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
