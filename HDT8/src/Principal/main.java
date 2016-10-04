/*
Universidad del Valle de Guatemala 
Algoritmos y Estructura de datos
Nombres: Marlon Fuentes- Mario Hernandez
Carnets: 15240- 15135
*/
/**
 *
 * @author Marlon y Mario
 */
public class main {
   public static void main(String[] args) {
        // TODO code application logic here
          BufferedReader br = null;
       try{
           String lineas[] = null;
           String linea;
           br = new BufferedReader(new FileReader(""));
           while((linea = br.readLine())!= null){
               linea.split(",");
               
           }
       }catch(IOException e ){
           e.printStackTrace();
       }
    
   
   }
   private void principal(){
      inicializar();
   }
   private void inicializar(){
      String respuesta="";
		boolean val = true;
		
		System.out.println("Bienvenido al Centro Medico! \n");
		do{
			System.out.println("Menu:");
			System.out.println("1. Pacientes Ingresados");
			System.out.println("2. Ingresar Paciente");
			System.out.println("3. Out\n");
			
			System.out.print("---- ");
			resp = snr.nextLine();
			switch(respuesta){
				case "1":
					System.out.println("Los Pacientes que se encuentran en la lista son:");
					System.out.println("__________________________________");
					for(Pacientes p:Pacientes.getRazon().getNombre()){
						System.out.println("Nombre: "+p.getNombre());
						System.out.println("Sintoma: "+p.getRazon());
						System.out.println("Codigo: "+p.getPrioridad());
						System.out.println("__________________________________");
					}
					
					break;
				case "2":
					Pacientes p = new Pacientes();
					System.out.println("Ingrese la informacion del paciente:");
					System.out.print("Nombre: ");
					respuesta = snr.nextLine();
					p.setName(respuesta);
					System.out.print("Sintoma: ");
					respuesta = snr.nextLine();
					p.setSintoma(respuesta);
					System.out.print("Codigo: ");
					respuesta = snr.nextLine();
					p.setCodigo(respuesta);
					Pacientes.getRazon().getNombre().add(p);
					break;
				case "e":
					System.out.println("Gracias por su preferencia!");
					val = false;
					break;
				default:
					System.out.println("No es una opccion!\n");
					break;
			}
			
		}while(val);
}
