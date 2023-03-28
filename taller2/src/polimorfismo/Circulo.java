package polimorfismo;

public class Circulo  extends Figura{
    private float π=(float) 3.14;
    private float radio , areaci;

    public float getπ(){
        return π ;
    }
    public void setπ (float π ){
        this.π =π ;
    }
    public float getareaci(){
        return areaci ;
    }
    public void setareaci (float areaci ){
        this.areaci =areaci ;
    }
public float getradio (){
    return radio;
}
    public void setradio(float radio){
        this.radio=radio;
    }

    @Override
    public void CalcularArea() {
        float area=π*radio * 2;
        System.out.println("el area de el circulo seria" + area);
      
    }
}
