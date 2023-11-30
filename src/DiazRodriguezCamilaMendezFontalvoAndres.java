import java.util.Scanner;
import javax.swing.JOptionPane;

public class DiazRodriguezCamilaMendezFontalvoAndres {

    static String pedir;
	static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select =0, select2=0; //opción elegida del usuario
	static double diagonalmayor=0, diagonalmenor=0, perimetro=0, area=0, lado1=0, lado2=0, lado=0;
	public static void main(String[] args) {
	
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select == 0){
			//Try catch para evitar que el programa termine si hay un error
			
				String lectura = JOptionPane.showInputDialog(null,"\n¿Deseas usar nuestro programa?:\n" + "\n1. Si\n" + "\n2. No\n");
                                
				//Recoger una variable por consola
				select = Integer.parseInt(lectura); 
		               
                                
                                
		//Switch case en Java
		  switch(select){
                                
                       case 1:
                       String lectura2 = JOptionPane.showInputDialog(null,"¿Con que figura deseas trabajar?:\n" + "\n1. Triangulo equilatero\n" + "\n2. Rombo\n" );
                                
		        //Recoger una variable por consola
		        select2 = Integer.parseInt(lectura2);    
                      
                        
                        switch (select2){
                        
                            case 1:
                        
                            pedir = JOptionPane.showInputDialog(null,"Digite el valor del lado 1: ");
			    lado1 = Integer.parseInt(pedir);
			
			    pedir = JOptionPane.showInputDialog(null,"Digite el valor del lado 2: ");
			    lado2 = Integer.parseInt(pedir);
                        
                            area= (lado1*lado2)/2;
                            
                            perimetro= Math.sqrt(Math.pow(lado1,2) + Math.pow(lado2,2)); 
                            perimetro= perimetro + lado1 + lado2;
                           
                            JOptionPane.showMessageDialog(null,"El area del Triangulo Equilatero es: " + area + "\nEl perimetro del Triangulo Equilatero es: " + perimetro);
                            break;
                        
                            
                            
                            case 2:
                            
                            pedir = JOptionPane.showInputDialog(null,"Digite el valor del diagonal mayor: ");
			    diagonalmayor = Integer.parseInt(pedir);
			
			    pedir = JOptionPane.showInputDialog(null,"Digite el valor del diagonal menor: ");
			    diagonalmenor = Integer.parseInt(pedir);
                            diagonalmayor=Integer.parseInt(pedir);
                            
                            area= (diagonalmayor*diagonalmenor)/2;
                            
                            pedir= JOptionPane.showInputDialog(null,"Digite el valor de los lados: ");
                            lado= Integer.parseInt(pedir);
                            perimetro= (lado)*4;
                          
      
                            JOptionPane.showMessageDialog(null,"El area del rombo es: " + area + "\nEl perimetro del Rombo es:  "+ perimetro );
                            break;    
                                
                                
                            
                        }
                        
                        
                        
                       
                     
                       
                        
                                                            
                             }
	


                                
}
        }
        
}
