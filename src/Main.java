import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("A CONTINUACIÓN CALCULAREMOS UN APROXIMADO DE LA HUELLA DE CARBONO QUE GENERAS EN TU DÍA A DÍA \n");
        System.out.println("1. ELIGE EL TIPO DE TRANSPORTE QUE UTILIZAS \n");
        System.out.println("AUTOMOVIL \n"+"AUTOBUS \n"+"MOTOCICLETA \n"+"BICICLETA \n"+"CAMINAR");

        Scanner scanner = new Scanner (System.in);
        //Scaner scanner = new Scanner(System.int);

        String rta = scanner.next();

        if (rta.equals("AUTOMOVIL")) {
            System.out.println("QUÉ TIPO DE COMBUSTIBLE UTILIZA?");
            System.out.println("GASOLINA \n" + "DIESEL \n" + "ELÉCTRICO");
            String tipoCombustible = scanner.next();

            if (tipoCombustible.equals("GASOLINA")){
                System.out.println("CUÁNTOS Km RECORRES POR DÍA?");
                int Km = scanner.nextInt();
                System.out.println("CON ESTE MEDIO DE TRANSPORTE, ESTÁS GENERANDO: " + Km * 0.1386 + "KgCO2/día");

            }else if (tipoCombustible.equals("DIESEL")) {
                    System.out.println("CUÁNTOS Km RECORRES POR DÍA?");
                    int Km = scanner.nextInt();
                System.out.println("CON ESTE MEDIO DE TRANSPORTE, ESTÁS GENERANDO: " + Km * 0.1876 + "KgCO2/día");

                }
                else if (tipoCombustible.equals("ELÉCTRICO")) {
                    System.out.println("EXCELENTE! NO ESTÁS GENERANDO CO2");
                }
                else {
                    System.out.println("TIPO DE COMBUSTIBLE NO VÁLIDO");
                }

            }
        if (rta.equals("AUTOBUS")){
            System.out.println("ESTÁS GENERANDO 0.75 KgCO2/día");
        }
        if (rta.equals("MOTOCICLETA")){
            System.out.println("CUÁNTOS Km RECORRES POR DÍA?");
            int Km = scanner.nextInt();
            System.out.println("CON ESTE MEDIO DE TRANSPORTE, ESTÁS GENERANDO: " + Km * 1155 + "KgCO2/día" );
        }
        if (rta.equals("BICICLETA")){
            System.out.println("FELICIDADES! NO ESTÁS GENERANDO CO2");
        }
        if (rta.equals("CAMINAR")){
            System.out.println("FELICIDADES! NO ESTÁS GENERANDO CO2");
        }
        //if (rta=!){
           // System.out.println("TIPO DE TRANSPORTE NO VÁLIDO");
        }
        }

