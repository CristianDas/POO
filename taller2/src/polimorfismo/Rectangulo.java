package polimorfismo;

public class Rectangulo extends Figura{
    private float largo,ancho , arear;
    public float getarear(){
        return arear;
    }
    public void setarear (float arear ){
        this.arear=arear;
    }
    public float getlargo(){
        return largo;
    }
    public void setlargo (float largo ){
        this.largo=largo;
    }
public float getancho(){
    return ancho;
}
    public void setancho(float ancho){
        this.ancho=ancho;
    }

    @Override
    public void CalcularArea() {
        float area=largo*ancho;
        System.out.println("el largo del rectangulo es " + largo + "y su ancho es" +ancho+ "y su area es de "  +area);
      
    }
}
