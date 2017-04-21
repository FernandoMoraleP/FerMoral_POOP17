public class MetodosAnticonceptivos {
	public InputStreamReader isr = new InputStreamReader(System.in);
	public BufferedReader bf = new BufferedReader(isr);
	public String dato;
	public int op;
	public PrintStream fsalida = System.out; 

	public void LisataMetodos() {
		
		fsalida.println("La lista de Metodos anticonceptivos\n");
		fsalida.println("1.-Abstinencia\n");
		fsalida.println("2.-Parches\n");
		fsalida.println("3.-Pildora Anticonceptiva\n");
		fsalida.println("4.-Condones\n");
		fsalida.println("5.-Diafragma\n");
		fsalida.println("6.-Anticoncepcion De Urgencia\n");
		fsalida.println("7.-DIU\n");
		fsalida.println("8.-Metodo de Ritmo\n");
		fsalida.println("9.-No Utilizo ningun metodo anticonceptivo\n");
	}

	public void informacion(){

		try{
			dato = bf.readLine();
			op = Integer.parseInt(dato);
		}catch(IOException ex){}

		this.LisataMetodos(op);

		switch(op){
			case 1: 
			fsalida.println("¿Que es la Abstinencia?");
			fsalida.println("La Abstinencia es pocas palabras es:\n[1].-Comportamiento que previene el embarazo\n");
			fsalida.println("[2].-Previene las infecciones de trasmision sexual\n[3].-Segura,Facil y Comoda");


			break;

			case 2:
			fsalida.println("Parches");
			fsalida.println("El parche anticonceptivo en pocas palabras:\n[1].-Es un pequeño parche que se adhiere a la piel para prevenir embarazos\n");
			fsalida.println("[2].-Es seguro, eficaz y conveniente\n[3].-Es facil de conseguir con una receta medica\n[4].-Cuesta al rededor de 50-90 pesos por mes");


			break;

			case 3:
			fsalida.println("Pildora anticonceptiva\n");
			fsalida.println("Las pildoras anticonceptivas en pocas palabras:\n");
			fsalida.println("[1].-Toma una pildora por dia para prevenir embarazos\n[2].-Es segura, eficaz y conveniente\n");
			fsalida.println("[3].-Es facil de conseguir con una receta medica\n[4].-Cuesta alrededor de 20-50 pesos por mes");
			break;

			case 4: 
			
		}



	}
}