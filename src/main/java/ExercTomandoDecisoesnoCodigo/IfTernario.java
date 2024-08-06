package ExercTomandoDecisoesnoCodigo;

public class IfTernario {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int maior = (a > b) ? ((a > c) ? a : b) : ((b > c) ? b : c);
		
		System.out.println("Qual é o maior " + maior);
	}

}
