package polimorfismo;

public class Cuadrado extends Figura{
    private float lado;
    private float areaC;

    public float getlado(){
        return lado;
    }
    public float getAreaC(){
        return areaC;
    }
    public void setAreaC (float areaC ){
        this.areaC=areaC;
    }
    public void setlado (float lado ){
        this.lado=lado;
    }

    @Override
    public void CalcularArea() {
        areaC=lado*lado;
        System.out.println("El lado del cuadrado es: " + lado + " y su area es de: "+areaC);
      
    }
}
