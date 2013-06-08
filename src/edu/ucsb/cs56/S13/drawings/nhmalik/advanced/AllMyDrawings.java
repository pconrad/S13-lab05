package edu.ucsb.cs56.S13.drawings.nhmalik.advanced;

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
 * @author Noah Malik
 * @version for CS56, lab05, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */

    public static void drawPicture1(Graphics2D g2) {

	Speaker s1 = new Speaker(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black speaker that's half the size, 
	// and moved over 150 pixels in x direction

	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a speaker that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two Boomboxes
	
	Boombox bb1 = new Boombox(50,350,40,75);
	Boombox bb2 = new Boombox(200,350,200,100);
	
	g2.draw(bb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bb2);
	
	// Sign and label
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Speakers and Boomboxes by Noah Malik", 20,20);
    }//end drawPicture1


    /** Draw a picture with a speakers and boomboxes
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some speakers.
	
	Speaker large = new Speaker(100,50,225,150);
	Speaker smallSp = new Speaker(20,50,40,30);
	Speaker tallSkinny = new Speaker(20,150,20,40);
	Speaker shortFat = new Speaker(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallSp);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	// Draw boombox
	Boombox bb1 = new Boombox(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(bb1);
	
	// Make a black boombox that's half the size, 
	// and moved over 150 pixels in x direction
	Shape bb2 = ShapeTransforms.scaledCopyOfLL(bb1,0.5,0.5);
	bb2 = ShapeTransforms.translatedCopyOf(bb2,150,0);
	g2.setColor(Color.BLACK); g2.draw(bb2);
	
	// Here's a boombox that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	bb2 = ShapeTransforms.scaledCopyOfLL(bb2,4,4);
	bb2 = ShapeTransforms.translatedCopyOf(bb2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(bb2); 
	
	// Draw rotated speaker and boombox
	// Rotate the second house 45 degrees around its center.
	Shape rotatedS = ShapeTransforms.rotatedCopyOf(shortFat, Math.PI/4.0);
	Shape rotatedBB = ShapeTransforms.rotatedCopyOf(bb2, Math.PI/4.0);

	g2.setColor(new Color(0x005151));
	g2.draw(rotatedS);
	g2.draw(rotatedBB);
	
	// Sign and label the drawing
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of speakers and boomboxes by Noah Malik", 20,20);
    }// end drawPicture2
  
    /** Draw a different picture with a few houses and coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Everybody started having sex.", 20,20);
	g2.drawString("The music was way too powerful", 20,40);
	g2.drawString("- The Lonely Island (feat. Julian Casablancas)", 35,60);

	
	// DRAW ALL THE BOOMBOXES
	
       Boombox bb1 = new Boombox(100,75,225,150);
       Boombox bb2 = new Boombox(20,100,40,30);
       Boombox bb3 = new Boombox(200,300,400,250);
       Boombox bb4 = new Boombox(600,5,40,10);
       Boombox bb5 = new Boombox(300,200,40,200);
       Boombox bb6 = new Boombox(400,500,100,50);
       Boombox bb7 = new Boombox(75,290,500,100);
       Boombox bb8 = new Boombox(400,100,300,150);
       
       g2.setColor(Color.RED);             g2.draw(bb1);
       g2.setColor(Color.GREEN); 		   g2.draw(bb2);
       g2.setColor(Color.BLUE);    		   g2.draw(bb3);
       g2.setColor(Color.MAGENTA); 		   g2.draw(bb4);
       g2.setColor(Color.PINK);  		   g2.draw(bb5);
       g2.setColor(Color.GRAY);            g2.draw(bb6);
       g2.setColor(new Color(0xCC6600));   g2.draw(bb7);
       g2.setColor(new Color(0x006633));   g2.draw(bb8);
       
       
    }
    

}
