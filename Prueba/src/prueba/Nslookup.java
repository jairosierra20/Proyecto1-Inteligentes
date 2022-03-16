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
public class Nslookup {
    String comando;

    public Nslookup() {
    }

    public Nslookup(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
    
    public String generar_nsl(String comando, ArrayList<String> comandos) {
        System.out.println("Quisiste Decir = nslookup");
        comandos.add(comando);
        
        comando = "nslookup";
        return comando;

    }
    public String metodo_nsl(String comando, ArrayList<String> comandos) {
        //validacion del comando nslookup
        switch (comando.charAt(0)) {
            case 'm':
                generar_nsl(comando, comandos);
                break;
            case 'n':
                switch (comando.charAt(1)) {
                    case 'd':
                    case 'f':
                        comando=generar_nsl(comando, comandos);
                        
                        break;
                }
                switch (comando.charAt(2)) {
                    case 'ñ':
                    case 'z':
                        comando=generar_nsl(comando, comandos);
                        break;
                }
                while (comando.charAt(3) == 'p' || comando.charAt(3) == 'a'|| comando.charAt(4) == 'p' || comando.charAt(5) == 'a') {
                    comando=generar_nsl(comando, comandos);
                    break;
                }
                while (comando.charAt(5) == 'l' || comando.charAt(5) == 'ñ' || comando.charAt(6) == 'i' || comando.charAt(6) == 'o') {
                    comando=generar_nsl(comando, comandos);
                    break;
                }
                switch (comando.charAt(7)) {
                    case 's':
                    case 'a':
                        comando=generar_nsl(comando, comandos);
                        break;
                }
        }
        return comando;

    }
    public String generar_nsl2(String comando, String comando2, ArrayList<String> comandos) {
        System.out.println("Quisiste Decir = nslookup");
        comando = "nslookup" + comando.substring(comando.indexOf(" "), comando.length());
        comandos.add(comando2);
        return comando;

    }
    public String metodo_nsl2(String comando, String comando2, ArrayList<String> comandos) {
        //validacion del comando nslookup
        switch (comando.charAt(0)) {
            case 'm':
                comando=generar_nsl2(comando, comando2, comandos);
                break;
            case 'n':
                switch (comando.charAt(1)) {
                    case 'd':
                    case 'f':
                        comando=generar_nsl2(comando, comando2, comandos);
                        break;
                }
                switch (comando.charAt(2)) {
                    case 'ñ':
                    case 'z':
                        comando=generar_nsl2(comando, comando2, comandos);
                        break;
                }
                while (comando.charAt(3) == 'p' || comando.charAt(3) == 'a'|| comando.charAt(4) == 'p' || comando.charAt(5) == 'a') {
                    comando=generar_nsl2(comando, comando2, comandos);
                    break;
                }
                while (comando.charAt(5) == 'l' || comando.charAt(5) == 'ñ' || comando.charAt(6) == 'i' || comando.charAt(6) == 'o') {
                   comando=generar_nsl2(comando, comando2, comandos);
                    break;
                }
                switch (comando.charAt(7)) {
                    case 's':
                    case 'a':
                        comando=generar_nsl2(comando, comando2, comandos);
                        break;
                }
        }
        return comando;

    }
}
