import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Bienvenido*****");
        Autos auto1=new Autos("Chevrolet", "Camaro", 2018, "Rojo");
        Autos auto2=new Autos("Nissan", "Versa", 2022, "Blanco");
        Autos auto3=new Autos("Toyota", "Hilux CD", 2020, "Negro");
        auto3.ImprimirDatos();
        auto2.ImprimirDatos();
        auto1.ImprimirDatos();
        System.out.println(auto1.getAño()+auto2.getAño()+auto3.getAño());
    }
}