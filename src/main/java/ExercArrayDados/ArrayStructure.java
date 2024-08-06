package ExercArrayDados;
public class ArrayStructure {
  public static void main(String[] args) {
    // Declarar e Inicializar
    String [] tarefas = {"Estudar Java", "Fazer exercícios", "Tomar café"};
    
    // Acessar posições do Array
    System.out.println(tarefas[0]);
    System.out.println(tarefas[1]);
    System.out.println(tarefas[2]);

    // Atualizar posições do Array
    tarefas[2] = "Limpar a casa";
    System.out.println(tarefas[2]);

    // Tamanho do Array
    System.out.println("Você possui " + tarefas.length + " tarefas.");

    // Percorrer / Iterar Arrays
    // for (int i = 0; i < tarefas.length; i++) {
    //   System.out.print(tarefas[i] + " ");
    // }
    // for (String tarefa : tarefas) {
    //   System.out.print(tarefa + " ");
    // }

    for (String arg : args) {
      System.out.println(arg);
    }

    // Array Multidimensional
    // Dado tabular - linhas e colunas
    int [][] sudoku = { {3, 6, 7}, {4, 9, 8}, {5, 2, 1} };

    System.out.println(sudoku[0][0]);
    sudoku[0][0] = 1;
    sudoku[2][2] = 3;
    System.out.println(sudoku[0][0]);
    System.out.println(sudoku[2][2]);
  
    for(int i = 0; i < sudoku.length; i++) {
      for (int j = 0; j < sudoku[i].length; j++) {
        System.out.print(sudoku[i][j] + " ");
      }
      System.out.println();
    }

    for (int[] linhaSudoku : sudoku) {
      for (int numero : linhaSudoku) {
        System.out.print(numero + " ");
      }
      System.out.println();
    }
  }
}
