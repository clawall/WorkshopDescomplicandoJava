public class Carro extends Veiculo {

    private Peca portas = new Peca("Portas", 1000);
    
    public Carro(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void acelera(Integer porQuantosQuilometros) {
        this.velocidade = this.velocidade + porQuantosQuilometros;
    }

    @Override
    public void desacelera(Integer porQuantosQuilometros) {
        this.velocidade = this.velocidade - porQuantosQuilometros;
    }

    public Peca getPortas(){
        return portas;
    }
}
