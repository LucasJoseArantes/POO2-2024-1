package service;

import java.time.Duration;

import model.Veiculo;

public interface CalculoValor {
    
    public Double calcularValor(Duration duracao , Veiculo veiculo);

    


}
