package ar.edu.unlam.pb2;

public class Cuenta {
public Double Saldo;

public Cuenta ()
{
	this.Saldo=0.00;
	
}
public void setSaldo(Double saldo)
{
	this.Saldo= saldo;
	return;
	
}
public Double getSaldo ()
{
	return this.Saldo;
}

public void hacerDeposito(Double deposito)
{
	if(validaDeposito(deposito))
	this.Saldo=this.getSaldo() + deposito;
	
}
 public void hacerExtraccion(Double extraccion)
 {
	 if(validaExtraccion(extraccion))
		 this.Saldo=this.getSaldo()-extraccion;
	 
 }
  boolean validaDeposito(Double deposito)
 {
	 if(deposito >=0 )
	 {
		 return true;
	 }
	 else return false;
 }
  boolean validaExtraccion (Double extraccion)
  {
		 if(extraccion >=0 && extraccion <= this.getSaldo())
		 {
			 return true;
		 }
		 else return false;
  }
}

