public class JavaCoffee {
    public static void main(String[] args) {
        // variables de la app
        // lineas de texto de la app
        String saludoGeneral = "Bienvenido al cafe java, ";
        String mensajePendiente = ", tu pedido esta listo en breve";
        String mensajeListo = ", tu pedido esta listo";
        String mensajeMostrarTotal = ", tu pedido es de $";

        // variables de menu 
        double precioMocca = 3.5;
        double filterCoffee = 2;
        double latte = 3;
        double cappuccino = 6;

        // variables de nombre de cliente
        String cliente1 = "henry";
        String cliente2 = "sam";
        String cliente3 = "jimmy";
        String cliente4 = "Noah";
        
        // Finalizaciones de pedidos 
        boolean estaListoOrden1 = false ;
        boolean estaListoOrden2 = true ;
        boolean estaListoOrden3 = false ;
        boolean estaListoOrden4 = true ;
        
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral+cliente1);
        //1
        System.out.println(cliente1+ mensajePendiente);
        //2
        if (estaListoOrden4) {
            System.out.println(cliente4+mensajeListo);
            System.out.println(mensajeMostrarTotal+cappuccino);
        }
        else {
            System.out.println(cliente4+mensajePendiente);
        }
        //3
        System.out.println(mensajeMostrarTotal + 2*latte);
        if (estaListoOrden2) {
            System.out.println(cliente2 + mensajeListo);
        }
        else {
            System.out.println(cliente2 + mensajePendiente);
        }
        //4
        System.out.println(mensajeMostrarTotal + (latte - filterCoffee));
    }   

}