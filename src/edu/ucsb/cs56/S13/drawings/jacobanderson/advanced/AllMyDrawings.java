package edu.ucsb.cs56.S13.drawings.jacobanderson.advanced;

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
 * @author Jacob Anderson 
 * @version for CS56, lab05, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few trees   */

    public static void drawPicture1(Graphics2D g2) {

	ChristmasTree ct1 = new ChristmasTree(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(ct1);
	
	// Make a black tree that's half the size, 
	// and moved over 150 pixels in x direction

	Shape ct2 = ShapeTransforms.scaledCopyOfLL(ct1,0.5,0.5);
	ct2 = ShapeTransforms.translatedCopyOf(ct2,150,0);
	g2.setColor(Color.BLACK); g2.draw(ct2);
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	ct2 = ShapeTransforms.scaledCopyOfLL(ct2,4,4);
	ct2 = ShapeTransforms.translatedCopyOf(ct2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(ct2); 
	
	// Draw two christmas trees with ornaments
	
	ChristmasTreeWithOrnaments cto1 = new ChristmasTreeWithOrnaments(50,350,40,75);
	ChristmasTreeWithOrnaments cto2 = new ChristmasTreeWithOrnaments(200,350,200,100);
	
	g2.draw(cto1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(cto2);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few houses by Jacob Anderson", 20,20);
    }


    /** Draw a picture with a trees
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some christmas trees with ornaments
	
	ChristmasTreeWithOrnaments large = new ChristmasTreeWithOrnaments(100,50,225,150);
	ChristmasTreeWithOrnaments smallCTO = new ChristmasTreeWithOrnaments(20,50,40,30);
	ChristmasTreeWithOrnaments tallSkinny = new ChristmasTreeWithOrnaments(20,150,20,40);
	ChristmasTreeWithOrnaments shortFat = new ChristmasTreeWithOrnaments(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCTO);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	ChristmasTree ct1 = new ChristmasTree(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(ct1);
	
	// Make a black tree that's half the size, 
	// and moved over 150 pixels in x direction
	Shape ct2 = ShapeTransforms.scaledCopyOfLL(ct1,0.5,0.5);
	ct2 = ShapeTransforms.translatedCopyOf(ct2,150,0);
	g2.setColor(Color.BLACK); g2.draw(ct2);
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	ct2 = ShapeTransforms.scaledCopyOfLL(ct2,4,4);
	ct2 = ShapeTransforms.translatedCopyOf(ct2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(ct2); 
	
	// Draw two christmas trees with ornaments
	
	ChristmasTreeWithOrnaments cto1 = new ChristmasTreeWithOrnaments(50,350,40,75);
	ChristmasTreeWithOrnaments cto2 = new ChristmasTreeWithOrnaments(200,350,200,100);
	
	g2.draw(cto1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second tree 45 degrees around its center.
	Shape cto3 = ShapeTransforms.rotatedCopyOf(cto2, Math.PI/4.0);

	g2.draw(cto3);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of ChristmasTrees by Jacob Anderson", 20,20);
    }
  
    /** Draw a different picture with a christmas trees with ornaments
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Christmas trees with ornaments by Jacob Anderson", 20,20);

	
	// Draw some trees
	
       ChristmasTree large = new ChristmasTree(100,50,225,150);
       ChristmasTreeWithOrnaments smallCTO = new ChristmasTreeWithOrnaments(20,50,40,30);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(smallCTO);
       
    }
    

}
