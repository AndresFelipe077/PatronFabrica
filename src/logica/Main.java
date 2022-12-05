package logica;

public class Main {
	public static void main(String[] args) {
		
	      IFabricaFactory fabricaFactory = new IFabricaFactory();
	  
	      //Area del circulo
	      IFabrica areaCirculo = fabricaFactory.getIFabrica("CIRCULO");	      
	      areaCirculo.calcularArea();

	      //Area del rectangulo    
	      IFabrica areaRectangulo = fabricaFactory.getIFabrica("RECTANGULO");	     
	      areaRectangulo.calcularArea();

	      //Area del cuadrado
	      IFabrica areaCuadrado = fabricaFactory.getIFabrica("CUADRADO");	     
	      areaCuadrado.calcularArea();
	      
	   }
}
