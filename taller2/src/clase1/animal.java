package clase1;

import java.util.Scanner;
Scanner lectura=new Scanner;
public class animal {
        //atributos
    public String nombre;
    public int edad;
 

// metodo constructor 
    
public animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}

//metodos accesoros 
public int getedad (){ // metodo get o getter
return edad;
}
public String getnombre (){
    return nombre;

}

public void  setedad (int edad){ // metodo set o setter
    this.edad=edad;
}

public void  setnombre (String nombre){ // metodo set o setter
    this.nombre=nombre;
}
    // metodos y operaciones
    /**
     * 
     */
    public void registrarAnimal(){
        // cuerpo del metodo
        System.out.println("ingrese el nombre del animal");
        nombre=lectura.nextLine();

        System.out.println("ingrese la edad del animal");
        edad=lectura.nextInt();
    }


    public void mostrarAnimal(){
        System.out.println("el nombre de animal ingresado es "+ nombre + "y tiene"  + edad  );
    }       
}

             //
            //          /// //     ////      ////////
           // // //      // //    //  //     //
           //    //      //      ////////    //
             // //       //     //      //   /////////