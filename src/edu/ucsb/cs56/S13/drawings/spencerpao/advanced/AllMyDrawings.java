package edu.ucsb.cs56.S13.drawings.spencerpao.advanced;

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
 * @author Spencer Pao 
 * @version for cs56, spring 2013
 */


public class AllMyDrawings
{
    // Draw a picture with a two lightsabers (one red, one green)

    public static void drawPicture1(Graphics2D g2) {

	LS red      = new LS(250,250,50,75);
	g2.setColor(Color.RED); 
	g2.draw(red);
	
	LS green    = new LS(400,250,50,75);
	g2.setColor(Color.GREEN); 
	g2.draw(green);

	g2.setColor(Color.BLACK); 
	g2.drawString("One green and one red lightsaber, unactivated - by Spencer Pao", 20,20);
	    
}


    // Draw a picture with crossed lightsabers
     
    public static void drawPicture2(Graphics2D g2) {
	
	
	LSWithBlade LS1        = new LSWithBlade(250,50,40,75); 
	LSWithBlade LS2        = new LSWithBlade(300,50,40,75);

	g2.setColor(Color.RED); 
	Shape       LS1Rotated = ShapeTransforms.rotatedCopyOf(LS1,-3*Math.PI/4.0);
	g2.draw(LS1Rotated);
	
	g2.setColor(Color.GREEN); 
	Shape       LS2Rotated = ShapeTransforms.rotatedCopyOf(LS2, 3*Math.PI/4.0);
	g2.draw(LS2Rotated);

	g2.setColor(Color.BLACK); 
	g2.drawString("The same light sabers activated and locked in combat - by Spencer Pao", 20,20);

	



    }
  
    //Draw a picture with growing lightsabers

    public static void drawPicture3(Graphics2D g2) {
	
		
	LSWithBlade LS1        = new LSWithBlade(250,50,40,75); 
	LSWithBlade LS2        = new LSWithBlade(300,50,50,94);
	LSWithBlade LS3        = new LSWithBlade(350,50,60,112);
	
	g2.setColor(Color.GREEN); 
	
       	Shape       LS1Rotated = ShapeTransforms.rotatedCopyOf(LS1,-4*Math.PI/4.0 );
	g2.draw(LS1Rotated);
	
	g2.setColor(Color.BLACK); 
	Stroke      thick      = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);    
	g2.setStroke(thick);
	Shape       LS2Rotated = ShapeTransforms.rotatedCopyOf(LS2, 4*Math.PI/4.0 +.25);
	g2.draw(LS2Rotated);


	g2.setColor(Color.RED); 
	Stroke      thick2     = new BasicStroke (8.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);    
	g2.setStroke(thick2);
	Shape       LS3Rotated = ShapeTransforms.rotatedCopyOf(LS3, 4*Math.PI/4.0 +.50);
	g2.draw(LS3Rotated);


	g2.setColor(Color.BLACK); 
	g2.drawString("Arrangement of bigger lightsabers - by Spencer Pao", 20,20);
    

    
    }
    

}
