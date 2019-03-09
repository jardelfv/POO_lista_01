package exercicio01;

public class Cliente {
	private int codigo;
	private String nome;
	private boolean eClienteEspecial;
	private double limiteCredito;
	
	public Cliente(int c, String n){
		codigo = c;
		nome = n;
		limiteCredito = 0;
		eClienteEspecial = false;
		
	}
	
	public String obterNome(){
		return(nome);
		
	}
	
	public boolean atualizaLimite(double valor){
		boolean update = true;
		
		if(eClienteEspecial){
			limiteCredito += valor;
			System.out.println("Ok saldo atualizado!");
			update = true;
		}
		else{
			System.out.println("Ops saldo não pode atualizado!");
			update = false;
		}
		
		return(update);
		
	}
	
	public void atualizaSituacao(boolean situacao){
		eClienteEspecial = situacao;
		
		if(situacao){
			System.out.println("Ok cliente atualizado para modaldade Especial!");
		}
		else{
			limiteCredito = 0;
			System.out.println("Ok cliente atualizado para modaldade normal!");
		}
	}
	
	
}
