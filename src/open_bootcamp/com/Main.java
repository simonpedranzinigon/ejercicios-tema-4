package open_bootcamp.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicios tema 4 - Introducción a la programación");
        System.out.println("-----------------------------------------------");
        System.out.println("Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.\n" +
                "Pista: Los números inferiores a 0 son negativos y los superiores, positivos.");

        int numeroIf = 0;
        if ( numeroIf >= 1 ) {
            System.out.println("El número es positivo");
        } else if ( numeroIf == 0 ) {
            System.out.println("El número es cero");
        } else if ( numeroIf < 0) {
            System.out.println("El número es negativo");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:\n" +
                "Incrementar el valor de la variable en uno cada vez que se ejecute.\n" +
                "Mostrarlo por pantalla cada vez que se ejecute:");

        int numeroWhile = 1;
        while ( numeroWhile < 3) {
            numeroWhile += 1;
            System.out.println("El valor de numerowhile: " + numeroWhile);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.");
        numeroWhile = 1;
        do {
            numeroWhile += 1;
            System.out.println("El valor de numerowhile: " + numeroWhile);
        } while ( numeroWhile <3 );

        System.out.println("-----------------------------------------------");
        System.out.println("Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será" +
                "que la variable sea igual o menor que 3, \n" + "se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.");
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de numeroFor es => " + numeroFor);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.\n"
                +"Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando\n"
                + "de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.");

        String estacion = "berano"; // se va al default por la falta de ortografia ;)
        switch (estacion) {
            case "invierno":
                System.out.println("Actualmente estamos en invierno");
                break;
            case "primavera":
                System.out.println("Actualmente estamos en primavera");
                break;
            case "verano":
                System.out.println("Actualmente estamos en verano");
                break;
            case "otoño":
                System.out.println("Actualmente estamos en otoño");
                break;
            default:
                System.out.println("A introducido una estacion incorrecta");
        }
    }
}
