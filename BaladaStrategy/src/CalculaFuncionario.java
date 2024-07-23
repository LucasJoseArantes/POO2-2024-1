public class CalculaFuncionario implements DescontoStrategy {

    public double calcularDesconto(double consumo) {
        return consumo * 0.30;
    }
    
}
