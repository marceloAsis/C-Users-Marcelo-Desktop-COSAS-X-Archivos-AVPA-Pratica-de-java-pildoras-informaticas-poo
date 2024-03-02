public class coche {

    private int ruedas;  ///la palabra "private" equivale a un encapsulamiento del dato tipo int
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    private String color;
    private int peso_total;
    private boolean asientos_cueros,climatizador;


///METODO CONSTRUCTOR QUE ES? -->Es metodo especial, se encarga de dar un estado inicial a un objeto.
    ///como se construye?
    public coche(){ ///-----> metodo constructor.

        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;

    }
    ///CREANDO METODO GETTER (es un metodo catador) poniendo el public, se puede acceder de cualdquier clase.
    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene "+ruedas+" ruedas"+ ". Mide "+largo/1000+ " metros con un ancho de "+ ancho
                +" cm y un peso de plataforma de " + peso_plataforma+" kg.";
    }

    ///METODO SETTERS: Modificar el valor de las propiedades de los objetos. si utilizamos "void" no indica que no devuelve valor
    public void establece_color(String color_coche){
        color=color_coche;
    }
    ///metodo GETTERS creamos este getters porque nos informa el color actualizado
    public String dime_color(){
        return "EL COLOR DEL COCHE ES " + color;
    }
///METODO SETTERS PARA ASIENTOS DE CUEROS
    public void configura_asientos(String asientos_cuero){
        if(asientos_cuero=="si"){
            this.asientos_cueros=true; ///cuando usasmos la palabra "this" es por que tenemos similitud en el arguemento
        }                                   ///en la variable de la clase.
        else{
            this.asientos_cueros=false;
        }
    }
    ///CREANDO METODO GETTERS
    public String dime_asientos(){
        if(asientos_cueros==true){
            return "EL COCHE TIENE ASIENTOS DE CUERO";
        }
        else{
            return "EL COCHE TIENE ASIENTOS DE SERIE";
        }
    }




}
