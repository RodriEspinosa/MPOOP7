/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class AnimalAereo extends Animal  {
   private int numeroAlas;

   public AnimalAereo() {
   }

   public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
      super(nombre, lugarOrigen, color);
      this.numeroAlas = numeroAlas;
   }

   public int getNumeroAlas() {
      return this.numeroAlas;
   }

   public void setNumeroAlas(int numeroAlas) {
      this.numeroAlas = numeroAlas;
   }

   public void volar() {
      System.out.println("El animal est\u00e1 volando");
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " AnimalAereo{numeroAlas=" + this.numeroAlas + "}";
   }
    
}
