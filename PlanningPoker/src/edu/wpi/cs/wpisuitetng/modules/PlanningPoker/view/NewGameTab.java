/*******************************************************************************
* Copyright (c) 2012-2014 -- WPI Suite
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributor: team struct-by-lightning
*******************************************************************************/
package edu.wpi.cs.wpisuitetng.modules.PlanningPoker.view;

/**
 * @author sfmailand
 *
 */
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NewGameTab extends JPanel {
	private JTextField sessionName;
	private JTextField textField;
	private JTextField textField_1;
	JComboBox<String> deckType = new JComboBox<String>();
	String selectedDeckType = new String();

	JList<String> selectedRequirements = new JList<String>();
	JList<String> allRequirements = new JList<String>();
	
	DefaultListModel<String> gameRequirementsModel = new DefaultListModel<String>();
	DefaultListModel<String> everyRequirementModel = new DefaultListModel<String>();

	
	String enteredName = new String();
	/**
	 * Create the panel.
	 */
	public NewGameTab() {
		setBorder(new LineBorder(Color.DARK_GRAY));
		setLayout(new BorderLayout(0, 0));

		JPanel title_panel = new JPanel();
		FlowLayout title_panel_flow_layout = (FlowLayout) title_panel.getLayout();
		title_panel_flow_layout.setAlignment(FlowLayout.LEFT);
		title_panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		add(title_panel, BorderLayout.NORTH);

		JPanel panel_16 = new JPanel();
		title_panel.add(panel_16);

		JLabel lblName = new JLabel("Name:");
		panel_16.add(lblName);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));

		sessionName = new JTextField();
		panel_16.add(sessionName);
		sessionName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sessionName.setText("03/25/2014 Planning Poker Game");
		sessionName.setColumns(50);

		JPanel panel_17 = new JPanel();
		title_panel.add(panel_17);
		panel_17.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JButton btnCreateGame = new JButton("CREATE GAME");
		panel_17.add(btnCreateGame);

		JPanel footer_panel = new JPanel();
		footer_panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		add(footer_panel, BorderLayout.SOUTH);
		footer_panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.DARK_GRAY));
		footer_panel.add(panel_14, BorderLayout.NORTH);

		JLabel lblConfigureGameSettings = new JLabel("Configure game settings");
		panel_14.add(lblConfigureGameSettings);

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.LIGHT_GRAY));
		footer_panel.add(panel_15, BorderLayout.CENTER);
		panel_15.setLayout(new GridLayout(2, 3, 0, 0));

		JPanel panel_18 = new JPanel();
		panel_15.add(panel_18);

		JLabel lblStart = new JLabel("Start date/time:");
		panel_18.add(lblStart);

		textField = new JTextField();
		panel_18.add(textField);
		textField.setColumns(10);

		JPanel panel_19 = new JPanel();
		panel_15.add(panel_19);

		JLabel lblCardDeck = new JLabel("Card deck:");
		panel_19.add(lblCardDeck);


		deckType.setModel(new DefaultComboBoxModel<String>(new String[] {"default", "other"}));
		panel_19.add(deckType);

		JPanel panel_20 = new JPanel();
		panel_15.add(panel_20);

		JPanel panel_21 = new JPanel();
		panel_15.add(panel_21);

		JLabel lblEndDatetime = new JLabel("End date/time:");
		panel_21.add(lblEndDatetime);

		textField_1 = new JTextField();
		panel_21.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_22 = new JPanel();
		panel_15.add(panel_22);

		JPanel panel_23 = new JPanel();
		panel_15.add(panel_23);

		JPanel requirements_panel = new JPanel();
		requirements_panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		add(requirements_panel, BorderLayout.CENTER);
		requirements_panel.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY));
		requirements_panel.add(panel, BorderLayout.NORTH);

		JLabel lblChooseRequirementsTo = new JLabel("Choose requirements to estimate");
		lblChooseRequirementsTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblChooseRequirementsTo);

		JPanel panel_1 = new JPanel();
		requirements_panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 3, 3, 10));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.add(panel_5, BorderLayout.NORTH);

		JLabel lblAllProjectRequirements = new JLabel("All project requirements");
		panel_5.add(lblAllProjectRequirements);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));

		
		

		
		panel_7.add(allRequirements);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 1, 3, 3));

		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);

		JPanel panel_10 = new JPanel();
		panel_3.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_12 = new JPanel();
		panel_10.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		JButton btn_addToGame = new JButton("Add to game -->");
		btn_addToGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_12.add(btn_addToGame, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_10.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JButton btn_removeFromGame = new JButton("<-- Remove from game");
		panel_13.add(btn_removeFromGame, BorderLayout.CENTER);

		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_4.add(panel_6, BorderLayout.NORTH);

		JLabel lblRequirementsToEstimate = new JLabel("Requirements to estimate");
		panel_6.add(lblRequirementsToEstimate);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_4.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new BorderLayout(0, 0));

		
		
		gameRequirementsModel.addElement("Let's estimate this one");
		
		selectedRequirements.setModel(gameRequirementsModel);
		
		everyRequirementModel.addElement("Requirements");
		everyRequirementModel.addElement("Something else");
		everyRequirementModel.addElement("So many requirements");
		
		
		allRequirements.setModel(everyRequirementModel);

		panel_8.add(selectedRequirements);

		
		

		//Saves data entered about the game when 'Create Game' button is pressed
		btnCreateGame.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
				enteredName = sessionName.getText();
				selectedDeckType = (String)deckType.getSelectedItem();
				System.out.println(enteredName);
				System.out.println(selectedDeckType);
		    }
		});
		
		//Removes selected item from box of all requirements
		//and adds it to the box of requirements that will be used in the session
		btn_addToGame.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(allRequirements.getSelectedIndex() >=0){
		    		
		    		gameRequirementsModel.addElement(allRequirements.getSelectedValue());
			    	selectedRequirements.setModel(gameRequirementsModel);

			    	
			    	everyRequirementModel.removeElementAt(allRequirements.getSelectedIndex());
			    	allRequirements.setModel(everyRequirementModel);
			    	
		    	}
		    }
		});
		
		
		//Removes selected item from box of selected requirements for session
		//and adds it back to the total list of requirements
		btn_removeFromGame.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(selectedRequirements.getSelectedIndex() >= 0){
		    		everyRequirementModel.addElement(selectedRequirements.getSelectedValue());
			    	allRequirements.setModel(everyRequirementModel);
			    	
			    	gameRequirementsModel.removeElementAt(selectedRequirements.getSelectedIndex());
			    	selectedRequirements.setModel(gameRequirementsModel);
		    	}
		    	
		    }
		});
		
		
		
	}
	
	
	

}
