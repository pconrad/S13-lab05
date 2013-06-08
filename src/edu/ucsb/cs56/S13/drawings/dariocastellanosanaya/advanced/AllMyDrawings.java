package edu.ucsb.cs56.S13.drawings.dariocastellanosanaya.advanced;

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
import java.awt.Font;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Dario Castellanos Anaya
 * @version for CS56, lab06, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw Blinky, Pinky, Inky and Clyde 
     */

    public static void drawPicture1(Graphics2D g2) {

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);   
	g2.setStroke(thick);
	int fontSize= 20;
	Font original = g2.getFont();
	g2.setFont(new Font("TimesRoman", Font.BOLD, fontSize));

	// Blinky 

	Ghost blinky = new Ghost(100,50,80,80);
	g2.setColor(Color.RED); g2.draw(blinky);
	g2.drawString("\"BLINKY\"", 250,100);

	// Pinky, moved 100 pixels down

	Shape pinky = ShapeTransforms.translatedCopyOf(blinky,0,100);
	g2.setColor(Color.PINK); g2.draw(pinky);
	g2.drawString("\"PINKY\"", 250,200);
	
	// Inky, moved 100 more pixels down
	Shape inky = ShapeTransforms.translatedCopyOf(pinky,0,100);
	g2.setColor(Color.CYAN); g2.draw(inky);
	g2.drawString("\"INKY\"", 250,300);
	
	// Clyde, moved another 100 pixels down
	Shape clyde = ShapeTransforms.translatedCopyOf(inky,0,100);
	g2.setColor(Color.ORANGE); g2.draw(clyde);
	g2.drawString("\"CLYDE\"", 250,400);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setFont(original);
	g2.setColor(Color.BLACK); 
	g2.drawString("Blinky, Pinky, Inky and Clyde by Dario Castellanos", 20,20);
    }


    /** Draw a picture with a few ghosts
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some ghosts.
	
	Ghost large = new Ghost(100,50,225,150);
	Ghost smallGh = new Ghost(20,50,40,30);
	Ghost  tallSkinny = new Ghost(20,150,20,40);
	Ghost shortFat = new Ghost(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallGh);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Ghost gh1 = new Ghost(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(gh1);
	
	// Make a black ghost that's half the size, 
	// and moved over 150 pixels in x direction
	Shape gh2 = ShapeTransforms.scaledCopyOfLL(gh1,0.5,0.5);
	gh2 = ShapeTransforms.translatedCopyOf(gh2,150,0);
	g2.setColor(Color.BLACK); g2.draw(gh2);
	
	// Here's a Ghost that's 4x as big (2x the original)
	// and moved over 150 more pixels to the right.
	gh2 = ShapeTransforms.scaledCopyOfLL(gh2,4,4);
	gh2 = ShapeTransforms.translatedCopyOf(gh2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(gh2); 
	
	// Draw two scared ghosts
	
	ScaredGhost sg1 = new ScaredGhost(50,350,40,75);
	ScaredGhost sg2 = new ScaredGhost(200,350,200,100);
	
	g2.draw(sg1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second ghost 45 degrees around its center.
	Shape sg3 = ShapeTransforms.rotatedCopyOf(sg2, Math.PI/4.0);

	g2.draw(sg3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of regular and scared Ghosts by Dario Castellanos", 20,20);
    }
  
    /** Draw a picture of the four ghosts being scared
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("\"Oh no! They got Clyde!\" by Dario Castellanos", 20,20);
	
	// change stroke and font

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);   
	g2.setStroke(thick);
	int fontSize= 60;
	g2.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

	// draw the three ghosts

	g2.setColor(Color.BLUE);

	ScaredGhost sg1 = new ScaredGhost(220,200,100,100);
	g2.draw(sg1);

	Shape sg2  = ShapeTransforms.translatedCopyOf(sg1,120,0);
	g2.draw(sg2);

	sg2  = ShapeTransforms.translatedCopyOf(sg2,120,0);
	g2.draw(sg2);

	// draw Clyde
	g2.setColor(Color.CYAN);
        g2.drawString("200", 90, 270);
       
    }
    

}
