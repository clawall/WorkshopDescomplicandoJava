public class Peca {

    private String nome;

    private Integer valorDeUmaNovaPeca;
    
    private Boolean pecaEmBomEstado = true;

    public Peca(String nome, Integer valorDeUmaNovaPeca){
        this.nome = nome;
        this.valorDeUmaNovaPeca = valorDeUmaNovaPeca;
    }

    public String getNome(){
        return nome;
    }

    public Integer getValorDeUmaNovaPeca(){
        return valorDeUmaNovaPeca;
    }

    public Boolean isPecaEmBomEstado(){
        return pecaEmBomEstado;
    }

    public void setPecaEmBomEstado(Boolean pecaEmBomEstado){
        this.pecaEmBomEstado = pecaEmBomEstado;
    }
}
