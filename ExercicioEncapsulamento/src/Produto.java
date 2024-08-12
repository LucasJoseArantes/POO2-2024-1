public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void aplicarImposto(double taxaImposto) {
        double valorImposto = precoBase * taxaImposto;
        precoBase += valorImposto;
    }

    public void aplicarTaxaAdicional(double taxaAdicional) {
        double valorAdicional = precoBase * taxaAdicional;
        precoBase += valorAdicional;
    }

    public double calcularPrecoFinal(Produto produto,Cliente cliente) {
        double precoFinal = produto.getPrecoBase();
        double desconto = cliente.aplicarDesconto();
        precoFinal -= precoFinal * desconto;
        return precoFinal;
    }
}
