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
public class EstadoAbandonado implements EstadoAluno{
    
    public String getEstado() {
        return "Abandonado";
    }
    
    public String matricular(Aluno aluno) {
        return "O aluno abandonou então não pode voltar a estar matriculado.";
    }
    
    public String formar(Aluno aluno) {
        return "Aluno abandonou, não pode formar.";
    }
    
    public String trancar(Aluno aluno) {
        return "Aluno abandonou, não pode trancar.";
    }

    public String jubilar(Aluno aluno) {
        return "Aluno não pode ser jubilado, pois já abandonou o curso.";
    }
    
    public String transferir(Aluno aluno) {
        return "Aluno não pode ser transferido, pois já abandonou o curso.";
    }
    
    public String abandonar(Aluno aluno) {
        return "Aluno já abandonou o curso.";
    }
}
