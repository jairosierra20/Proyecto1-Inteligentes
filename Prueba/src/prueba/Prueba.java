/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Jairo Sierra
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    private static String current_working_directory;
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) throws IOException {
        boolean iniciar = true;
        String comando2 = "";
        int menu = -2;
        Runtime app = Runtime.getRuntime();
        Scanner read = new Scanner(System.in);
        ArrayList<String> comandos = new ArrayList<String>();
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLUE + "Microsoft Windows [Versión 10.0.19043.1466]\n"
                + "(c) Microsoft Corporation. Todos los derechos reservados. Ingrese salir para salir." + ANSI_RESET + "\n");
        while (iniciar) {
            System.out.print(ANSI_BLUE + "C:\\Users\\Jairo Sierra> " + ANSI_RESET);
            String comando = read.nextLine();

            while (comando.length() > 5) {
                System.out.println("comando: " + comando);
                switch (comando.charAt(4)) {
                    case ' ':
                        comando2 = comando.substring(0, comando.indexOf(" "));
                        Ping ping = new Ping(comando);
                        comando = ping.metodo_ping(comando, comando2, comandos);
                        break;
                    default:
                        switch (comando.charAt(7)) {
                            case ' ':
                                comando2 = comando.substring(0, comando.indexOf(" "));
                                Tracert trace = new Tracert(comando);
                                comando = trace.metodo_tracert(comando, comando2, comandos);
                                break;
                            default:
                                System.out.println(comando.length());
                                while (comando.length() > 11) {
                                    switch (comando.charAt(8)) {
                                        case ' ':
                                            comando2 = comando.substring(0, comando.indexOf(" "));
                                            Nslookup ns2 = new Nslookup(comando);
                                            comando = ns2.metodo_nsl2(comando, comando2, comandos);
                                            break;
                                    }
                                    break;
                                }
                                while (comando.length() == 8) {
                                    Nslookup nsl = new Nslookup(comando);
                                    comando = nsl.metodo_nsl(comando, comandos);
                                    break;
                                }
                        }
                        break;
                }

                break;
            }
            switch (comando.charAt(0)) {
                case 's':
                    iniciar = false;
                    System.out.println("Comandos");
                    for (int i = 0; i < comandos.size(); i++) {
                        System.out.println(comandos.get(i));
                    }
                    System.out.println("Terminando ejecución");
                    break;
                case 'h':
                    System.out.println("Esta es la sección de ayuda \nLista de comandos: \nsalir - Terminar Programa \nhelp - Mostrar ayuda \nbrowser - abrir el navegador web \nping  - Probar si hay conectividad a la IP ingresada \nnslookup- utilizado para saber si el DNS está resolviendo correctamente los nombres y las IPs \ntracert- Visualizar el recorrido del paquete de envio de la IP ingresada");
                    break;
                case 'b':
                    try {
                        app.exec("C:\\Program Files\\Mozilla Firefox/firefox.exe");
                    } catch (Exception e) {
                        try {
                            app.exec("C:/Program Files (x86)/Google/hrome/pplication/chrome.exe");
                        } catch (Exception f) {
                        }
                    }
                    break;
                case 'p':
                    String pingResult = "";
                    try {
                        Runtime r = Runtime.getRuntime();
                        Process p = r.exec(comando);

                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String inputLine;
                        while ((inputLine = in.readLine()) != null) {
                            System.out.println(inputLine);
                            pingResult += inputLine;
                        }
                        in.close();

                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 'n':
                    String pingResult2 = "";
                    try {
                        Runtime r = Runtime.getRuntime();
                        Process p = r.exec(comando);

                        BufferedReader in2 = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String inputLine2;
                        int cont = 0;
                        while ((inputLine2 = in2.readLine()) != null) {
                            System.out.println(inputLine2);
                            pingResult2 += inputLine2;
                            cont++;
                            if (cont == 3) {
                                break;
                            }
                        }
                        in2.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 't':
                    String pingResult3 = "";
                    try {
                        Runtime r2 = Runtime.getRuntime();
                        Process p = r2.exec(comando);
                        BufferedReader in2 = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String inputLine2;
                        while ((inputLine2 = in2.readLine()) != null) {
                            System.out.println(inputLine2);
                            pingResult3 += inputLine2;
                        }
                        in2.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;

                default:
                    System.out.println("'" + comando + "' no se reconoce como un comando interno o externo,\n"
                            + "programa o archivo por lotes ejecutable.");
                    break;
            }
        }
    }
}
