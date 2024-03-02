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
        if(asientos_cuero.equalsIgnoreCase("si")){
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

    ///metodo setters para configurar climatizadores
    public void configura_climatizadores(String climatizador) {
    if(climatizador.equalsIgnoreCase("si")){
        this.climatizador=true;
    }
    else {
        this.climatizador=false;
      }
    }
    public String dime_climatizador(){ ///metodo getters para uso del metodo setters configura climatizador
        if(climatizador==true){
            return "El coche incorpota climatizador";
        }
        else {
            return "El coche lleva aire acondicionado";
        }
    }

    ///usando metodo getters anda setters juntos (no es recomendado) "establecemos datos y devolvemos
    public String dime_peso_coche(){
        int peso_carroceria=500;

        peso_total=peso_total+peso_plataforma;

        if(asientos_cueros==true){
            peso_total=peso_total+50;
        }
        if(climatizador==true){
            peso_total=peso_total+20;
        }
        return "El peso del coche es "+peso_total;
    }
///metodo gettes devolvindo precio del coche segun la opcion que eligio el cliente
    public int precio_coche(){
        int precio_final=10000;

        if(asientos_cueros==true){
            precio_final+=2000;
        }
        if(climatizador==true){
            precio_final+=1500;
        }

        return precio_final;
    }



}
