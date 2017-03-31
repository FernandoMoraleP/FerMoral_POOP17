
public class CicloMenstrual {

	public int inicioSangrado;         //
	public int finSangrado;            //
	public int inicioPeriodoInfetil;   //
	public int finPeriodoInfetil;      // ATRIBUTOS 
	public int inicioPeriodoFertil;    //
	public int finPeriodoFertil;       //

	public CicloMenstrual () {// COSTRUCTOR POR OMISIÓN 

	}

	public int getinicioSangrado (){ // METODOS
		return inicioSangrado;
	}

	public void setinicioSangrado (int inicio){
		inicioSangrado = inicio;
	}

	public int getfinSangrado (){
		return finSangrado;
	}

	public void setfinSangrado (int fin){
		finSangrado = fin;
	} 	

	public int getinicioPeriodoInfertil (){
		return inicioPeriodoInfetil;
	}

	public void setinicioPeriodoInfertil (int inicio1){
		inicioPeriodoInfetil = inicio1;
	} 

	public int getfinPeriodoInfertil () {
		return finPeriodoInfetil;
	}

	public void setfinPeriodoInfertil (int fin1){
		finPeriodoInfetil = fin1;
	}

	public int getinicioPeriodoFertil (){
		return inicioPeriodoFertil;
	}

	public void setinicioPeriodoFertil (int inicio2){
		inicioPeriodoFertil = inicio2;
	} 

	public int getfinPeriodoFertil (){
		return finPeriodoFertil;
	}

	public void setfinPeriodoFertil (int fin2){
		finPeriodoFertil = fin2;
	} 					
									//METODOS


	
}