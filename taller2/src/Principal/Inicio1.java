package Principal;
import java.util.Scanner;
public class Inicio1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        Persona pedir= new Persona();
        pedir.pedirDatos();
        //pedir.mostrarPersona();
        String result=pedir.calcularlmc();
        if (result.equals("PESOBAJO")){
            System.out.println("El peso esta por debajo, tu peso es: "+result);
        }
        else if (result.equals("PESOIDEAL")){
            System.out.println("El peso es el correcto, tu peso es: "+result);
        }
        else if (result.equals("SOBREPESO")){
            System.out.println("Tu eso es muy alto, tu peso es: "+result);
        }

        pedir.mayorEdad();
        lectura.close();

        }
    }
