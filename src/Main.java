import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("*****Bienvenido*****");
        Autos auto1=new Autos("Chevrolet", "Camaro", 2018, "Rojo");
        Autos auto2=new Autos("Nissan", "Versa", 2022, "Blanco");
        Autos auto3=new Autos("Toyota", "Hilux CD", 2020, "Negro");
        System.out.println("Valores originales");
        auto3.ImprimirDatos();
        auto2.ImprimirDatos();
        auto1.ImprimirDatos();
        System.out.println("Suma de los años");
        System.out.println(auto1.getAño()+auto2.getAño()+auto3.getAño());
        String dato1;
        int dato2;
        String dato3;
        String dato4;
        Scanner datos=new Scanner(System.in);
        System.out.print("Nueva marca:");
        dato1=datos.next();
        System.out.print("Nuevo año:");
        dato2=datos.nextInt();
        System.out.print("Nuevo color:");
        dato3=datos.next();
        System.out.print("Nuevo modelo:");
        dato4=datos.next();
        auto1.setAño(dato2);
        auto1.setMarca(dato1);
        auto1.setColor(dato3);
        auto1.setModelo(dato4);
        //auto1.setMarca("Nissan");
        //auto2.setMarca("Renault");
        System.out.println("Valores nuevos");
        auto1.ImprimirDatos();
        //auto2.ImprimirDatos();
        //revisar capítulo 3 de Datel
    }
}