package view;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import org.orm.PersistentException;

import peristentmodel.TipologiaCorso;
import controller.ConfAbbCorsiHandler;

import java.awt.Color;

public class TipologiaCorso_Aggiungi{
   /**
    * @wbp.parser.entryPoint
    */
   public void formInserisciTipologia(JFrame frmNextgenSport)
   {
	   	   
	  	/*
	   frmNextgenSport = new JFrame();
		frmNextgenSport.setTitle("NextGen Sport");
		frmNextgenSport.setBounds(100, 100, 450, 300);
		frmNextgenSport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  */
	   GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmNextgenSport.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNuvaTipologia = new JLabel("Nuova tipologia");
		lblNuvaTipologia.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblNuvaTipologia = new GridBagConstraints();
		gbc_lblNuvaTipologia.gridwidth = 4;
		gbc_lblNuvaTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblNuvaTipologia.gridx = 5;
		gbc_lblNuvaTipologia.gridy = 0;
		frmNextgenSport.getContentPane().add(lblNuvaTipologia, gbc_lblNuvaTipologia);
		
				
		JLabel lblTipologia = new JLabel("Tipologia:");
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 1;
		gbc_lblTipologia.gridy = 3;
		frmNextgenSport.getContentPane().add(lblTipologia, gbc_lblTipologia);
		
		JTextField textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridwidth = 8;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 3;
		frmNextgenSport.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 8;
		gbc_label.gridy = 6;
		frmNextgenSport.getContentPane().add(label, gbc_label);
		
		JButton btnConferma = new JButton("Salva tipologia");
		ascoltatoreSalvaTipologia(label, btnConferma, textField_3);
		
		GridBagConstraints gbc_btnConferma = new GridBagConstraints();
		gbc_btnConferma.anchor = GridBagConstraints.WEST;
		gbc_btnConferma.insets = new Insets(0, 0, 5, 5);
		gbc_btnConferma.gridx = 8;
		gbc_btnConferma.gridy = 5;
		frmNextgenSport.getContentPane().add(btnConferma, gbc_btnConferma);
		
		
	
	}
   
   /**
    * se TRUE messaggio verde
    * se FALSE messaggio rosso
    */
   public void messaggio(JLabel label, boolean b, String text)
   {
	   label.setText(text);
	      
		if(b){label.setForeground(new Color(0, 153, 0));}
		else {label.setForeground(Color.RED);}			
   }
   
   public void messaggioRiepilogo(JLabel label, JTextField textField_3)
	{
		label.setText("<html>"+ label.getText() + "<br />"
				+ "<font color=”black”> Dati inviati: <br />"
				+ " Tipologoa corso: " + textField_3.getText()+ "</font></html>");
						
	}
   
   public void inserisciTipologia(JLabel label, JTextField textField_3) throws PersistentException
   {
	   ConfAbbCorsiHandler s = new ConfAbbCorsiHandler();//dovrebbe essere creato nel caso d'uso di avviamento
	 		 	
		if(s.impostaTipologiaCorso(textField_3.getText()))	//passo la stringa inserita dall'utente
		{
			messaggio(label, true, "Inserimento eseguito correttamente");
			messaggioRiepilogo(label, textField_3);
		}
		else
		{
			messaggio(label, false, "Errore: Riprovare!!");
			messaggioRiepilogo(label, textField_3);
		}
		
   }
   
   public void ascoltatoreSalvaTipologia(JLabel label, JButton btnConferma, JTextField textField_3)
   {
	   btnConferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					inserisciTipologia(label, textField_3);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		});
   }
   
   	   
}