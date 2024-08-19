public class App {
    public static void main(String[] args) throws Exception {
        Agencia caixaLuizote = new Agencia("0205-08");
        Conta contaCorrente = new ContaCorrente(caixaLuizote, "1164-9",100d,1000);
        Conta contaPoupanca1 = new ContaPoupanca(caixaLuizote, "1324-9",100d) ;
        Conta contaPoupanca2 = new ContaPoupanca(caixaLuizote, "1325-9",100d) ;
        Conta contaSalario = new ContaSalario(caixaLuizote, "1234-9", 100d);

        caixaLuizote.addConta(contaPoupanca1);
        caixaLuizote.addConta(contaPoupanca2);
        caixaLuizote.addConta(contaCorrente);
        caixaLuizote.addConta(contaSalario);

        caixaLuizote.cobrarTarifas();

        caixaLuizote.saque("1164-9",1);
        caixaLuizote.saque("1324-9", 1);
        caixaLuizote.saque("1325-9", 1); 
        caixaLuizote.saque("1234-9", 1);
        
        

    }
}
