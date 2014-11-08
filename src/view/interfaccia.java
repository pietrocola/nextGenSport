package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.orm.PersistentException;

import peristentmodel.TipologiaCorso;
import peristentmodel.TipologiaCorsoDAO;

public class interfaccia {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaccia window = new interfaccia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		/*
		TipologiaCorso tip = new TipologiaCorso("prova");
		//TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		//tip=tp.getTipologiaCorsoByORMID("sala");
		
		boolean aux;
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		aux=tp.save(tip);
		
	    //System.out.print(tip.getNometip());
	     */
	}

	
	
	
	
	/**
	 * Create the application.
	 */
	public interfaccia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
