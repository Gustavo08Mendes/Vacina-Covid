package Cidadão;

import ABProjeto.ConnectionFactory;
import ABProjeto.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Cidadão{
    
    private String id;
    private String codigo;
    private String nome;
    private String nasc;
    private String cpf;
    private String email;
    private String celular; 
    private String PrimeiraDose;
    private String SegundaDose;
    private String nomeDaVacinaAplicada;
    private String rua;
    private String CEP;
    private String cidade;
    private String bairro;
    private String uf;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getNomeDaVacinaAplicada() {
        return nomeDaVacinaAplicada;
    }

    public void setNomeDaVacinaAplicada(String nomeDaVacinaAplicada) {
        this.nomeDaVacinaAplicada = nomeDaVacinaAplicada;
    }
    

    public String getSegundaDose() {
        return SegundaDose;
    }

    public void setSegundaDose(String SegundaDose) {
        this.SegundaDose = SegundaDose;
    }

    public String getPrimeiraDose() {
        return PrimeiraDose;
    }

    public void setPrimeiraDose(String PrimeiraDose) {
        this.PrimeiraDose = PrimeiraDose;
    }
    
    private String intervalo;

    public String getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNasc() {
        return nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public void inserir (){
        //1: Definir o comando SQL
        String sql = "INSERT INTO cidadao(codigo, nome, nasc, cpf, email, celular, PrimeiraDose, SegundaDose, nomeDaVacinaAplicada, rua, CEP, cidade, bairro, uf) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, codigo);
            ps.setString(2, nome);
            ps.setString(3, nasc);
            ps.setString(4, cpf);
            ps.setString(5, email);
            ps.setString(6, celular);
            ps.setString(7, PrimeiraDose);
            ps.setString(8, SegundaDose);
            ps.setString(9, nomeDaVacinaAplicada);
            ps.setString(10, rua);
            ps.setString(11, CEP);
            ps.setString(12, cidade);
            ps.setString(13, bairro);
            ps.setString(14, uf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void atualizar (){
        String sql = "UPDATE cidadao SET nome = ?, nasc = ?, cpf = ?, email = ?, celular = ?, "
                + "PrimeiraDose = ?, SegundaDose = ?, nomeDaVacinaAplicada = ? WHERE cpf = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, nome);
            ps.setString(2, nasc);
            ps.setString(3, cpf);
            ps.setString(4, email);
            ps.setString(5, celular);
            ps.setString(6, PrimeiraDose);
            ps.setString(7, SegundaDose);
            ps.setString(8, nomeDaVacinaAplicada);
            ps.setString(9, cpf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public void atualizarDose1(){
       String sql = "UPDATE cidadao SET PrimeiraDose = ? WHERE cpf = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, PrimeiraDose);
            ps.setString(2, cpf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
         public void atualizarDose2(){
       String sql = "UPDATE cidadao SET SegundaDose = ? WHERE cpf = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, SegundaDose);
            ps.setString(2, cpf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
         public void atualizarNome1(){
       String sql = "UPDATE cidadao SET nomeDaVacinaAplicada = ? WHERE cpf = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, nomeDaVacinaAplicada);
            ps.setString(2, cpf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void Deletar (){
            //1: Definir o comando SQL
            String sql = "DELETE FROM cidadao WHERE cpf = ?";
            //2: Abrir uma conexão
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, cpf);
            //5: Executa o comando
            ps.execute();
            }
            catch (Exception e){
            e.printStackTrace();
            }
            }
    
    public Cidadão consulta(){

        Cidadão pe = null;
        String sql = "SELECT * FROM cidadao where cpf = ? ";
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
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
                pe.setNomeDaVacinaAplicada(rs.getString("nomeDaVacinaAplicada"));
                pe.setRua(rs.getString("rua"));
                pe.setCEP(rs.getString("CEP"));
                pe.setCidade(rs.getString("cidade"));
                pe.setBairro(rs.getString("bairro"));
                pe.setUf(rs.getString("uf"));
            } // if

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pe;
    }
    
    
    public Cidadão Verificar(){

        Cidadão pe = null;
        String sql = "SELECT * FROM cidadao where nome = ? ";
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            JOptionPane.showMessageDialog(null,"Nome de usuario ja existente", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
            } // if

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pe;
    } 
    public String[] ListaDeIntervaloVacina(){
        ArrayList<String> vacinas = new ArrayList<>();   
        String sql = "SELECT intervalo FROM vacina";       
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                vacinas.add(rs.getString("intervalo"));
                
            }                            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vacinas.toArray(new String[vacinas.size()]);
    }
    public Cidadão consultaIntervalo(){

        Cidadão pe = null;
        String sql = "SELECT * FROM vacina where nome = ? ";
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pe = new Cidadão();
                pe.setIntervalo(rs.getString("intervalo"));
            } // if

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pe;
    }
    
    public void atualizarDoses(){
        String sql = "UPDATE vacina SET PrimeiraDose = ? WHERE cpf = ?";
                
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);          
            ps.setString(1, PrimeiraDose);
            ps.setString(2, cpf);
            //5: Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String[] NomesVacina(){
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