/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Loguica;

import java.io.IOException;

/**
 *
 * @author JAIRO F
 */
public class ExcepcionArchivo extends IOException {

    public ExcepcionArchivo() {
    }

    public ExcepcionArchivo(String message) {
        super(message);
    }

    public ExcepcionArchivo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionArchivo(Throwable cause) {
        super(cause);
    }
    
}
