public class Main {
    public static void main(String[] args) {

        System.out.println("******* Bienvenido ********");
        
        
        Autos auto1;
        Autos auto2;
        Autos auto3;

        auto1=new Autos("Chevrolet");
        auto2=new Autos("Nissan");
        auto3=new Autos("Toyota");

        auto1.setMarca("Chevrolet");
        auto2.setMarca("Nissan");
        auto3.setMarca("Toyota");

        auto1.setModelo("ONIX TURBO RS");
        auto2.setModelo("Versa");
        auto3.setModelo("Hilux CD");
        
        auto1.setAnio(2003);
        auto2.setAnio(2010);
        auto3.setAnio(2020);
        
        auto1.setColor("Rojo");
        auto2.setColor("Negro");
        auto3.setColor("Blanco");
        
        //Imprimir
        System.out.println(auto1.getMarca());
        System.out.println(auto1.getModelo());
        System.out.println(auto1.getAnio());
        System.out.println(auto1.getColor());
        
        
    }
}