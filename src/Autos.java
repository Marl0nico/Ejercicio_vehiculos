public class Autos {
    //atributos
    public String marca;
    public String modelo;
    public int año;
    public String color;
    //constructor
    public Autos (String nuevoNombre){
        modelo=nuevoNombre;
    }
    //métodos
    public int getAño(){
        return año;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    //setters
    public void setMarca(String newMarca){
        this.marca =newMarca;
    }
    public void setModelo(String newModelo){
        this.modelo =newModelo;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public void setAño(int newAño){
        this.año =newAño;
    }
}
