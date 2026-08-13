public class Sessao {
    private String dataHora;
    private boolean encerrada;
    private Sala sala;
    private Filme filme;

    // Construtor Padrão
    public Sessao() {
    }

    // Construtor com Parâmetros
    public Sessao(String dataHora, boolean encerrada, Sala sala, Filme filme) {
        this.dataHora = dataHora;
        this.encerrada = encerrada;
        this.sala = sala;
        this.filme = filme;
    }

    // Getters e Setters
    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isEncerrada() {
        return encerrada;
    }

    public void setEncerrada(boolean encerrada) {
        this.encerrada = encerrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}