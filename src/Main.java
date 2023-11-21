public class Main {
    public static void main(String[] args) {
        System.out.println("*****Bienvenido*****");
        Autos auto1=new Autos("Chevrolet", "Camaro", 2018, "Rojo");
        Autos auto2=new Autos("Nissan", "Versa", 2022, "Blanco");
        Autos auto3=new Autos("Toyota", "Hilux CD", 2020, "Negro");
        System.out.println(auto1.color);
        System.out.println(auto2.color);
    }
}