/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1evaluacion;

/**
 *
 * @author Alumno
 */
public class Empleados {

    private String nombreEmpleado;
    private String codEmpleado;
    private String apellidoEmpleado;
    private int numeroDeHijos;
    private double salarioBase;

    public Empleados(String nombre, String apellido,double salario) {
        salario += numerosAleatorios(0, 2000);
        this.salarioBase = salario;
        this.codEmpleado = "";
        this.nombreEmpleado = nombre;
        this.apellidoEmpleado = apellido;
        this.numeroDeHijos = numerosAleatorios(0,10);
    }
    

    
    public String codEmpleado(){
        int numeroAleatorioCod = numerosAleatorios(0,5000);
        return (nombreEmpleado.charAt(0)+"_" +numeroAleatorioCod);
    }
    
    public void listarEmpleados(){
        
        System.out.println(codEmpleado +"   " +nombreEmpleado + "   " + apellidoEmpleado + "    " + numeroDeHijos +"    " +salarioBase +" €");
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
    public void modificarNumeroHijos(){
        numeroDeHijos++;
    }
    public void modificarComplemento(double complemento){
        this.salarioBase = complemento;
    }

    public static int numerosAleatorios(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    void modificarComplemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
