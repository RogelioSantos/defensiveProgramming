package barricada_ejercicio;

// clase barricada
public class ValidadorUsuario {

    // implementar método: validarCorreo(String correo)
    // aceptar emial que contengan @ y .

public static String validarCorreo(String correo){
    if(correo.contains("@") && correo.contains(".")){
        return "Correo validado";
    }
    return null;
}


    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8
public static String validarContrasena(String contrasena){
    if(contrasena.length() >= 9){
        return "Contraseña validada";
    }
    return null;
}


    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
public static String validarEdad(String edadTexto){
    try{
        int edad = Integer.parseInt(edadTexto);
    if(edad >= 15 && edad <= 50){
        return "Edad validada";
    }
    return null;
    } catch(NumberFormatException e){
        return null;
    }
}
    
}
