public class Main {
    public static void main(String[] args) {

        for(Integer numero = 1;numero<=100;numero++){

            if((numero % 3)==0){
                System.out.println("a");
            }
            else if((numero % 5)==0){
                System.out.println("b");
            }else{
                System.out.println(numero);
            }
        }
    }
}