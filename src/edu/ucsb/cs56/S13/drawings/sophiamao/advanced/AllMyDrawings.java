package edu.ucsb.cs56.S13.drawings.sophiamao.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Sophia Mao
 * @version for CS56, lab05, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a measures
     */

    public static void drawPicture1(Graphics2D g2) {

        EmptyMeasure measure1 = new EmptyMeasure(100,250,100,75);
	g2.setColor(Color.CYAN); g2.draw(measure1);
	
	// Make a red measure that's half the size, 
	// and moved over 150 pixels in x direction

	Shape measure2 = ShapeTransforms.scaledCopyOfLL(measure1,0.5,0.5);
	measure2 = ShapeTransforms.translatedCopyOf(measure2,150,0);
	g2.setColor(Color.RED ); g2.draw(measure2);
	
	// Here's a measure that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	measure2 = ShapeTransforms.scaledCopyOfLL(measure2,4,4);
	measure2 = ShapeTransforms.translatedCopyOf(measure2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x93c572)); 
	g2.draw(measure2); 
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("three empty music measures by Sophia Mao", 20,20);
    }



    public static void drawPicture2(Graphics2D g2) {

	EmptyMeasure measure1 = new EmptyMeasure(100,250,100,75);
	g2.setColor(Color.CYAN); g2.draw(measure1);
	
	// Make a black measure that's half the size, 
	// and moved over 50 pixels in x direction
	Shape measure2 = ShapeTransforms.scaledCopyOfLL(measure1,0.5,0.5);
	measure2 = ShapeTransforms.translatedCopyOf(measure2,50,0);
	g2.setColor(Color.BLACK); g2.draw(measure2);
	
	// Here's a measure that's 3x as big
	// and moved over 300 more pixels to right.
	measure2 = ShapeTransforms.scaledCopyOfLL(measure2,3,3);
	measure2 = ShapeTransforms.translatedCopyOf(measure2,300,0);
	
	// measure with a thicker line
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x1eb486)); 
	g2.draw(measure2); 
	
	// Draw two Measures with notes
	
	        MeasureWithNotes note1 = new MeasureWithNotes(50,350,150,75);
		MeasureWithNotes note2 = new MeasureWithNotes(200,350,150,100);
	
		g2.draw(note1);
		g2.setColor(new Color(0xfe6f5e)); 

	// Rotate the second measure 30 degrees
		Shape note3 = ShapeTransforms.rotatedCopyOf(note2, Math.PI/6.0);

		g2.draw(note3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Sheet music empty measures and with notes by Sophia Mao", 20,20);
    }
  
    

}
