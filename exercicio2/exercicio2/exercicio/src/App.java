import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        Livro livro = new Livro();
        livro.setTitulo("A divina comedia");
        livro.setAutor("Dante");

        System.out.println("Qual é a data de publicação do livro? (Formato: dd/MM/yyyy)");
        String dataPublicacaoStr = scan.nextLine();
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPublicacao = LocalDate.parse(dataPublicacaoStr, formatado);
        livro.setDataPublicacao(dataPublicacao);

        System.out.println(livro.informacoes());
    }
}
