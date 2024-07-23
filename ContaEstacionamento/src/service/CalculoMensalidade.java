package service;

import java.time.Duration;

import model.Passeio;
import model.Veiculo;

public class CalculoMensalidade implements CalculoValor{
    
    public Double calcularValor(Duration duracao, Veiculo veiculo) {
        if (veiculo instanceof Passeio) {
            long horas = duracao.toHours();
            return horas * 2.0;
        } 
        return 0.0;
    }
}
