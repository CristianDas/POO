package reto1;

import java.util.Scanner;


public class Persona1 {
     public String tipoDoc;
     public int documento;
     public String nombre;
     public String apellido;
     public int peso;
     public int edad ;
     public String sexo;

   Scanner lectura= new Scanner(System.in);

   public void registrarPersona(){
    // cuerpo del metodo
    System.out.println("ingrese el tipo de documento");
    tipoDoc=lectura.nextLine();

    System.out.println("ingrese el documento");
    documento =lectura.nextInt();
}
}
