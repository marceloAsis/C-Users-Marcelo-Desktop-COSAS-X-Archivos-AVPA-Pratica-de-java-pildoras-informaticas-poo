import javax.swing.*;

public class uso_coche {

    public static void main(String[] args) {

        ///INSTANCIANDO UNA CLASE
        coche mi_coche=new coche();

        ///modificacion del color en el main
        mi_coche.establece_color(JOptionPane.showInputDialog("INTRODUCE COLOR: ")); ///en este caso ya se cambia el color del coche.

        System.out.println(mi_coche.dime_datos_generales());
        System.out.println(mi_coche.dime_color());

        mi_coche.configura_asientos(JOptionPane.showInputDialog("TIENE ASIENTOS DE CUERO: "));

        System.out.println(mi_coche.dime_asientos());
        mi_coche.configura_climatizadores(JOptionPane.showInputDialog("TIENE CLIMATIZADOR: "));

        System.out.println(mi_coche.dime_climatizador());
        System.out.println(mi_coche.dime_peso_coche());
        System.out.println("EL PRECIO FINAL DEL COCHE ES: "+mi_coche.precio_coche());

    }
}
