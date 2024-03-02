

public class uso_coche {

    public static void main(String[] args) {

        ///INSTANCIANDO UNA CLASE
        coche mi_coche=new coche();

        ///modificacion del color en el main
        mi_coche.establece_color("azul marino"); ///en este caso ya se cambia el color del coche.

        System.out.println(mi_coche.dime_datos_generales());
        System.out.println(mi_coche.dime_color());

        mi_coche.configura_asientos("no");

        System.out.println(mi_coche.dime_asientos());

    }
}
