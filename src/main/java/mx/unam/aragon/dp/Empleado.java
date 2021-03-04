/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;


public class Empleado extends Personas{
    
    private int Numeroempleado;
    private String departamento;
    private float Sueldo;
    private int horasExtras;

    public Empleado() {
    }

    public Empleado(int Numeroempleado, String departamento, float Sueldo, int horasExtras) {
        this.Numeroempleado = Numeroempleado;
        this.departamento = departamento;
        this.Sueldo = Sueldo;
        this.horasExtras = horasExtras;
    }

    public Empleado(int Numeroempleado, String departamento, float Sueldo, int horasExtras, String nombre, String apPaterno, String apMaterno, int edad, String curp) {
        super(nombre, apPaterno, apMaterno, edad, curp);
        this.Numeroempleado = Numeroempleado;
        this.departamento = departamento;
        this.Sueldo = Sueldo;
        this.horasExtras = horasExtras;
    }
    
    
    

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNumeroempleado() {
        return Numeroempleado;
    }

    public void setNumeroempleado(int Numeroempleado) {
        this.Numeroempleado = Numeroempleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Numeroempleado=" + Numeroempleado + ", departamento=" + departamento + ", Sueldo=" + Sueldo + ", horasExtras=" + horasExtras + '}';
    }
    
    
    
    
    
    
}
