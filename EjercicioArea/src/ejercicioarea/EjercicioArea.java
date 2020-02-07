/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarea;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author WILLIAM
 */
public class EjercicioArea {
    
   public static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                             int opcion=-1;
                                        double base=0,altura=0,radio=0, apotema=0,perimetro=0;

                             while(opcion!=0){
                                                opcion=menu();
                                                switch(opcion) {
				case 1:
					// area de un cuadrado
					base=solicitarValor("Indica la base o altura: ");
					System.out.println("\nEl area del cuadrado es " + (base*base));
					break;
				case 2:
					// area de un rectangulo
					base=solicitarValor("Indica la base: ");
					altura=solicitarValor("Indica la altura: ");
					System.out.println("\nEl area del rectangulo es " + (base*altura));
					break;
				case 3:
					// area de un circulo
					radio=solicitarValor("Indica el radio: ");
					System.out.printf("\nEl area del circulo es " + Math.PI*(Math.pow(radio,2)));
					break;
				case 4:
					// area de un triangulo
					base=solicitarValor("Indica la base: ");
					altura=solicitarValor("Indica la altura: ");
					System.out.printf("\nEl area del triangulo es " + (base*altura)/2);
					break;
                                        
                                case 5:
                                      // area de un Hexagono
                                       perimetro=solicitarValor("Indica la perimetro:");
                                       apotema = solicitarValor("Indica el Apotema:");
                                       System.out.printf("\nEl area de un poligono es:" +  (perimetro*apotema)/2);
                                       break;
                                       
                                                    }
                                            }
                                            entrada.close();
                                    }
 
                                        private static double solicitarValor(String texto) {
                                                while(true){
                                                        try {
                                                                System.out.print(texto);
                                                                return entrada.nextDouble();
                                                        }catch(InputMismatchException e) {
                                                                // Controlamos que siempre introduzca un valor numerico
                                                                System.out.println("El valor tiene que ser numerico...");
                                                                entrada.nextLine();
                                                        }
                                                }
                                        }

                                        private static int menu() {
                                                int opcion=-1;
                                                System.out.println("\n\n---------------------------");
                                        System.out.println("1-Area de un cuadrado");
                                        System.out.println("2-Area de un rectangulo");
                                        System.out.println("3-Area de un circulo");
                                        System.out.println("4-Area de un triangulo");
                                        System.out.println("5-Area de un poligono");
                                        System.out.println("0-Salir");
                                        System.out.println("Selecciona una opción");

                                                while(opcion<0) {
                                                        try {
                                                                opcion=entrada.nextInt();
                                                        }catch(InputMismatchException e) {
                                                                // Controlamos que siempre introduzca un valor numerico
                                                                System.out.println("El valor tiene que ser numerico...");
                                                                entrada.nextLine();
                                                                opcion=-1;
                                                        }
                                                }

                                                return opcion;
                                        }
                                }
    
