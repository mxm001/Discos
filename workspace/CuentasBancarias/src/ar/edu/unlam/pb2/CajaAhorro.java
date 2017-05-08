package ar.edu.unlam.pb2;

public class CajaAhorro extends Cuenta {
 private Integer contador;
 
 
 public CajaAhorro()
 {
 super();
 contador=0;
 }

 @Override
 public void hacerExtraccion(Double extraccion)
 {
	 if(this.contador>5)
	 {	 
		 if(validaExtraccion(extraccion+6))
				this.Saldo=this.getSaldo()-extraccion-6;

				 this.contador++;
	 }
	 else if(validaExtraccion(extraccion))
	 {
		 this.Saldo=this.getSaldo()-extraccion;

		 this.contador++;
	 }
 }
 
}
