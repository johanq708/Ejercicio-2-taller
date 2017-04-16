/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco b=new Banco("BBVA");
        Cuenta c1=new Cuenta(1212,"2016-11-7",5000,"pedro");
        Cuenta c2=new Cuenta(1213,"2015-8-6",7000,"juana");
        Tipo t1=new Tipo("consignar");
        Tipo t2=new Tipo("retirar");
        b.adicionarcuentas(c1);
        b.adicionarcuentas(c2);
        c1.crearmovimientos("2016-12-5", 5500, 500, t1);
        c1.crearmovimientos("2015-10-5", 6000, 1000, t2);
        c2.crearmovimientos("2015-12-10", 7500, 1000, t2);
        c2.crearmovimientos("2016-2-16", 8500, 1500, t1);
        b.mostrarcuentas();
    }
    
}
