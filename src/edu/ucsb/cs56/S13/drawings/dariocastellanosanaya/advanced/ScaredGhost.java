package edu.ucsb.cs56.S13.drawings.dariocastellanosanaya.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A scared version of the ghosts from the Pacman arcade game (wrapper around a General Path, extends Ghost and implements Shape)

   @author Dario Castellanos Anaya 
   @version for CS56, S13, UCSB, 05/22/2013
   
*/
public class ScaredGhost extends Ghost implements Shape
{

    
    /**
     * Constructor for objects of class ScaredGhost
     * @param x the x coordinate of the top left corner of the ghost
     * @param y the y coordinate of the top left corner of the ghost
     * @param width the width of the ghost
     * @param height the height of the ghost    
     */
    public ScaredGhost(double x, double y, double width, double height)
    {
    
	// construct the basic ghost
	super(x, y, width, height);

        final double ORIG_SIDE = 700.0; 

	// get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

	double eyeDiam = width / 7;
	double lEyeTopLeftX = x + width * 2/7;
	double rEyeTopLeftX = x + width * 4/7;
	double EyeTopLeftY = y + height * 5/14;


	// make the ghost's eyes

	Ellipse2D.Double leftEye =
	    new Ellipse2D.Double(lEyeTopLeftX, EyeTopLeftY, eyeDiam, eyeDiam);
	Ellipse2D.Double rightEye =
	    new Ellipse2D.Double(rEyeTopLeftX, EyeTopLeftY, eyeDiam, eyeDiam);

	// make the ghost's mouth

	GeneralPath mouth = new GeneralPath();

	mouth.moveTo(x + width *  50/ORIG_SIDE, y + height * 525/ORIG_SIDE);
	mouth.lineTo(x + width * 150/ORIG_SIDE, y + height * 475/ORIG_SIDE);
	mouth.lineTo(x + width * 250/ORIG_SIDE, y + height * 525/ORIG_SIDE);
	mouth.lineTo(x + width * 350/ORIG_SIDE, y + height * 475/ORIG_SIDE);
	mouth.lineTo(x + width * 450/ORIG_SIDE, y + height * 525/ORIG_SIDE);
	mouth.lineTo(x + width * 550/ORIG_SIDE, y + height * 475/ORIG_SIDE);
	mouth.lineTo(x + width * 650/ORIG_SIDE, y + height * 525/ORIG_SIDE);

        // add the features to the ghost
       
        GeneralPath wholeGhost = this.get();
        wholeGhost.append(leftEye, false);
        wholeGhost.append(rightEye, false);
        wholeGhost.append(mouth, false); 
    }

}
