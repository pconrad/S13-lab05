package edu.ucsb.cs56.S13.drawings.roeland.advanced;

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
    /** Draw a picture with a few candles 
     */

    public static void drawPicture1(Graphics2D g2) {

	
	Candle candle1 = new Candle(100,100,30,50);
	g2.setColor(Color.BLUE);
	g2.draw(candle1);
	
	// Make a green candle that's half the size, 
	// and moved over 130 pixels in x direction

	Shape candle2  = ShapeTransforms.scaledCopyOfLL(candle1,0.5,0.5);
	candle2 = ShapeTransforms.translatedCopyOf(candle2,130,0);
	g2.setColor(Color.GREEN);
	g2.draw(candle2);
	
	// Here's a candle that's 8x as big (4x the original)
	// and moved over 250 more pixels to right.
	candle2 = ShapeTransforms.scaledCopyOfLL(candle2,8,8);
	candle2 = ShapeTransforms.translatedCopyOf(candle2,250,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
		
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(100,1,1)); 
	g2.draw(candle2); 
	
	// Draw two candles with holders
	
	CandleWithHolder ch1 = new CandleWithHolder(50,400,80,80);
	CandleWithHolder ch2 = new CandleWithHolder(150,400, 50, 50);

	
	g2.draw(ch1);
	g2.setColor(new Color(200,100,50)); g2.draw(ch2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few candles by Roeland Singer-Heinze", 20,20);
    }


    /** Draw a picture with a few candles
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some candles.
	
	Candle large = new Candle(100,50,225,150);
	Candle smallCC = new Candle(20,50,40,30);
	Candle tallSkinny = new Candle(20,150,20,40);
	Candle shortFat = new Candle(20,250,40,20);
	
	g2.setColor(Color.BLUE);     g2.draw(large);
	g2.setColor(Color.CYAN);   g2.draw(smallCC);
	g2.setColor(Color.RED);    g2.draw(tallSkinny);
	g2.setColor(Color.GREEN); g2.draw(shortFat);
	
	Candle c1 = new Candle(100,250,50,75);
	g2.setColor(Color.RED); g2.draw(c1);
	
	// Make a pink candle that's half the size, 
	// and moved over 200 pixels in x direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.PINK); g2.draw(c2);
	
	// Here's a candle that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c2); 
	
	// Draw two Candles with holders
	
	CandleWithHolder ch1 = new CandleWithHolder(50,350,40,75);
	CandleWithHolder ch2 = new CandleWithHolder(200,350,200,100);
	
	g2.draw(ch1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second candle 90 degrees around its center.
	Shape ch3 = ShapeTransforms.rotatedCopyOf(ch2, Math.PI/2.0);

	g2.draw(ch3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Candles by Roeland Singer-Heinze", 20,20);
    }
  
    /** Draw a different picture with a few candles
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Candles by Roeland Singer-Heinze", 20,20);

	
	// Draw some candles
	
       Candle large = new Candle(100,50,225,150);
       Candle smallCC = new Candle(20,50,40,30);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(smallCC);

       //Draw some candles with holders

       CandleWithHolder ch1 = new CandleWithHolder(100, 300, 50, 50);
       CandleWithHolder ch2 = new CandleWithHolder(200,300, 200, 200);

       g2.setColor(Color.PINK); g2.draw(ch1);
       g2.setColor(Color.RED); g2.draw(ch2);
       
       
    }
    

}
