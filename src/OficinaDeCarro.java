public class OficinaDeCarro extends Oficina{

    @Override
    public Integer orcarCustoDoReparo(Veiculo veiculo) {
        Carro carro = (Carro) veiculo;

        Peca pneus = carro.getPneus();
        Peca banco = carro.getBanco();
        Peca portas = carro.getPortas();

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

        if(portas.isPecaEmBomEstado()){
            System.out.println(portas.getNome() + " está em bom estado.");
        }else{
            System.out.println(portas.getNome() + " precisa de reparos.");

            valorTotal = valorTotal + portas.getValorDeUmaNovaPeca();
        }

        return valorTotal;
    }
    
}
