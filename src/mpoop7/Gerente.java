package mpoop7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joser
 */
public class Gerente  extends Empleado{
    private float presupuesto;

   public Gerente() {
   }

   public Gerente(String nombre, int numEmpleado, float sueldo, float presupuesto) {
      super(nombre, numEmpleado, sueldo);
      this.presupuesto = presupuesto;
   }

   public float getPresupuesto() {
      return this.presupuesto;
   }

   public void setPresupuesto(float presupuesto) {
      this.presupuesto = presupuesto;
   }

   public float asignarPresupuesto(float presupuesto) {
      this.presupuesto = presupuesto;
      return presupuesto;
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " Gerente{presupuesto= " + this.presupuesto + "}";
   }
}
