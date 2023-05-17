/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atendente;

import ABProjeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author gusta
 */
public class EndereçoAtendente {
    private String id;
    private String rua;
    private String cep;
    private String cidade;
    private String bairro;
    private String uf;

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
    
        public void inserirEndereçoAtendente (){
        //1: Definir o comando SQL
        String sql = "INSERT INTO usuario_atd(id, rua, cep, cidade, bairro, uf) VALUES (?, ?, ?, ?, ?, ?)";
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
