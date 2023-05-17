/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cidadão;

import ABProjeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class Endereço {
    private String id;
    private String rua;
    private String cep;
    private String cidade;
    private String bairro;
    private String uf;
    private String id_endereço;

    public String getId_endereço() {
        return id_endereço;
    }

    public void setId_endereço(String id_endereço) {
        this.id_endereço = id_endereço;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
        public void inserirEndereçoCidadão (){
        //1: Definir o comando SQL
        String sql = "INSERT INTO endereco(id, rua, cep, cidade, bairro, uf) VALUES (?, ?, ?, ?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, id);
            ps.setString(2, rua);
            ps.setString(3, cep);
            ps.setString(4, cidade);
            ps.setString(5, bairro);
            ps.setString(6, uf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
