/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class AnimalTerrestre  extends Animal {
   private int numeroPatas;

   public AnimalTerrestre() {
   }

   public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numeroPatas) {
      super(nombre, lugarOrigen, color);
      this.numeroPatas = numeroPatas;
   }

   public int getNumeroPatas() {
      return this.numeroPatas;
   }

   public void setNumeroPatas(int numeroPatas) {
      this.numeroPatas = numeroPatas;
   }

   public void correr() {
      System.out.println("El animal est\u00e1 corriendo");
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " AnimalTerrestre{numeroPatas=" + this.numeroPatas + "}";
   }
}
