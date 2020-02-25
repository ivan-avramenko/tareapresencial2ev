/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapresencial2ev;

/**
 *
 * @author nocturno
 */
public class Tareapresencial2ev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public class CaminoBasico {

        public int camino(int numero1, int numero2) {
            int resultado = 0;
            if (numero1 > 5 && numero2 > 10) {
                resultado = 55;
            } else if (numero2 < 10) {
                resultado = 100;
            }
            return resultado;
        }
    }

}
