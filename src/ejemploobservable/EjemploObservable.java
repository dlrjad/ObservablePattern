/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobservable;

/**
 *
 * @author Jorge
 */
public class EjemploObservable {

    /**
     * @param args the command line arguments
     */
    public static void main(String... argv) {

        Contador c = new Contador(0, 255);
        Contador c001 = new Contador(0, 255);

        Detector d = new Detector();
        c.agregarObservador(d);
        c.incrementarContador(5);

        ValorContador v = new ValorContador(c);
        c.agregarObservador(v);
        c.incrementarContador(5);

        Medidor m = new Medidor(c);
        c.agregarObservador(m);
        c.eliminarObservador(d);
        c.incrementarContador(19);
        
        /*PepitoJuan pj = new PepitoJuan(c001);
        c001.agregarObservador(pj);
        c001.incrementarContador(3);*/
        
    }
}
