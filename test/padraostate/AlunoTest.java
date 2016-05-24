/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraostate;

import estado.EstadoMatriculado;
import junit.framework.TestCase;
import org.junit.Before;

/**
 *
 * @author user
 */
public class AlunoTest extends TestCase {
    
    Aluno aluno;
    
    @Before
    public void setUp() throws Exception {
        super.setUp();
        aluno = new Aluno();

    }
    
    
    public void testEstadoAluno_EstadoMatriculadoParaMatriculado() {
        aluno.setEstado(new EstadoMatriculado());
        assertEquals("Matricula não efetuada uma vez que o aluno já está matriculado. ", aluno.matricular());
    }
    
    
    public 
    
}
