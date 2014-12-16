package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.MutableComboBoxModel;

import org.orm.PersistentException;

import peristentmodel.TipologiaCorso;
import controller.ConfAbbCorsiHandler;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Corso_Nuovo {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void formInserisciCorso(JFrame frmNextgenSport)
	   {
		/*
		    frmNextgenSport = new JFrame();
			frmNextgenSport.setTitle("NextGen Sport");
			frmNextgenSport.setBounds(100, 100, 450, 300);
			frmNextgenSport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
			gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			frmNextgenSport.getContentPane().setLayout(gridBagLayout);
			
			JLabel lblDatiDelNuovo = new JLabel("Dati del nuovo corso");
			GridBagConstraints gbc_lblDatiDelNuovo = new GridBagConstraints();
			gbc_lblDatiDelNuovo.insets = new Insets(0, 0, 5, 0);
			gbc_lblDatiDelNuovo.gridx = 3;
			gbc_lblDatiDelNuovo.gridy = 0;
			frmNextgenSport.getContentPane().add(lblDatiDelNuovo, gbc_lblDatiDelNuovo);
			
			JLabel lblNomeCorso = new JLabel("Nome corso:");
			GridBagConstraints gbc_lblNomeCorso = new GridBagConstraints();
			gbc_lblNomeCorso.insets = new Insets(0, 0, 5, 5);
			gbc_lblNomeCorso.anchor = GridBagConstraints.EAST;
			gbc_lblNomeCorso.gridx = 2;
			gbc_lblNomeCorso.gridy = 1;
			frmNextgenSport.getContentPane().add(lblNomeCorso, gbc_lblNomeCorso);
			
			JTextField textField_5 = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 0);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 3;
			gbc_textField_5.gridy = 1;
			frmNextgenSport.getContentPane().add(textField_5, gbc_textField_5);
			textField_5.setColumns(10);
			
			JLabel lblTipologia = new JLabel("Tipologia:");
			GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
			gbc_lblTipologia.anchor = GridBagConstraints.EAST;
			gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
			gbc_lblTipologia.gridx = 2;
			gbc_lblTipologia.gridy = 2;
			frmNextgenSport.getContentPane().add(lblTipologia, gbc_lblTipologia);
			
			JLabel label = new JLabel("");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 5, 0);
			gbc_label.gridx = 3;
			gbc_label.gridy = 4;
			frmNextgenSport.getContentPane().add(label, gbc_label);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
			GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
			gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox_1.gridx = 3;
			gbc_comboBox_1.gridy = 3;
			frmNextgenSport.getContentPane().add(comboBox_1, gbc_comboBox_1);
			
			JComboBox comboBox = new JComboBox(); //dichiarazione combo box tipologie
			
			
			JButton btnSalva = new JButton("Salva");
			ascoltatoreSalvaDescCorso(label, comboBox_1, comboBox, textField_5, btnSalva);
			btnSalva.setEnabled(true);
			GridBagConstraints gbc_btnSalva = new GridBagConstraints();
			gbc_btnSalva.gridx = 3;
			gbc_btnSalva.gridy = 5;
			frmNextgenSport.getContentPane().add(btnSalva, gbc_btnSalva);
			
			
			ascoltatoreGetTipologie(comboBox, label, btnSalva);			//continua combo box tipologie			
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 3;
			gbc_comboBox.gridy = 2;
			frmNextgenSport.getContentPane().add(comboBox, gbc_comboBox);
			
			JLabel lblPrenotazione = new JLabel("Prenotazione:");
			GridBagConstraints gbc_lblPrenotazione = new GridBagConstraints();
			gbc_lblPrenotazione.anchor = GridBagConstraints.EAST;
			gbc_lblPrenotazione.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrenotazione.gridx = 2;
			gbc_lblPrenotazione.gridy = 3;
			frmNextgenSport.getContentPane().add(lblPrenotazione, gbc_lblPrenotazione);
			
			
			
			
		}
	   
	public void messaggio(JLabel label, boolean b, String text)
	   {
		   label.setText(text);
		      
			if(b){label.setForeground(new Color(0, 153, 0));}
			else {label.setForeground(Color.RED);}			
	   }
	
	public void messaggioRiepilogo(JLabel label, JTextField textField_5, boolean pren, TipologiaCorso tip)
	{
		label.setText("<html>"+ label.getText() + "<br />"
				+ "<font color=”black”> Dati inviati: <br />Nome corso: " + textField_5.getText() + "<br />"
						+ " Tipologoa corso: " + tip.getNometip() + "<br />"
						+"Prenotazione: " + (pren ? "Si" : "No") + "</font></html>");
						
	}
	
	public void ascoltatoreGetTipologie(JComboBox comboBox, JLabel label, JButton btnSalva)
	{
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
				ConfAbbCorsiHandler contr = new ConfAbbCorsiHandler();//dovrebbe essere creato nel caso d'uso di avviamento
				try {
						ArrayList<TipologiaCorso> tc = contr.getNomeTipologie();
						if(tc.size()==0)
						{ 
							messaggio(label, false, "Non sono presenti tipologie");
							btnSalva.setEnabled(false);
						}
						else
						{
							DefaultComboBoxModel combo = new DefaultComboBoxModel();
							for(int i=0; i< tc.size(); i++)
							{	combo.addElement(tc.get(i)/*.getNometip()*/);}							
								comboBox.setModel(combo);
								//comboBox.addElement(tc[i].getNometip());
								btnSalva.setEnabled(true);
						}
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				
			}
		});
	}
	
	public void ascoltatoreSalvaDescCorso(JLabel label, JComboBox comboBox_1, JComboBox comboBox, JTextField textField_5, JButton btnSalva)
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConfAbbCorsiHandler contr = new ConfAbbCorsiHandler();//dovrebbe essere creato nel caso d'uso di avviamento
				
				TipologiaCorso a = (TipologiaCorso) comboBox.getSelectedItem();
				boolean b;
				if(comboBox_1.getSelectedItem() == "Si") 
				{b = true;} else {b = false;}  
									
				try {
					if(contr.configuraCorso(textField_5.getText(), b, a))
					{ 
						messaggio(label, true, "Inserimento eseguito correttamente");
						messaggioRiepilogo(label, textField_5, b, a);
					}
					else
					{
						messaggio(label, false, "Errore: Riprovare!!");
						messaggioRiepilogo(label, textField_5, b, a);
					}
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	
}
