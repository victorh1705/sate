/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import padraostate.Aluno;

/**
 *
 * @author Filipe
 */
public class EstadoTrancado implements EstadoAluno{
    
    public String getEstado() {
        return "Trancado";
    }
    
    public String matricular(Aluno aluno) {
        aluno.setEstado(new EstadoMatriculado());
        return "Aluno pode se matricular.";
    }
    
    public String formar(Aluno aluno) {
        return "Aluno trancado não pode se formar.";
    }
    
    public String trancar(Aluno aluno) {
        return "Aluno já está trancado.";
    }
    
    public String jubilar(Aluno aluno) {
        aluno.setEstado(new EstadoJubilado());
        return "Aluno pode ser jubilado.";
    }
    
    public String transferir(Aluno aluno) {
        aluno.setEstado(new EstadoTransferido());
        return "Aluno pode ser transferido.";
    }
    
    public String abandonar(Aluno aluno) {
        aluno.setEstado(new EstadoAbandonado());
        return "Aluno pode abandonar.";
    }
}
