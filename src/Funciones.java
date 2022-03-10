

public class Funciones {

    public static void main(String[] args) {

        String menu=getMenu();
        System.out.println(menu);
    }

    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de Zapatillas");
        System.out.println("1- Ver Zapatillas");
        System.out.println("2- Comprar Zapatillas");
        System.out.println("3- Salir");


       double price= getPrice();
        System.out.println(price);
    }

    private static double getPrice() {
        double v = 10.99;
        return v;


    }

    private static int suma(int numero1, int numero2 ) {
        return numero1 + numero2;
    }


    static String getMenu(){
        return "Bienvenidos al E-commerce de Zapatillas: \n 1- Ver Zapatillas....";
    }



}

