/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface CalcbeanLocal {

    Integer suma(int a, int b);
    Integer resta(int a, int b);
    Double division(double a, double b);
    Integer multiplicacion(int a, int b);
    
}
