
public class testaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//segundo ainda vale 5
		
		System.out.println(segundo);
	}
}
