/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop7;

/**
 *
 * @author joser
 */
public class Animal {
   private String nombre;
   private String lugarOrigen;
   private String color;

   public Animal() {
   }

   public Animal(String nombre, String lugarOrigen, String color) {
      this.nombre = nombre;
      this.lugarOrigen = lugarOrigen;
      this.color = color;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getLugarOrigen() {
      return this.lugarOrigen;
   }

   public void setLugarOrigen(String lugarOrigen) {
      this.lugarOrigen = lugarOrigen;
   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void sonido(String ruido) {
      System.out.println("El animal hace " + ruido);
   }

   public void comer() {
      System.out.println("El animal est\u00e1 comiendo");
   }

   public String toString() {
      return "Animal{nombre=" + this.nombre + ", lugarOrigen=" + this.lugarOrigen + ", color=" + this.color + "}";
   }
}
