/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class Empleado {
   private String nombre;
   private int NumEmpleado;
   private float sueldo;

   public Empleado() {
   }

   public Empleado(String nombre, int NumEmpleado, float sueldo) {
      this.nombre = nombre;
      this.NumEmpleado = NumEmpleado;
      this.sueldo = sueldo;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNumEmpleado() {
      return this.NumEmpleado;
   }

   public void setNumEmpleado(int NumEmpleado) {
      this.NumEmpleado = NumEmpleado;
   }

   public float getSueldo() {
      return this.sueldo;
   }

   public void setSueldo(float sueldo) {
      this.sueldo = sueldo;
   }

   public void aumentarSueldo(int porcentajeDeAumento) {
      this.sueldo += this.sueldo * (float)porcentajeDeAumento / 100.0F;
      System.out.println("Sueldo aumentado a: " + this.sueldo);
   }

   public String toString() {
      return "Empleado{nombre=" + this.nombre + ", NumEmpleado=" + this.NumEmpleado + ", sueldo=" + this.sueldo + "}";
   }
    
}
