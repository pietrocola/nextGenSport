package modello_dominio;

public class DescrizioneCorso {

	private String nome;
	private TipologiaCorso tipologia;
	private boolean prenotazione;

	public DescrizioneCorso()
	{
		setNome("Nome corso");
		setTipologiaCorso(tipologia);
		setPrenotazione(false);
	}
	
	public DescrizioneCorso(String s, TipologiaCorso t, boolean p)
	{
		setNome(s);
		setTipologiaCorso(t);
		setPrenotazione(p);
	}
	
	public void setNome(String n)
	{
		this.nome = n;
	}
	
	public void setTipologiaCorso(TipologiaCorso t)
	{
		this.tipologia = t;
	}
	
	public void setPrenotazione(boolean b)
	{
		this.prenotazione = b;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public TipologiaCorso getTipologiaCorso()
	{
		return this.tipologia;
	}
	
	public boolean getPrenotazione()
	{
		return this.prenotazione;
	}
	
	public String[] getInfoRiepilogo() 
	{
		String[] riepilogo = new String[3];
		
		riepilogo[0] = this.getNome();
		riepilogo[1] = this.tipologia.getNome();
		if (this.getPrenotazione())
			riepilogo[2] = "Si";
		else
			riepilogo[2] = "No";
		
		return riepilogo;
	}

}