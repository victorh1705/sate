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
public class EstadoMatriculado implements EstadoAluno{
    
    public String getEstado() {
        return "Matriculado";
    }
    
    public String matricular(Aluno aluno) {
        return "Matrícula não efetuada uma vez que o aluno já está matriculado.";
    }
    
    public String formar(Aluno aluno) {
        aluno.setEstado(new EstadoFormado());
        return "Aluno pode se formar.";
    }
    
    public String trancar(Aluno aluno) {
        aluno.setEstado(new EstadoTrancado());
        return "Aluno pode trancar.";
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
