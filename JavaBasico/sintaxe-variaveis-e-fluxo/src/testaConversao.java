
public class testaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//se não colocar aquele "L" no final ele entende que é int
		long numeroGrande = 21312312313212L;
		float pontoFlutuante = 3.14f;
		
		short numeroPequeno = 1213;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		
		System.out.println(total);
	}

}
