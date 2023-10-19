// Classe abstrata representando um veículo
abstract class Veiculo {
    public abstract void acelerar();
    public abstract void frear();
}

// Subclasse Carro
class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta pedalando...");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando...");
    }
}

// Interface do Factory Method
interface VeiculoFactory {
    Veiculo criarVeiculo();
}

// Factory Method para criar Carros
class CarroFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}

// Factory Method para criar Bicicletas
class BicicletaFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Bicicleta();
    }
}

public class Main {
    public static void main(String[] args) {
        // Usando o Factory Method para criar carros
        VeiculoFactory factoryCarro = new CarroFactory();
        Veiculo carro = factoryCarro.criarVeiculo();
        carro.acelerar();
        carro.frear();

        // Usando o Factory Method para criar bicicletas
        VeiculoFactory factoryBicicleta = new BicicletaFactory();
        Veiculo bicicleta = factoryBicicleta.criarVeiculo();
        bicicleta.acelerar();
        bicicleta.frear();
    }
}
