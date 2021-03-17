package formulario1;

/*
 * Clase que captura y almacena la información de la persona
 * @author  Andres Gomez Penagos
 * @version 1
 * @since   16/03/2021
 */


public class DatosPersona {   
    
    // Variables del programa globales.
    
    String  tipoIdent;
    int     numeroIdent;
    String  nombreCompleto;
    int     valorDia = 15000;
    
    
    //Metodo que captura la informacion general de la persona.
     
    public void datos_persona (String ptipoIdent, int pnumeroIdent, String pnombreCompleto)
    {
        
        this.tipoIdent = ptipoIdent+" ";
        this.numeroIdent = pnumeroIdent;
        this.nombreCompleto = pnombreCompleto+" ";
    }   
    
    //Metodo que captura los dias laborados y calcula el salario. 
    
    public int calcularSalario (int diasLaborados){
        int salario = diasLaborados * this.valorDia;
        return salario;
    }
}
