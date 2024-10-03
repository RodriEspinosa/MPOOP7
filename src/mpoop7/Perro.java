/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class Perro extends AnimalTerrestre{
      private String colorCollar;

   public Perro() {
   }

   public Perro(String nombre, String lugarOrigen, String color, int numeroPatas, String colorCollar) {
      super(nombre, lugarOrigen, color, numeroPatas);
      this.colorCollar = colorCollar;
   }

   public String getColorCollar() {
      return this.colorCollar;
   }

   public void setColorCollar(String colorCollar) {
      this.colorCollar = colorCollar;
   }

   public void hacerTrucos() {
      System.out.println("El perro hace trucos");
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + " Perro{colorCollar=" + this.colorCollar + "}";
   } 
    
}
