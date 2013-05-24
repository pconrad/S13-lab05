package edu.ucsb.cs56.S13.drawings.gordoncheung.advanced;

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
 * @author Phill Conrad + Gordon Cheung
 * @version for CS56, lab05, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few poles and stopsigns
     */

    public static void drawPicture1(Graphics2D g2) {

	Pole pole = new Pole(100,100,20,100);
	g2.setColor(Color.CYAN); 
	g2.draw(pole);
	
	// Make a pole that's half the size, 
	// and moved over 150 pixels in x direction

	Shape pole2 = ShapeTransforms.scaledCopyOfLL(pole,0.5,0.5);
	pole2 = ShapeTransforms.translatedCopyOf(pole2,150,0);
	g2.setColor(Color.BLACK); 
	g2.draw(pole2);
	
	// Here's a pole that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	pole2 = ShapeTransforms.scaledCopyOfLL(pole2,4,4);
	pole2 = ShapeTransforms.translatedCopyOf(pole2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(pole2); 
	
     
	// Draw two stopsigns
	Stopsign ss1 = new Stopsign(50,350,20,100);
	Stopsign ss2 = new Stopsign(200, 350, 40, 60);
	
	g2.draw(ss1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ss2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few poles and stopsigns from Gordon Cheung", 20,20);
    }


    /** Draw a picture with a poles and stopsigns
     */
    public static void drawPicture2(Graphics2D g2) {
	
	Pole pole1 = new Pole(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(pole1);
	
	// Make a black pole that's half the size, 
	// and moved over 150 pixels in x direction
	Shape pole2 = ShapeTransforms.scaledCopyOfLL(pole1,0.5,0.5);
	pole2 = ShapeTransforms.translatedCopyOf(pole2,150,0);
	g2.setColor(Color.BLACK); g2.draw(pole2);
	
	// Here's a pole that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	pole2 = ShapeTransforms.scaledCopyOfLL(pole2,4,4);
	pole2 = ShapeTransforms.translatedCopyOf(pole2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(pole2); 
	
	// Draw two poles with hexagons(stopsign?)
	
	Stopsign ss1 = new Stopsign(50,350,60,140);
	Stopsign ss2 = new Stopsign(300,350,20,200);
	
	g2.draw(ss1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second house 45 degrees around its center.
	Shape ss3 = ShapeTransforms.rotatedCopyOf(ss2, Math.PI/4.0);

	g2.draw(ss3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some poles and stopsigns by Gordon Cheung", 20,20);
    }
  
    /** Draw a different picture with some stopsigns
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Some stopsigns by Gordon Cheung", 20,20);

	
	// Draw some stopsigns.
	
       Stopsign ss1 = new Stopsign(100,50,20,200);
       Stopsign ss2 = new Stopsign(200,80,90,60);
       
       g2.setColor(Color.RED);     g2.draw(ss1);
       g2.setColor(Color.GREEN);   g2.draw(ss2);
       
       
    }
    

}
