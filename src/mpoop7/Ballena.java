/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class Ballena  extends AnimalAcuatico {
   private int largo;

   public Ballena() {
   }

   public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas, int largo) {
      super(nombre, lugarOrigen, color, numeroAletas);
      this.largo = largo;
   }

   public int getLargo() {
      return this.largo;
   }

   public void setLargo(int largo) {
      this.largo = largo;
   }

   public void pelearConPinocho() {
      System.out.println("La ballena est\u00e1 peleando con Pinocho");
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " Ballena{largo=" + this.largo + "}";
   }
    
}
