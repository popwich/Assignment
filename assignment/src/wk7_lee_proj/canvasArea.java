package wk7_lee_proj;
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

public class canvasArea extends JPanel {
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
			
	private List<PolyLine> lines = new ArrayList<PolyLine>();
	private PolyLine currentLine; 
	
   @Override
   protected void paintComponent(Graphics g) { // called back via repaint()
      super.paintComponent(g);
      g.setColor(Color.RED);
      for (PolyLine line: lines) {
         line.draw(g);
      }
   }
}
