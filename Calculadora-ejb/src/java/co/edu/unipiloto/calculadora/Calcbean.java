/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author crist
 */
@Stateless
public class Calcbean implements CalcbeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return a+b;
    }
    @Override
    public Integer resta(int a, int b) {
        return a-b;
    }
  
    @Override
    public Integer multiplicacion(int a, int b) {
        return a*b;
    }
    @Override
    public Double division(double a, double b) {
        return a/b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
