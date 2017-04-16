/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Banco {
    private String nombre;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tipo> tipos;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
        this.tipos = tipos;
    }
    
    public void adicionarcuentas(Cuenta c){
        cuentas.add(c);
    }
    
    public void mostrarcuentas(){
        for (int i=0;i<cuentas.size();i++){
            System.out.println(cuentas.get(i));
            cuentas.get(i).listarmovimientos();
        }
    }
}


