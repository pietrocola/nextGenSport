package modello_dominio;

public class TipologiaCorso {

	private String nome;

	public TipologiaCorso()
	{
		nome="Nuova tipologia";
	}
	
	public TipologiaCorso(String n)
	{
		setNome(n); 
	}
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public void setNome(String n) 
	{
		this.nome = n;
	}
}