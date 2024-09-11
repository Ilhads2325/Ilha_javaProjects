package atvs2;

public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corolla", 2020, 90000.0);
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Preço: " + carro.getPreco());
		carro.setMarca("Honda");
		System.out.println("Marca Alterada: " + carro.getMarca());
		carro.setModelo("Civic");
		System.out.println("Modelo Alterada: " + carro.getModelo());
		carro.setAno(2021);
		System.out.println("Ano Alterada: " + carro.getAno());
		carro.setPreco(95000.0);
		System.out.println("Preço Alterada: " + carro.getPreco());
		
	}
}
