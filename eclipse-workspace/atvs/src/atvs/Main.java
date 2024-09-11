package atvs;

public class Main {
	public static void main(String[] args)

	{
		pessoa pessoa = new pessoa("Joao" , 25);
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		pessoa.setNome("Maria");
		System.out.println("Nome Alterado: " + pessoa.getNome());
		pessoa.setIdade(30);
		System.out.println("Idade Alterado: " + pessoa.getNome());
	}	
}
