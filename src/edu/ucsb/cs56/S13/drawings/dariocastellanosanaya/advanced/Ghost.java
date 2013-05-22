package edu.ucsb.cs56.S13.drawings.dariocastellanosanaya.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A Ghost from the Pacman arcade game (wrapper around a General Path, implements Shape)

   @author Dario Castellanos Anaya 
   @version for CS56, S13, UCSB, 05/22/2013
   
*/
public class Ghost extends GeneralPathWrapper implements Shape
{

    
    /**
     * Constructor for objects of class Ghost
     */
    public Ghost(double x, double y, double width, double height)
    {
    
        // Specify the upper left corner, and the 
        //  side length of the original points used to 
        //  plot the *hard-coded* ghost
        
        final double ORIG_ULX = 0.0; 
        final double ORIG_ULY = 0.0; 
        final double ORIG_SIDE = 700.0; 
                
        GeneralPath leftSide = new GeneralPath();
      
        // left side of ghost
       
        leftSide.moveTo(0, 700);
        leftSide.lineTo(0, 300);
        leftSide.lineTo(250, 0);
	leftSide.lineTo(350, 0);

        GeneralPath bottomSide = new GeneralPath();
        
	// bottom side of ghost

        bottomSide.moveTo(0, 700);
        bottomSide.lineTo(125, 600);
	bottomSide.lineTo(250, 700);
	bottomSide.lineTo(300, 700);
	bottomSide.lineTo(300, 600);
	bottomSide.lineTo(400, 600);
	bottomSide.lineTo(400, 700);
	bottomSide.lineTo(450, 700);
	bottomSide.lineTo(575, 600);
       	bottomSide.lineTo(700, 700);

        Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
       
        // after flipping around the upper left hand corner of the
        // bounding box, we move this over to the right by 400 pixels
       
        rightSide = ShapeTransforms.translatedCopyOf(rightSide, 700.0, 0.0);
       
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholeGhost = new GeneralPath ();
        wholeGhost.append(bottomSide, false);
        wholeGhost.append(leftSide, false);
        wholeGhost.append(rightSide, false);

        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(wholeGhost, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_SIDE,
					  height/ORIG_SIDE) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
        
    }

}
