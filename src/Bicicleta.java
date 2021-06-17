public class Bicicleta extends Veiculo {

    public Bicicleta(String marca,String modelo){
        super(marca, modelo);
    }

    @Override
    public void acelera(Integer porQuantosQuilometros) {
        System.out.println("Pedalando para acelerar!");
        
        this.velocidade = this.velocidade + porQuantosQuilometros;
    }

    @Override
    public void desacelera(Integer porQuantosQuilometros) {
        System.out.println("Freando para desacelerar!");

        this.velocidade = this.velocidade - porQuantosQuilometros;
    }
    
}
