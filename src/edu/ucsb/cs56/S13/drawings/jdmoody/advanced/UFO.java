package edu.ucsb.cs56.S13.drawings.jdmoody.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A UFO (wrapper around a General Path, implements Shape)

   @author Phill Conrad 
   @author Jonathan Moody
   @version for CS56, W11, UCSB, 02/23/2011
   
*/
public class UFO extends GeneralPathWrapper implements Shape
{

    
    /**
     * Constructor for objects of class UFO
     */
    public UFO(double x, double y, double width, double height)
    {
    
        // Specify the left tip of the UFO, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* UFO
        
        final double ORIG_LX = 200.0; 
        final double ORIG_LY = 200.0; 
		final double ORIG_WIDTH = 800.0; 
        final double ORIG_HEIGHT = 200.0; 
        
        GeneralPath upperLeftSide = new GeneralPath();
      
        // upper left quarter of UFO
       
        upperLeftSide.moveTo(800,100);
		upperLeftSide.lineTo(760,105);
		upperLeftSide.lineTo(720,115);
        upperLeftSide.lineTo(660,135);
		upperLeftSide.lineTo(630,160);
		upperLeftSide.lineTo(440,165);
		upperLeftSide.lineTo(400,170);
		upperLeftSide.lineTo(360,175);
		upperLeftSide.lineTo(320,180);
		upperLeftSide.lineTo(280,185);
		upperLeftSide.lineTo(240,195);
        upperLeftSide.lineTo(200,200);
		
 
        Shape upperRightSide = ShapeTransforms.horizontallyFlippedCopyOf(upperLeftSide);
		
		// after flipping around the upper left hand side of the
        // UFO, we move this over to the right by 1200 pixels
       
        upperRightSide = ShapeTransforms.translatedCopyOf(upperRightSide, 1200.0, 0.0);
		
		Shape lowerLeftSide = ShapeTransforms.verticallyFlippedCopyOf(upperLeftSide);
		
		// we do the same thing for the lower left hand side
		// and lower right hand side
		
		lowerLeftSide = ShapeTransforms.translatedCopyOf(lowerLeftSide, 0.0, 200.0);
		
		Shape lowerRightSide = ShapeTransforms.horizontallyFlippedCopyOf(lowerLeftSide);
		lowerRightSide = ShapeTransforms.translatedCopyOf(lowerRightSide, 1200.0, 0.0);
       
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholeUFO = new GeneralPath ();
        //wholeUFO.append(topAndBottom, false);
        wholeUFO.append(upperLeftSide, false);
        wholeUFO.append(upperRightSide, false);
		wholeUFO.append(lowerLeftSide, false);
		wholeUFO.append(lowerRightSide, false);

        // translate to the origin by subtracting the original left tip x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(wholeUFO, -ORIG_LX + x, -ORIG_LY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable UFO
        
	this.set(new GeneralPath(s));
        
    }

}