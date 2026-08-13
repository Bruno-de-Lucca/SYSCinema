public class Ingresso {
    private String tipo; // "Inteira" ou "Meia"
    private double valor;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;

    // Construtor Padrão
    public Ingresso() {
    }

    // Construtor com Parâmetros
    public Ingresso(String tipo, double valor, Sessao sessao, Cliente cliente, Funcionario funcionario) {
        this.tipo = tipo;
        this.valor = valor;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}