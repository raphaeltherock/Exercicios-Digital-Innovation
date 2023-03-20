
public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("preto");
        carro1.setModelo("Celta Super 1.4");
        carro1.setCapacidadeTanque(45);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getcapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.50));

        Carro carro2 = new Carro("Cinza", "UP", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getcapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.60));

    }

}
