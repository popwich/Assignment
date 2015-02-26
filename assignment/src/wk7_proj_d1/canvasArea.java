
package wk7_proj_d1;


import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JRadioButton;




import java.awt.Button;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;


public class canvasArea extends JPanel {
	private List<PolyLine> lines = new ArrayList<PolyLine>();
	private PolyLine currentLine; 
	
	//default constructor - draw polyline
	public canvasArea() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				currentLine.addPoint(e.getX(),  e.getY());
				repaint();
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			currentLine = new PolyLine();
			lines.add(currentLine);
			currentLine.addPoint(e.getX(), e.getY());
			}
		});
	}
			
	//constructor depends on what shapeSelected string is passed in from GUI
	public canvasArea(String shapeSelected) {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				currentLine.addPoint(e.getX(),  e.getY());
				repaint();
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			currentLine = new PolyLine();
			lines.add(currentLine);
			currentLine.addPoint(e.getX(), e.getY());
			}
		});
	}
	
	//swing component override paintComponenet method to provide custom behavior, callback by repaint()
	@Override 
   protected void paintComponent(Graphics g) { 
      super.paintComponent(g); //invocation of super.paintComponent(g) passes the graphics context off to the component's UI delegate
      g.setColor(Color.RED);
      //g.drawRect(12, 15, 200, 100); //draw rectangle
      for (PolyLine line: lines) {
         line.draw(g);
       }     
   }

	public void drawLine() {
		// TODO Auto-generated method stub
		
	}

	public void drawOval() {
		// TODO Auto-generated method stub
		
	}
}
