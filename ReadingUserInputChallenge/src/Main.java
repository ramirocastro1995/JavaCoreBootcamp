import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos el scanner
        Scanner scanner = new Scanner(System.in);
        //creamos el contador de vueltas y el numero que vamos a devolver sumado
        int counter = 0;
        int sum = 0;

        //loop del programa
        while(true){
            //creamos un nuevo int para storear la posicion del numero
            int order = counter + 1;
            //printeamos en que linea vamos
            System.out.println("Enter number #"+ order +" :");

            //creamos un booleano para verificar si el proximo numero es un int
            boolean isAnInt = scanner.hasNextInt();

            //si es int, ejecutamos el siguiente codigo
            if(isAnInt) {
                //storeamos el numero que ingresa el cliente en la variable number
                int number = scanner.nextInt();
                //sumamos 1 al valor del contador
                counter++;
                //sumamos el numero a sum
                sum += number;
                //si el contador esta en 10 terminamos el programa
                if(counter == 10){
                    break;
                }
            }else{
                System.out.println("Invalid number");
            }
            //fuera del loop,pedimos la siguiente linea
            scanner.nextLine();

        }
        //al terminar imprimimos el total
        System.out.println("sum : " + sum);
        scanner.close();
    }
}