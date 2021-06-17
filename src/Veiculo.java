public abstract class Veiculo {
    
    private String marca;

    private String modelo;

    protected Integer velocidade = 0;

    private Peca pneus = new Peca("Pneus", 100);

    private Peca banco = new Peca("Banco", 500);

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getDescricao(){
        return marca + " " + modelo;
    }

    public abstract void acelera(Integer porQuantosQuilometros);

    public abstract void desacelera(Integer porQuantosQuilometros);

    public Peca getPneus(){
        return pneus;
    }

    public Peca getBanco(){
        return banco;
    }
}
