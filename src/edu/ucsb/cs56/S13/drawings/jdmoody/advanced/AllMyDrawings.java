package edu.ucsb.cs56.S13.drawings.jdmoody.advanced;

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
 * @version for CS10, lab06, Spring 2009
 */


public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */

    public static void drawPicture1(Graphics2D g2) {
	
	Stroke orig=g2.getStroke();	
	UFOWithTractorBeam hugeBeam = new UFOWithTractorBeam(100, 250, 400, 100);
	g2.setColor(Color.RED); g2.draw(hugeBeam);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	House h1 = new House(370,300,50,75);
	g2.setStroke(thick);
	g2.setColor(Color.BLUE); g2.draw(h1);
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A UFO beaming a house by Jonathan Moody", 20,20);
    }


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {

	UFO tiny = new UFO(200, 400, 20, 5);
	UFOWithTractorBeam mediumBeam = new UFOWithTractorBeam(5,200,300,75);
	UFOWithTractorBeam smallBeam = new UFOWithTractorBeam(350,200,200,50);
	
	House h1 = new House(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	g2.setColor(Color.RED); g2.draw(mediumBeam);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	Shape noBeam = ShapeTransforms.scaledCopyOfLL(tiny,5,5);
	noBeam = ShapeTransforms.translatedCopyOf(noBeam,100,100);
	g2.draw(noBeam);

	// Rotate the second house 45 degrees around its center.
	Shape tinyRotated = ShapeTransforms.rotatedCopyOf(tiny, Math.PI/4.0);
	Shape smallBeamRotated = ShapeTransforms.rotatedCopyOf(smallBeam, Math.PI/3.0);
	
	g2.draw(tinyRotated);
	g2.setColor(Color.BLUE);
	g2.draw(smallBeamRotated);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of UFOs and houses by Jonathan Moody", 20,20);
    }
  
    /** Draw a different picture with a few UFOs.
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of UFO's by Jonathan Moody", 20,20);

	
	// Draw some UFOs.
	
       UFOWithTractorBeam largeUFO = new UFOWithTractorBeam(10,200,400,100);
       UFO smallUFO = new UFO(200,105,200,50);
	   UFO mediumUFO = new UFO(250,300,300,75);
	   
	   UFOWithTractorBeam mediumBeam = new UFOWithTractorBeam(5,375,300,75);
	   UFOWithTractorBeam smallBeam = new UFOWithTractorBeam(300,425,200,50);
       
       g2.setColor(Color.RED);     g2.draw(largeUFO);
       g2.setColor(Color.BLUE);   g2.draw(smallUFO);
	   g2.setColor(Color.BLUE); g2.draw(smallBeam);
	   g2.setColor(Color.BLACK); g2.draw(mediumUFO);
       g2.setColor(Color.BLACK); g2.draw(mediumBeam);
       
    }
    

}
