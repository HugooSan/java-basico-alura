
public class testeIR {
	//Exercicio proposto do curso para prática com if
	
	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("A sua aliquota é de 7,5%");
			System.out.println("E pode deduzir R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("E pode deduzir R$ 350");
		}else if(salario>=3751.01 && salario<=4664) {
			System.out.println("A sua aliquota é de 22,5%");
			System.out.println("E pode deduzir R$ 636");
		}

	}
}
