package ExercTomandoDecisoesnoCodigo;

public class DiadaSemanaGrupoEstudo {

	public static void main(String[] args) {
		
		int diaDaSemana = 1;
		
		String dia = switch(diaDaSemana){
		 case 1 ->{
			System.out.println("Domingo");
			yield "Domingo";
		 }
		 case 2 -> "Segunda-Feira";
		 case 3 -> "Terca-Feira";
		 default -> "Dia invalido";
		};
		
		System.out.println("O dia da semana é: " +dia);

	}

}
