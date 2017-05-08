package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta
{
	private Double Descubierto;
	private static final Double Porcentaje = 5.00;

	 public CuentaCorriente()
	 {
	 super();
	 Descubierto=0.00;
	 }
	 public CuentaCorriente(Double descubierto)
	 {
	 super();
	 setDescubierto(descubierto);
	 }
	 public void setDescubierto(Double descubierto){
		 this.Descubierto=descubierto;
	 }
	 @Override
	 public void hacerExtraccion(Double extraccion)
	 {
		if(validaExtraccion(extraccion))
		{
			Double descubierto=extraccion-this.getSaldo()<0?0:extraccion-this.getSaldo();
			Double recargo=descubierto*(this.Porcentaje/100);
			this.setSaldo(this.getSaldo()-extraccion-descubierto-recargo);
			this.setDescubierto(descubierto-recargo);
		}
	 }
	 @Override
	 boolean validaExtraccion (Double extraccion)
	  {
			Double descubierto=extraccion-this.getSaldo()<0?0:extraccion-this.getSaldo();
			
			Double recargo=descubierto*(this.Porcentaje/100);
			
			 if(extraccion >=0 && extraccion+recargo <= this.getSaldo()+this.Descubierto)
			 {
				 return true;
			 }
			 else return false;
	  }
}
