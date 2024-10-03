/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class Pajaro extends AnimalAereo  {
   private String tipoPico;

   public Pajaro() {
   }

   public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
      super(nombre, lugarOrigen, color, numeroAlas);
      this.tipoPico = tipoPico;
   }

   public String getTipoPico() {
      return this.tipoPico;
   }

   public void setTipoPico(String tipoPico) {
      this.tipoPico = tipoPico;
   }

   public void recolectarRamas() {
      System.out.println("El pajaro est\u00e1 recolectando ramas");
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " Pajaro{tipoPico=" + this.tipoPico + "}";
   }   
}
