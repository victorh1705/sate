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
public class EstadoTransferido implements EstadoAluno{
    
    public String getEstado() {
        return "Transferido";
    }
    
    public String matricular(Aluno aluno) {
        return "Aluno foi transferido, não pode voltar a estar matriculado.";
    }
    
    public String formar(Aluno aluno) {
        return "Aluno foi transferido, não pode se formar.";
    }
    
    public String trancar(Aluno aluno) {
        return "Aluno foi transferido, não pode trancar.";
    }
    
    public String jubilar(Aluno aluno) {
        return "Aluno foi transferido, não pode ser jubilado.";
    }
    
    public String transferir(Aluno aluno) {
        return "Aluno já foi transferido.";
    }
    
    public String abandonar(Aluno aluno) {
        return "Aluno foi transferido, não pode abandonar.";
    }
}
