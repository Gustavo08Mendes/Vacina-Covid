/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atendente;

/**
 *
 * @author gusta
 */
public class relatorio {
        private String codigo,nome,nasc,cpf,email,celular,vacina,dose1,dose2;
    
    public relatorio(String codigo,String nome,String nasc,String cpf,String email,String celular,String vacina,String dose1,String dose2){
        this.codigo=codigo;
        this.nome=nome;
        this.nasc=nasc;
        this.cpf=cpf;
        this.email=email;
        this.celular=celular;
        this.vacina=vacina;
        this.dose1=dose1;
        this.dose2=dose2;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the nasc
     */
    public String getNasc() {
        return nasc;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @return the vacina
     */
    public String getVacina() {
        return vacina;
    }

    /**
     * @return the dose1
     */
    public String getDose1() {
        return dose1;
    }

    /**
     * @return the dose2
     */
    public String getDose2() {
        return dose2;
    }
}
