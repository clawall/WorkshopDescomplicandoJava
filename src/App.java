public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Jeep", "Renegade");
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elétrica");

        carro.getBanco().setPecaEmBomEstado(false);
        Oficina oficinaDeCarro = new OficinaDeCarro();

        Integer valorReparoCarro = oficinaDeCarro.orcarCustoDoReparo(carro);

        System.out.println("O custo do reparo do carro é de " + valorReparoCarro + " reais.");

        bicicleta.getBanco().setPecaEmBomEstado(false);
        bicicleta.getPneus().setPecaEmBomEstado(false);
        Oficina oficinaDeBicicleta = new OficinaDeBicicleta();

        Integer valorReparoBicicleta = oficinaDeBicicleta.orcarCustoDoReparo(bicicleta);

        System.out.println("O custo do reparo da bicicleta é de " + valorReparoBicicleta + " reais.");
    }
}
