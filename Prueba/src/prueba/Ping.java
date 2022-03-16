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
public class Ping {
    String comando;

    public Ping(String comando) {
        this.comando = comando;
    }

    public Ping() {
    }
    
    public String generar_ping(String comando, String comando2, ArrayList<String> comandos) {
        System.out.println("Quisiste Decir = ping");
        comando = "ping" + comando.substring(comando.indexOf(" "), comando.length());
        comandos.add(comando2);
        return comando;

    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
    public String metodo_ping(String comando, String comando2, ArrayList<String> comandos) {
        //validacion de QWERTY de ping
        switch (comando2.charAt(0)) {
            case 'i':
            case 'o':
                comando = generar_ping(comando, comando2, comandos);
                break;
            case 'p':
                switch (comando2.charAt(1)) {
                    case 'o':
                    case 'p':
                        comando = generar_ping(comando, comando2, comandos);
                        break;
                }
                switch (comando2.charAt(2)) {
                    case 'm':
                        comando = generar_ping(comando, comando2, comandos);
                        break;
                }
                switch (comando2.charAt(3)) {
                    case 'h':
                    case 'j':
                        comando = generar_ping(comando, comando2, comandos);
                        break;
                }
                break;

        }
        return comando;

    }
}
