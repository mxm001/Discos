package ar.edu.unlam.pb2;

public class Disco {
	
	private Double radioExterior;
	private Double radioInterior;
	
	//GET & SET
	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}


	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	//CONSTRUCTOR
	public Disco (Double radioExt,Double radioInt)
	{
		setRadioExterior(radioExt);
		setRadioInterior(radioInt);
		
	}
	//METODOS
	public Double calcularPerimetroInterior()
	{
		return  2*Math.PI*this.radioInterior;
	}
	
	public Double calcularPerimetroExterior()
	{
		return  2*Math.PI*this.radioExterior;
	}
	
	public Double calcularSuperficie()
	{
		return Math.PI* Math.pow((this.radioExterior-this.radioInterior),2.00);
	}
}
