/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

/**
 *
 * @author jonnathan
 */
import java.util.Scanner;
import ec.edu.ups.clases.Datos;
import ec.edu.ups.clases.Carta;
import ec.edu.ups.clases.Catalogo;
import ec.edu.ups.clases.Inventarios;
import ec.edu.ups.clases.Nomina;
public class prueba {
    public static void main(String[]arg){
        int ob,m;
        String repetir = null;
        Scanner teclado=new Scanner(System.in);
        Datos obj=new Datos();
        Carta obj1=new Carta();
        Catalogo obj2=new Catalogo();
        Inventarios obj3=new Inventarios();
        Nomina obj4=new Nomina();
        
        
        do{
        System.out.println(   "****Restaurante*****");
        System.out.println("-----INGRESE SU OPCION------");
        System.out.println(    "****1.Factura*****");
        System.out.println(   "****2.Menu Comida*****");
        System.out.println(   "****3.Publicidad*****");
        System.out.println(     "****4.Insumos*****");
        System.out.println("****5.Personal Restaurant*****");
         System.out.println("****6.SALIR*****");
        ob=teclado.nextInt();
        
            switch(ob) {
			case 1:
				
                                System.out.print("ingrese codigo: ");
				int b=teclado.nextInt();
				System.out.print("ingrese ruc: ");
				int a=teclado.nextInt();
                                System.out.print("ingrese Direcccion: ");
                                int c=teclado.nextInt();
                                System.out.print("ingrese cantidad: ");
                                int d=teclado.nextInt();
                                System.out.print("ingrese Detalle: ");
                                int e=teclado.nextInt();
                                System.out.print("ingrese valor uniotario: ");
                                int f=teclado.nextInt();
                                System.out.print("ingrese valor total: ");
                                int g=teclado.nextInt();
                                
				
				obj.setCodigo(ob);
                                obj.setRuc(a);
                                obj.setDireccion();
                                obj.setCantidad(a);
                                obj.setDetalle(a);
                                obj.setValorUnitario(a);
                                obj.setValorTotal(a);
                               
       
                                
                                
				
				break;
				
			case 2: 
				System.out.print("ingrese codigo: ");
				int h=teclado.nextInt();
                                System.out.print("1. Entremes: ");
                                int i=teclado.nextInt();
                                System.out.print("2. Caldos : ");
                                int j=teclado.nextInt();
                                System.out.print("3. Ensaladas: ");
                                int k=teclado.nextInt();
                                System.out.print("4. Pastas: ");
                                int l=teclado.nextInt();
                                System.out.print("5. Mariscos: ");
                                int n=teclado.nextInt();
                                System.out.print("6. Carnes: ");
                                int o=teclado.nextInt();
                                System.out.print("7. Postres: ");
                                int ñ=teclado.nextInt();
                                
                                
                                
                                obj1.setCodigo(ob);
                                obj1.setCaldos(repetir);
                                obj1.setEnsaladas(repetir);
                                obj1.setPastas(repetir);
                                obj1.setMariscos(repetir);
                                obj1.setCarnes(repetir);
                                obj1.setPostres(repetir);
                                
				
				break;
				
			case 3: 
				System.out.print("ingrese codigo: ");
				int ab=teclado.nextInt();
                                System.out.print("****Restaurante****: ");
                                System.out.println();
                                
                                System.out.print("TARJETA PRESENTACION: ");
                                 System.out.println();
                                System.out.print("DIRECCION______Cuenca_________");
                                 System.out.println();
                                System.out.print("HORARIO DE ATENCION___7am 7pm____ ");
                                 System.out.println();
				obj2.setCodigo(ab);
                                obj2.setNombre(repetir);
				obj2.setDireccion(repetir);
                                obj2.setHorarioAtencion(ab);
                                
				break;
				
			case 4:
				System.out.print("ingrese codigo: ");
				int asb=teclado.nextInt();
                                System.out.print("INVENTARIOS: ");
                                System.out.print("1.Muebles y Enseres: ");
                                int as=teclado.nextInt();
                                System.out.print("2.Materia Prima: ");
                                int ad=teclado.nextInt();
                                System.out.print("3.Maquinaria: ");
                                int af=teclado.nextInt();
                                System.out.print("4.Productos Terminados: ");
                                int ag=teclado.nextInt();
                                
                                
                                
				
				obj3.setCodigo(ag);
				obj3.setMueblesEnseres(repetir);
                                obj3.setMateriaPrima(repetir);
                                obj3.setMaquinaria(repetir);
                                obj3.setProductosTerminados(ad);
				break;
				
			case 5:
				System.out.print("ingrese codigo: ");
				int bf=teclado.nextInt();
                                System.out.print("1.Area Administrativa: ");
                                int be=teclado.nextInt();
                                System.out.print("2.Servicios: ");
                                int br=teclado.nextInt();
                                System.out.print("3.Operativo: ");
                                int bt=teclado.nextInt();
                                System.out.print("4.Ventas: ");
                                int by=teclado.nextInt();
                                
                                
				
				
				
				
		}
		System.out.println("Desea continuar s/n");
		repetir=teclado.next();
	 }while (repetir.equals("s"));
	}

    }
  
