/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Cosmo Menezes
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in); 
       System.out.print("Digite o nome do aluno: ");
       String nome = teclado.nextLine();
       System.out.print("Digite a nota do aluno: ");
       float nota = teclado.nextFloat();
       System.out.println("A nota de " + nome + " é "+ nota);
      
    }
    
}
