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
public class Movimiento {
    private String fecha;
    private int saldoanterior;
    private int monto;
    private Tipo tipo;

    public Movimiento(String fecha, int saldoanterior, int monto, Tipo tipo) {
        this.fecha = fecha;
        this.saldoanterior = saldoanterior;
        this.monto = monto;
        this.tipo = tipo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSaldoanterior(int saldoanterior) {
        this.saldoanterior = saldoanterior;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "El movimiento fue: " + tipo.toString() + ". La fecha del movimineto fue " + fecha + ", el saldo anterior era " + saldoanterior + ", el monto del movimiento " + monto;
    }
    
}
