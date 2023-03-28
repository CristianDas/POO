package polimorfismo;

public class Triangulo  extends Figura{
    private float base ,altura , areat;

    public float getbase(){
        return base ;
    }
    public void setbase (float base ){
        this.base =base ;
    }
public float getaltura(){
    return altura;
}
    public void setaltura(float altura){
        this.altura=altura;
    }
    public float getareat(){
        return areat ;
    }
    public void setareat (float areat ){
        this.areat =areat ;
    }

    @Override
    public void CalcularArea() {
        float areat=(base*altura)/2;
        System.out.println("la base de el triangulo es " + base + "y su altura es" + altura + " y su area seria " + areat );
      
    }
}
