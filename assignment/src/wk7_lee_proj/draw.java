package wk7_lee_proj;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;

import javax.swing.SwingConstants;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JRadioButton;


import java.awt.Button;
import java.util.ArrayList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


public class draw {

	private JFrame frm_drawing;
	private canvasArea canvas;   
	private canvasArea canvas_1;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					draw window = new draw();
					window.frm_drawing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	/**
	 * Create the application.
	 */
	public draw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frm_drawing = new JFrame();
		frm_drawing.setTitle("drawing");
		frm_drawing.setBounds(100, 100, 702, 535);
		frm_drawing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_drawing.getContentPane().setLayout(null);
		final JLabel statusbar= new JLabel("default");
		statusbar.setBounds(1, 4, 1, 3);
		frm_drawing.getContentPane().add(statusbar);

		    
		Button lineButton = new Button("Line");
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lineButton.setBounds(10, 32, 85, 41);
		frm_drawing.getContentPane().add(lineButton);
		
		Button ovalButton = new Button("Oval");
		ovalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ovalButton.setBounds(101, 32, 85, 41);
		frm_drawing.getContentPane().add(ovalButton);
		
		Button setColourRed_Button = new Button("RED");
		setColourRed_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setColourRed_Button.setBackground(Color.RED);
		setColourRed_Button.setForeground(Color.BLACK);
		setColourRed_Button.setBounds(400, 32, 53, 41);
		frm_drawing.getContentPane().add(setColourRed_Button);
		
		Button setColourYellow_Button = new Button("Yellow");
		setColourYellow_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setColourYellow_Button.setBackground(Color.YELLOW);
		setColourYellow_Button.setBounds(459, 32, 48, 41);
		frm_drawing.getContentPane().add(setColourYellow_Button);
		
		Panel panel1 = new Panel();
		panel1.setBounds(118, 145, 318, 245);
		frm_drawing.getContentPane().add(panel1);
		
		canvas_1 = new canvasArea();
		canvas_1.setForeground(Color.ORANGE);
		panel1.add(canvas_1, BorderLayout.CENTER);
		canvas_1.setBackground(Color.ORANGE);
		canvas_1.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 250));
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 461, 143, 36);
		frm_drawing.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frm_drawing.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
	}
	public canvasArea getCanvas() {
		return canvas_1;
	}
}
