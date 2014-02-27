/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobservable;

// Observador muy simple que ni siquiera consulta el estado del sujeto...
 
  public class Detector implements Observador {
 
  public void actualizar() {
    System.out.println("Detector recibe actualizar!");
  }
 
}
