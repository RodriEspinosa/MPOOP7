/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

/**
 *
 * @author 
 * Espinosa Ramirez Jose Rodrigo 
 * Martinez Gil Samantha Abigail
 * Olayo Ramirez Emiliano 
 * Descripcion:Esta practica crea clases de objetos y que le podemos colocar sus atributos 
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("### EMPLEADOS ###");
      Empleado empleado1 = new Empleado();/*Creamos un nuevo empleado*/
      empleado1.setNombre("Abigail");/*le ponemos como atributo en nombre:Abigail*/
      empleado1.setNumEmpleado(321009700);/*le asignamos su numero de  empleado*/
      empleado1.setSueldo(15000.0F);/* le asignamos su sueldo*/
      Empleado empleado2 = new Empleado("Emiliano", 321009701, 14000.0F);/*Mismos tipos de atributos, pero con otros datos, creando otro empleado */
      System.out.println(empleado1);/*Imprimimos el objeto  */
      empleado1.aumentarSueldo(25);/*le asignamos su porcentaje de aumento de sueldo  */
      System.out.println(empleado2);/*Imprimimos el objeto  */
      empleado2.aumentarSueldo(15);/*le asignamos su porcentaje de aumento de sueldo  */
      Gerente gerente1 = new Gerente("Rodrigo", 312901389, 25000.0F, 555555.0F);/*se crea un gerente, teniedo siendo extension de la clase de empleaod , agregando nuevos atributos */
      System.out.println(gerente1);/*imprime al empleado que se creo */
      Gerente gerente2 = new Gerente();/*Creacion de otro gerente */
      System.out.println(gerente2);/*impresion de nuevo gerente */
      gerente2.setNombre("Camila");/*Asignamos en el  nombre :Camila */
      gerente2.setNumEmpleado(23864);/*Asignamos  el numero empleado*/
      gerente2.setSueldo(35000.0F);/*Asignamos en atributos presupueso  */
      gerente2.setPresupuesto(333366.0F);/*Asignamos un presupuesto */
      System.out.println(gerente2);/*Se imprime los atributos que le asignamos */
      System.out.println(gerente2.getNombre());/*Se imprime junto con el nombre */
      System.out.println("### ZOOLOGICO ###");
      Perro perro1 = new Perro("Firulais", "ingles", "cafe", 4, "azul");/*creamos un nuevo objeto perro y le asignamos atributos */
      Ballena ballena1 = new Ballena("Mounstruo", "oceano", "gris", 3, 50);/*creamos un nuevo objeto ballena*/
      Pajaro pajaro1 = new Pajaro("Piolin", "Amazonas", "amarillo", 2, "corto");/*creamos un nuevo objeto pajaro */
      System.out.println(perro1);/*Imprimimos el objeto*/
      System.out.println(ballena1);/*Imprimimos el objeto*/
      System.out.println(pajaro1);/*Imprimimos el objeto*/
    }
    
}
