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
public class EstadoJubilado implements EstadoAluno{
    
    public String getEstado() {
        return "Jubilado";
    }
    
    public String matricular(Aluno aluno) {
        return "O aluno foi jubilado então não pode voltar a estar matriculado.";
    }
    
    public String formar(Aluno aluno) {
        return "Aluno foi jubilado, não pode formar.";
    }
    
    public String trancar(Aluno aluno) {
        return "Aluno foi jubilado, não pode trancar.";
    }

    public String jubilar(Aluno aluno) {
        return "Aluno já foi jubilado.";
    }
    
    public String transferir(Aluno aluno) {
        return "Aluno foi jubilado, não pode se transferir.";
    }
    
    public String abandonar(Aluno aluno) {
        return "Aluno já foi jubilado, não pode abandonar.";
    }
}
