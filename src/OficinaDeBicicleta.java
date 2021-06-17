public class OficinaDeBicicleta extends Oficina{

    @Override
    public Integer orcarCustoDoReparo(Veiculo veiculo) {
        Bicicleta bicicleta = (Bicicleta) veiculo;

        Peca pneus = bicicleta.getPneus();
        Peca banco = bicicleta.getBanco();

        Integer valorTotal = 0;

        if(pneus.isPecaEmBomEstado()){
            System.out.println(pneus.getNome() + " está em bom estado.");
        }else{
            System.out.println(pneus.getNome() + " precisa de reparos.");

            valorTotal = valorTotal + pneus.getValorDeUmaNovaPeca();
        }

        if(banco.isPecaEmBomEstado()){
            System.out.println(banco.getNome() + " está em bom estado.");
        }else{
            System.out.println(banco.getNome() + " precisa de reparos.");

            valorTotal = valorTotal + banco.getValorDeUmaNovaPeca();
        }

        return valorTotal;
    }
    
}
