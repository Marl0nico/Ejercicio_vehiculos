public class Autos {
    //atributos (otro comentario)
    public String marca;
    public String modelo;
    public int año;
    public String color;
    //constructor
    public Autos(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void ImprimirDatos(){
        System.out.println("Año:"+getAño()+"    Marca:"+getMarca()+"    Modelo:"+getModelo()+"  Color:"+getColor());
    }
}
