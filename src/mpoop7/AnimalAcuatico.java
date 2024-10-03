/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class AnimalAcuatico extends Animal  {
   private int numeroAletas;

   public AnimalAcuatico() {
   }

   public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numeroAletas) {
      super(nombre, lugarOrigen, color);
      this.numeroAletas = numeroAletas;
   }

   public int getNumeroAletas() {
      return this.numeroAletas;
   }

   public void setNumeroAletas(int numeroAletas) {
      this.numeroAletas = numeroAletas;
   }

   public void nadar() {
      System.out.println("El animal est\u00e1 nadando");
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " AnimalAcuatico{numeroAletas=" + this.numeroAletas + "}";
   }   
}
