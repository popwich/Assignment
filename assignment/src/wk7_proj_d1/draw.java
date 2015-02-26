package wk7_proj_d1;

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
import javax.swing.LayoutStyle.ComponentPlacement;


public class draw {

	private JFrame frm_drawing;  
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
		frm_drawing.setTitle("Paint");
		frm_drawing.setBounds(100, 100, 702, 535);
		frm_drawing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JLabel statusbar= new JLabel("default");

		    
		Button lineButton = new Button("Line");
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas_1.drawLine(); //call drawLine method in canvasArea class to draw line instead of default polyline		
			}
		});
		
		Button ovalButton = new Button("Oval");
		ovalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas_1.drawOval(); //call drawOval method in canvasArea class to draw line instead of default polyline		
			}
		});
		
		Button setColourRed_Button = new Button("RED");
		setColourRed_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setColourRed_Button.setBackground(Color.RED);
		setColourRed_Button.setForeground(Color.BLACK);
		
		Button setColourYellow_Button = new Button("Yellow");
		setColourYellow_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setColourYellow_Button.setBackground(Color.YELLOW);
		
		//create canvasArea instance canvas_1
		canvas_1 = new canvasArea();
		canvas_1.setForeground(Color.WHITE);
		canvas_1.setBackground(Color.WHITE);
		GroupLayout gl_canvas_1 = new GroupLayout(canvas_1);
		gl_canvas_1.setHorizontalGroup(
			gl_canvas_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 318, Short.MAX_VALUE)
		);
		gl_canvas_1.setVerticalGroup(
			gl_canvas_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 245, Short.MAX_VALUE)
		);
		canvas_1.setLayout(gl_canvas_1);
		GroupLayout groupLayout = new GroupLayout(frm_drawing.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(statusbar, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lineButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(ovalButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(214)
							.addComponent(setColourRed_Button, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(setColourYellow_Button, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(canvas_1, GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(statusbar, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lineButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(ovalButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(setColourRed_Button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(setColourYellow_Button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(canvas_1, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
		);
		frm_drawing.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frm_drawing.setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JMenuItem mntmNew = new JMenuItem("New");
		fileMenu.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		fileMenu.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		fileMenu.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save as ...");
		fileMenu.add(mntmSaveAs);
		
		JMenuItem mntmPrint = new JMenuItem("Print");
		fileMenu.add(mntmPrint);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		fileMenu.add(exitMenuItem);
		
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cut");
		editMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		editMenu.add(mntmPaste);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		editMenu.add(mntmDelete);
		
		JMenuItem mntmSelectAll = new JMenuItem("Select all");
		editMenu.add(mntmSelectAll);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mnHelp.add(mntmWelcome);
		
		JMenuItem mntmHelpContent = new JMenuItem("Help content");
		mnHelp.add(mntmHelpContent);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About Paint");
		mnHelp.add(mntmNewMenuItem);
		
	}
	public canvasArea getCanvas() {
		return canvas_1;
	}
}
