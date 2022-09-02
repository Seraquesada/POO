public class Main {
    public static void main(String[] args) {


        SocioHabilitado socioHabilitado = new SocioHabilitado("Leo","1",2000.0,"danza clasica",500.0,true);
        Socio socio = new Socio("Tincho","2",3000.0,"Rugby");

        Socio otroSocio = new SocioHabilitado("Mili","3",4000.0,"Hockey",700.0,true);


        System.out.println(otroSocio.calcularCostoMensual());



    }
}