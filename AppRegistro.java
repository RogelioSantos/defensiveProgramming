package barricada_ejercicio;

import java.util.Scanner;

public class AppRegistro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leer correo, contraseña y edad
        System.out.println("Ingrese su correo: ");
        String entradaCorreo = in.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String entradaContrasena = in.nextLine();

        System.out.println("Ingrese su edad: ");
        String entradaEdad = in.nextLine();

        // Validación (barricada)
        String correoSeguro = ValidadorUsuario.validarCorreo(entradaCorreo);
        String contrasenaSegura = ValidadorUsuario.validarContrasena(entradaContrasena);
        String edadSegura = ValidadorUsuario.validarEdad(entradaEdad);

        // Guardar datos en objeto usuario en caso que todos los datos sean válidos
        // de lo contrario indicar mensaje de error 


        if(correoSeguro == null || correoSeguro.isBlank()){
            System.out.println("Correo invalido");
        }
        if (contrasenaSegura == null || contrasenaSegura.isBlank()){
            System.out.println("Contraseña invalida"); 
        } 
        if(edadSegura == null || edadSegura.isBlank()){
            System.out.println("Edad invalida"); 
        }
        
        Usuario usuario = new Usuario(correoSeguro, contrasenaSegura, edadSegura);
        usuario.mostrarInfo();

        in.close();        
    }
}
