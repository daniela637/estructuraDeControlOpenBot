public class Main {
    public static void main(String[] args) {

//if -----------------------
        System.out.println("---if------");
        int numeroif = -12;

        if (numeroif < 0) {
            System.out.println("el numero es negativo " + numeroif);
        } else if (numeroif > 0) {
            System.out.println("el numero es positivo " + numeroif);

        } else {
            System.out.println("el numero es 0");
        }

        System.out.println("----while--------");

        //while -----------------------
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("------------do while-----");

         //Do While-----------------
           int numeroDoWhile = 4;
           do{
               System.out.println(numeroDoWhile);
               numeroDoWhile++;
           }while(numeroDoWhile < 3);


        System.out.println("------------for-----");

           for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
               System.out.println(numeroFor);

           }

        System.out.println("------------swicth-----");

           String estacion = "verano";

           switch (estacion){
               case "invierno":
                   System.out.println("usted esta en la estacion " + estacion);
                   break;
               case "primavera" :
                   System.out.println("usted esta en la estacion " + estacion);
                   break;
               case "verano"  :
                   System.out.println("usted esta en la estacion " + estacion);
                   break;
               case "otoño" :
                   System.out.println("usted esta en la estacion " + estacion);
                   break;
               default:
                   System.out.println("ingreso una estacion no valida");

           }

    }
}