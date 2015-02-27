
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
	private RectShape currentRect;
	private OvalShape currentOval;
	int startX, startY, endX, endY,	width, height;
	String flag;
	
	//default constructor - draw rectangle
	public canvasArea() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				currentRect.width = Math.abs(e.getX() - currentRect.left);
				currentRect.height = Math.abs(e.getY() - currentRect.top);
				repaint();
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				flag = "rect";
				currentRect = new RectShape();
				currentRect.left = e.getX();
				currentRect.top = e.getY();		
			}
		});
	}
			
	//constructor depends on what shapeSelected string is passed in from GUI
	public void canvasArea_method(String shapeSelected) {
		switch (shapeSelected) {
			case  "line":
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
					flag = "line";
					currentLine = new PolyLine();
					lines.add(currentLine);
					currentLine.addPoint(e.getX(), e.getY());
					}
				});
				break;
	
			case "rect": 
				addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseDragged(MouseEvent e) {	
						currentRect.width = Math.abs(e.getX() - currentRect.left);
						currentRect.height = Math.abs(e.getY() - currentRect.top);
						repaint();
					}
				});
				
				addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
					flag = "rect";
					currentRect = new RectShape();
					currentRect.left = e.getX();
					currentRect.top = e.getY();
					}
				});
				break;
				
			case "oval": 
				addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseDragged(MouseEvent e) {
						currentOval.width = Math.abs(e.getX() - currentOval.left);
						currentOval.height = Math.abs(e.getY() - currentOval.top);
						repaint();
					}
				});
				
				addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
					flag = "oval";
					currentOval = new OvalShape();
					currentOval.left = e.getX();
					currentOval.top = e.getY();
					}
				});
				break;
		}
	}
	
	//swing component override paintComponenet method to provide custom behavior, callback by repaint()
	@Override 
   protected void paintComponent(Graphics g) { 
      super.paintComponent(g); //invocation of super.paintComponent(g) passes the graphics context off to the component's UI delegate
      g.setColor(Color.RED);
      
      switch (flag) {
	      case "rect":
	    	  currentRect.draw(g);      
	    	  break;
	      case "oval":
	    	  currentOval.draw(g);      
	    	  break;
	      case "line":
	    	   for (PolyLine line: lines) {
	    		   line.draw(g);
	    	   }
	    	   break;   
      }
   }

	public void drawLine() {
		// TODO Auto-generated method stub
		canvasArea_method("line");
	}

	public void drawRect() {
		// TODO Auto-generated method stub
		canvasArea_method("rect");
	}
	
	public void drawOval() {
		// TODO Auto-generated method stub
		canvasArea_method("oval");
	}
}
