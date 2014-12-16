package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.M_ElencoTipologieCorso;
import model.M_TipologiaCorso;

import org.orm.PersistentException;

import controller.ConfAbbCorsiHandler;
import peristentmodel.TipologiaCorso;
import peristentmodel.TipologiaCorsoDAO;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.FlowLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.BoxLayout;

import java.awt.CardLayout;
import java.awt.GridLayout;

public class interfaccia {

	private JFrame frmNextgenSport;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaccia window = new interfaccia();
					window.frmNextgenSport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		/*
		 * ConfAbbCorsiHandler s = new ConfAbbCorsiHandler();//dovrebbe essere creato nel caso d'uso di avviamento
		 	s.impostaTipologiaCorso("ss");
		 	*/
		
		
		/*
		TipologiaCorso tip = new TipologiaCorso();
		//TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		//tip=tp.getTipologiaCorsoByORMID("sala");
		//tip=tp.loadTipologiaCorsoByORMID("campo");
		boolean aux;
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		aux=tp.save(tip);
		*/
	    //System.out.print(tip.getNometip());
	     
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
		frmNextgenSport = new JFrame();
		frmNextgenSport.getContentPane().setBackground(new Color(173, 216, 230));
		frmNextgenSport.setTitle("NextGen Sport");		
		frmNextgenSport.setBounds(100, 100, 450, 300);
		frmNextgenSport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
		JMenuBar menuBar = new JMenuBar();
		frmNextgenSport.setJMenuBar(menuBar);
		
		JMenu mnCorso_1 = new JMenu("Corso");
		menuBar.add(mnCorso_1);
		
		JMenuItem mntmCreaNuovo = new JMenuItem("Nuovo");
		ascoltatoreNuovoCorso(mntmCreaNuovo);
		mnCorso_1.add(mntmCreaNuovo);
		
		JMenuItem mntmModifica = new JMenuItem("Modifica");
		mntmModifica.setEnabled(false);
		mnCorso_1.add(mntmModifica);
		
		JMenuItem mntmElimina = new JMenuItem("Elimina");
		mntmElimina.setEnabled(false);
		mnCorso_1.add(mntmElimina);
		
		JMenu mnTipologiaCorso = new JMenu("Tipologia Corso");
		menuBar.add(mnTipologiaCorso);
		
		JMenuItem mntmAggiungi = new JMenuItem("Aggiungi");
		ascoltatoreAggiungiTipologia(mntmAggiungi);
		mnTipologiaCorso.add(mntmAggiungi);
		
		JMenuItem mntmModifica_1 = new JMenuItem("Modifica ");
		mntmModifica_1.setEnabled(false);
		mnTipologiaCorso.add(mntmModifica_1);
		
		JMenuItem mntmElimina_1 = new JMenuItem("Elimina");
		mntmElimina_1.setEnabled(false);
		mnTipologiaCorso.add(mntmElimina_1);
						
	}

	/**
	 * Pulisce il pannello principale
	 */
	public void pulisciFinestra(JFrame frmNextgenSport)
	   {		   
		  frmNextgenSport.getContentPane().removeAll();	//rimuovi tutti gli oggetti
		  frmNextgenSport.getContentPane().repaint();	//ripristina il pannello vuoto
	   }
	
	public void ascoltatoreAggiungiTipologia(JMenuItem mntmAggiungi)
	{
		mntmAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pulisciFinestra(frmNextgenSport);
				
				TipologiaCorso_Aggiungi at = new TipologiaCorso_Aggiungi();
				at.formInserisciTipologia(frmNextgenSport);
				
				frmNextgenSport.getContentPane().validate(); //valida l'aggiornamento grafico
				
			}
		});
	}
	
	public void ascoltatoreNuovoCorso(JMenuItem mntmCreaNuovo)
	{
		mntmCreaNuovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pulisciFinestra(frmNextgenSport);
								
				Corso_Nuovo ac = new Corso_Nuovo();
				ac.formInserisciCorso(frmNextgenSport);
				frmNextgenSport.revalidate();
			}
		});
	}
}
