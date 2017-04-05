
public class CicloMenstrual {

	private Fecha inicioSangrado;         //
	private Fecha finSangrado;            //
	private Fecha inicioPeriodoInfertil;   //
	private Fecha finPeriodoInfertil;      // ATRIBUTOS 
	private Fecha inicioPeriodoFertil;    //
	private Fecha finPeriodoFertil;       //

	public CicloMenstrual() {// COSTRUCTOR POR OMISIÓN 
		this.inicioSangrado = new Fecha();         //
		this.finSangrado = new Fecha();            //
		this.inicioPeriodoInfertil = new Fecha();   //
		this.finPeriodoInfertil = new Fecha();      // ATRIBUTOS 
		this.inicioPeriodoFertil = new Fecha();    //
		this.finPeriodoFertil = new Fecha();
	}

	public Fecha getinicioSangrado() { // METODOS
		return inicioSangrado;
	}

	public Fecha getfinSangrado() {
		return finSangrado;
	}

	public Fecha getinicioPeriodoInfertil() {
		return inicioPeriodoInfertil;
	}

	public Fecha getfinPeriodoInfertil() {
		return finPeriodoInfertil;
	}

	public Fecha getinicioPeriodoFertil() {
		return inicioPeriodoFertil;
	}


	public Fecha getfinPeriodoFertil() {
		return finPeriodoFertil;
	}

	public String toString() {
		return "Fecha inicio Sangrado" + this.inicioSangrado + "Fecha fin Sangrado:" + this.finSangrado
				+ "\n Fecha inicio Periodo Infertil:" + this.inicioPeriodoInfertil+ "Fecha fin Periodo Infertil:" + this.finPeriodoInfertil ;
	}


	
}