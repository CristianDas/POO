package polimorfismo;

import java.util.Scanner;

public class Ejecutar{
    public static void main(String[] args) {
        try (Scanner lectura = new Scanner(System.in)) {
            String op="";
   do {
            System.out.println("vamos a cacular el area de las siguientes figuras");
            System.out.println("elija entre cuadrado,triangulo,rectangulo,circulo");
             String desicion =lectura.nextLine();

             if(desicion.equals("cuadrado")){
            System.out.println("ingrese el lado del cuadrado");
            float lado =lectura.nextFloat();
            Cuadrado areaC=new Cuadrado();
            areaC.setlado(lado);
            areaC.CalcularArea();

             }

      else  if(desicion.equals("triangulo")){
                System.out.println("ingrese la altura ");
                float altura =lectura.nextFloat();
                System.out.println("ingrese la base");
                float base =lectura.nextFloat();
                Triangulo areat=new Triangulo();
                areat.setaltura(altura);
                areat.setbase(base);
                areat.CalcularArea();
      }
                else  if(desicion.equals("rectangulo")){
                    System.out.println("ingrese el largo");
                    float largo =lectura.nextFloat();
                    System.out.println("ingrese el ancho");
                    float ancho =lectura.nextFloat();
                    Rectangulo arear=new Rectangulo();
                    arear.setlargo(largo);
                    arear.setancho(ancho);
                    arear.CalcularArea();
                }
                    else  if(desicion.equals("circulo")){
                        System.out.println("ingrese el radio ");
                        float radio =lectura.nextFloat();
                        Circulo areaci=new Circulo();
                        areaci.setradio(radio);
                        areaci.CalcularArea();
                    }
            

          
            else{
                System.out.println("lo siento no has escogido ninguna");
            }
            
            System.out.println("Quieres volver a jugar");
            lectura.nextLine();
            op=lectura.nextLine();


   } while (op.equals("si"));
        }  
    }
}
