public class Main {
    public static void main(String[] args) {
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        double consumo = 1200.00;
        
        // Cliente Regular
        calculadora.setDescontoStrategy(new CalcularClienteRegular());
        double descontoRegular = calculadora.calcularDesconto(consumo);
        System.out.println("Desconto para Cliente Regular: " + descontoRegular);

        // Cliente VIP
        calculadora.setDescontoStrategy(new CalculaClienteVIP());
        double descontoVIP = calculadora.calcularDesconto(consumo);
        System.out.println("Desconto para Cliente VIP: " + descontoVIP);

        // Funcionário
        calculadora.setDescontoStrategy(new CalculaFuncionario());
        double descontoFuncionario = calculadora.calcularDesconto(consumo);
        System.out.println("Desconto para Funcionário: " + descontoFuncionario);

        
    }
}
