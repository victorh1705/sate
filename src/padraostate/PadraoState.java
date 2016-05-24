/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import estado.EstadoMatriculado;

/**
 *
 * @author Filipe
 */
public class PadraoState {
    
    public static void main(String args[]) {
        Aluno aluno = new Aluno();
        aluno.setNome("Vavá");
        aluno.setEstado(new EstadoMatriculado());
        System.out.println("Aluno " + aluno.getNome() + 
                " está no estado " + aluno.getEstado() + " - " + aluno.formar());
        System.out.println("Aluno " + aluno.getNome() + 
                " está no estado " + aluno.getEstado() + " - " + aluno.formar());
    }
    
}
