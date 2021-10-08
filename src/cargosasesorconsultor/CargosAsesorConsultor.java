package cargosasesorconsultor;
import java.util.Scanner;
/**
 *package cargosasesorconsultor;
import java.util.Scanner;
/**
 *
 * @author DAVID ALEJANDRO
 */
public class CargosAsesorConsultor {
    public static void main(String[] args) {
               int a;
             System.out.println("seleccione un nemero 1 y 2");
       System.out.println("1. asesor 2.consultor");
       //leer dato scanner
              //atributo
        Scanner sc = new Scanner (System.in);
        
                a= sc.nextInt();
                        switch(a)
                {
                                        case 1:{
                       System.out.println("el salario de asesor  es 1.000.000"); 
                            break; }  
                      case 2: {
                          System.out.println("el salario de consultor es 2.000.000");
                                  break;}
                                            default:{
                   System.out.println("Opcion incorrecta");
                   }
                }    
          }
   }
 