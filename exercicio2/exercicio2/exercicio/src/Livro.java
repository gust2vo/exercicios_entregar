import java.time.LocalDate;

public class Livro {
    private String titulo, autor;
    private LocalDate dataPublicacao;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    private int tempoLancamento() {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataPublicacao.getYear();
        if(dataAtual.getMonthValue() < dataPublicacao.getMonthValue() || (dataAtual.getMonthValue() == dataPublicacao.getMonthValue() && dataAtual.getDayOfMonth() < dataPublicacao.getDayOfMonth())){
            idade --;
        }
        return idade;
    }

    public String informacoes() {
        return "O nome do livro é " + titulo + " o autor é " + autor + "e o tempode lançamento é " + tempoLancamento() +  " anos";
    }

}
