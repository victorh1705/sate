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
public class EstadoFormado implements EstadoAluno{
    
    public String getEstado() {
        return "Formado";
    }
    
    public String matricular(Aluno aluno) {
        return "O aluno formou então não pode estar matriculado.";
    }
    
    public String formar(Aluno aluno) {
        return "Aluno se formou, não pode formar de novo.";
    }
    
    public String trancar(Aluno aluno) {
        return "Aluno se formou, não pode trancar.";
    }

    public String jubilar(Aluno aluno) {
        return "Aluno não pode ser jubilado, pois já formou.";
    }
    
    public String transferir(Aluno aluno) {
        return "Aluno não pode ser transferido, pois já se formou.";
    }
    
    public String abandonar(Aluno aluno) {
        return "Aluno não pode abandonar, pois já se formou.";
    }
}
