/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import estado.EstadoAluno;

/**
 *
 * @author Filipe
 */
public class Aluno {
    
    private String nome;

    private EstadoAluno estado;

    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public EstadoAluno getEstado() {
        return estado;
    }

    /**
     * Set the value of estado
     *
     * @param estado new value of estado
     */
    public void setEstado(EstadoAluno estado) {
        this.estado = estado;
    }
   
    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String matricular() {
        return estado.matricular(this);
    }
    
    public String formar() {
        return estado.formar(this);
    }
    
    public String jubilar() {
        return estado.jubilar(this);
    }
    
    public String transferir() {
        return estado.transferir(this);
    }
    
    public String abandonar() {
        return estado.abandonar(this);
    }
            
            
}
