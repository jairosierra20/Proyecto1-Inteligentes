/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;

/**
 *
 * @author Jairo Sierra
 */
public class Tracert {
    String comando;

    public Tracert(String comando) {
        this.comando = comando;
    }

    public Tracert() {
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
    
    public String generar_tracert(String comando, String comando2, ArrayList<String> comandos) {
        System.out.println("Quisiste Decir = tracert");
        comando = "tracert" + comando.substring(comando.indexOf(" "), comando.length());
        comandos.add(comando2);
        return comando;

    }
    public String metodo_tracert(String comando, String comando2, ArrayList<String> comandos) {
        //validacion de QWERTY de tracert
        switch (comando2.charAt(0)) {
            case 'e':
            case 'r':
                comando = generar_tracert(comando, comando2, comandos);
                break;
            case 't':
                switch (comando2.charAt(1)) {
                    case 't':
                    case 'y':
                        comando = generar_tracert(comando, comando2, comandos);
                        break;
                }
                switch (comando2.charAt(2)) {
                    case 's':
                    case 'd':
                        comando = generar_tracert(comando, comando2, comandos);
                        break;
                }
                while (comando2.charAt(3) == 'v' || comando2.charAt(3) == 'b') {
                    comando = generar_tracert(comando, comando2, comandos);
                    break;
                }
                switch (comando2.charAt(4)) {
                    case 't':
                    case 'r':
                        comando = generar_tracert(comando, comando2, comandos);
                        break;
                }
                switch (comando2.charAt(5)) {
                    case 't':
                    case 'y':
                        comando = generar_tracert(comando, comando2, comandos);
                        break;
                }
                while (comando2.charAt(6) == 'u' || comando2.charAt(6) == 'y') {
                    comando = generar_tracert(comando, comando2, comandos);
                    break;
                }
                break;

        }
        return comando;

    }
}
