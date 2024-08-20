package exercTrabalhandoObjetos;
import java.util.Arrays;

public class Curriculo {
    public String nome = "Giuliana Bezerra";
    public Integer idade = 34;
    public String[] competencias = { "Java" };
    public String[] experiencias = { "Instrutora Online", "Desenvolvedora" };
    
    public String sobreMim() {
        return "Olá, eu sou " + nome + 
        ", tenho " + idade + " anos, trabalho com " +
        Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
    }
}