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
public class Cuenta {
    private int numerocuenta;
    private String fechacreacion;
    private double saldoactual;
    private String titular;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numerocuenta, String fechacreacion, double saldoactual, String titular) {
        this.numerocuenta = numerocuenta;
        this.fechacreacion = fechacreacion;
        this.saldoactual = saldoactual;
        this.titular = titular;
        this.movimientos = new ArrayList<>();
    }
    
    public void crearmovimientos(String f, int sa, int m, Tipo t){
        Movimiento mov=new Movimiento(f,sa,m,t);
        movimientos.add(mov);
    }
    
    public void listarmovimientos(){
        System.out.println("Los movimientos de esta cuenta son:");
        for(int i=0;i<movimientos.size();i++){
            System.out.println(movimientos.get(i));
        }
    }
    
    @Override
    public String toString() {
        return  "El titular de la cuenta es " + titular + ", el numero de cuenta es " + numerocuenta + ", su creacion fue en " + fechacreacion + ", el saldo actual es " + saldoactual;
    }
    
}
