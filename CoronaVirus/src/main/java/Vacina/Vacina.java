package Vacina;


import ABProjeto.ConnectionFactory;
import ABProjeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Vacina.Vacina;
import java.util.ArrayList;

public class Vacina {
    private String nome;
    private String intervalo;
    private String id;
    private String doses;

    public void setNome(String nome){
        this.nome = nome; 
    }
    public void setDoses(String doses) {
        this.doses = doses;
    }
    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public String getDoses(){
        return doses;
    }
    public String getIntervalo(){
        return intervalo;
    }
    public String getId(){
        return id;
    }
    

    public void inserir (){
        //1: Definir o comando SQL
        String sql = "INSERT INTO vacina(nome, doses, intervalo) VALUES (?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, doses);
            ps.setString(3, intervalo);
            
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void atualizar (){
    String sql = "UPDATE vacina SET nome = ?, intervalo = ?, doses = ? WHERE id = ?";    
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, intervalo);
            ps.setString(3, doses);
            ps.setString(4, id);            
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void Deletar (){
            String sql = "DELETE FROM vacina WHERE id = ?";
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
            }
            catch (Exception e){
            e.printStackTrace();
            }
            }
    public Vacina consultar(){
        Vacina va = null;    
        String sql = "SELECT * FROM vacina where nome = ? ";       
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                va = new Vacina();
                va.setNome(rs.getString("nome"));
                va.setDoses(rs.getString("doses"));
                va.setIntervalo(rs.getString("intervalo"));
                va.setId(rs.getString("id"));         
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }
        return va;
    }
    public String[] ListarNomeVacina(){
        ArrayList<String> vacinas = new ArrayList<>();   
        String sql = "SELECT nome FROM vacina";       
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                vacinas.add(rs.getString("nome"));
            }
            
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return vacinas.toArray(new String[vacinas.size()]);
    }
      
}
