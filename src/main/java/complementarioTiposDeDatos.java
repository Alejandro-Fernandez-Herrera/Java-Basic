/* 
Actividad: Ejercicio Complementario
Este ejercicio es de tipo complementario. Esto quiere decir que te ayudará a avanzar en profundidad en el tema visto anteriormente.
Refinando la definición del tipo de variable más adecuado:
De acuerdo a la naturaleza de los datos, procede a declarar una variable utilizando el tipo más apropiado. NO utilizar constantes. 
Declara una variable llamada mensajeBienvenida y asigna como valor "Bienvenido a Java". Asegúrate de elegir el tipo de variable más apropiado para almacenar un mensaje de texto.
Declara una variable llamada temperaturaActual y asigna como valor "19". Selecciona el tipo de variable que permita representar la temperatura de manera precisa.
Declara una variable llamada datoLogico y asigna como valor "true". Elige el tipo de variable adecuado para almacenar valores lógicos.
Utiliza la función System.out.println() para imprimir cada variable declarada, concatenándola con un mensaje descriptivo que aporte contexto. 
*/

public class complementarioTiposDeDatos {
    public static void main(String[] args) {
        
        String mensajeBienvenida = "-Bienvenido a Java-.";
        float temperaturaActual = 19L;
        boolean datoLogico = true;

        System.out.println("Hola, este ejercicio es complementario, un mensaje de bienvenida es -String- " + mensajeBienvenida + " la temperatura podría ser float al tener decimales " + temperaturaActual + " y los datos logicos son verdadero y falso " + datoLogico);
    }
}


