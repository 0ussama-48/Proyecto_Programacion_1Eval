/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1evaluacion;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Proyecto1Evaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean correct = true;
        Empleados Empleado[] = new Empleados[2];
        System.out.print("Salario Base : ");
        double salarioBase = teclado.nextDouble();
        for (int i = 0; i < Empleado.length; i++) {
            System.out.print("Nombre : ");
            String Nombre = teclado.next();
            System.out.print("Apellido : ");
            String Apellido = teclado.next();
            Empleado[i] = new Empleados(Nombre, Apellido, salarioBase);
        }
        for (int i = 0; i < Empleado.length; i++) {
            Empleado[i].codEmpleado();
        }

        do {

            System.out.println("1 - Listado Empleados \n2 - modificacion de datos \n3 - Nomina \n4 - Modificaion del salario Base \n0 - fin ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 0:
                    correct = false;
                break;
                case 1:
                    System.out.println("CODIGO" + "  " + "NOMBRE" + "  " + "APELLIDO" + "  " + "HIJOS" + "  " + "COMPLEMENTO");
                    System.out.println("-----------------------------------------------------------------------------");
                    for (int i = 0; i < Empleado.length; i++) {
                        Empleado[i].listarEmpleados();
                    }
                    break;
                case 2:
                    for (int i = 0; i < Empleado.length; i++) {
                        System.out.println(Empleado[i].codEmpleado());
                    }
                    System.out.println("Codigo del empleado : ");
                    String codEmpleadoM = teclado.next();
                    for (int a = 0; a < Empleado.length; a++) {

                        if (codEmpleadoM != Empleado[a].codEmpleado()) {

                            System.out.println("1 - Modificar Numero de Hijos \n2 - Modificar Comlemento de destino");
                            int opcionModificacion = teclado.nextInt();
                            switch (opcionModificacion) {
                                case 0:
                                    a = Empleado.length;
                                    break;
                                case 1:
                                    Empleado[a].modificarNumeroHijos();
                                    System.out.println("Se ha incrementado el numero de Hijos");
                                    System.out.println();
                                    System.out.println("CODIGO" + "  " + "NOMBRE" + "  " + "APELLIDO" + "  " + "HIJOS" + "  " + "COMPLEMENTO");
                                    System.out.println("-----------------------------------------------------------------------------");
                                    for (int i = 0; i < Empleado.length; i++) {
                                        Empleado[i].listarEmpleados();
                                    }
                                    a = Empleado.length;
                                    break;
                                case 2:
                                    System.out.println("Comlemento de destino : ");
                                    double complemento = teclado.nextDouble();
                                    Empleado[a].modificarComplemento(complemento);
                                    System.out.println("CODIGO" + "  " + "NOMBRE" + "  " + "APELLIDO" + "  " + "HIJOS" + "  " + "COMPLEMENTO");
                                    System.out.println("-----------------------------------------------------------------------------");
                                    for (int i = 0; i < Empleado.length; i++) {
                                        Empleado[i].listarEmpleados();
                                    }
                                    a = Empleado.length;
                                    break;
                            }
                        } else {
                            System.out.println("Codigo incorrecto");
                            a = Empleado.length;
                        }
                    }

                    break;
                case 3:
                    System.out.println("Caso 2");
                    break;
            }
        } while (correct == true);
    }

    public static int numerosAleatorios(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

}
