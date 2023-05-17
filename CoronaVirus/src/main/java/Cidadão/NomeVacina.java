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

/**
 *
 * @author gusta
 */
public class NomeVacina {
    private String id;
    private String nome;

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
    
    public Cidadão consulta(){

        Cidadão pe = null;
        String sql = "SELECT * FROM vacina where nome = ? ";
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pe = new Cidadão();
                pe.setCodigo(rs.getString("codigo"));
                pe.setNome(rs.getString("nome"));
                pe.setNasc(rs.getString("nasc"));
                pe.setCpf(rs.getString("cpf"));
                pe.setEmail(rs.getString("email"));
                pe.setCelular(rs.getString("celular"));  
                pe.setPrimeiraDose(rs.getString("PrimeiraDose"));
                pe.setSegundaDose(rs.getString("SegundaDose"));
                pe.setNomeDaVacinaAplicada(rs.getString("nomeDaVacinaTomada"));
            } // if

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pe;
    }
}
