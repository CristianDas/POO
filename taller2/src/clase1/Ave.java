package clase1;

public class Ave extends animal {

private String envergadora;
// metodo constructor


public Ave (String nombre, int edad, String envergadura){
    super(nombre,edad);
    this.envergadora=envergadura;
}
public String getEnvergaduara (){
    return envergadora;
}
 public void setEnvergadura(String envergadora) {
     this.envergadora = envergadora;
 }
 // metodos propios

 public void mostrarAve(){
    System.out.println("el nombre del animal es " + getnombre() + "tiene " + getedad() + "años y la emvergadra es " + getEnvergaduara() );
 }
}