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
     */
    public ScaredGhost(double x, double y, double width, double height)
    {
    
	// construct the basic ghost
	super(x, y, width, height);

	// get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

	// make the ghost's eyes

	// make the ghost's mouth

        // add the features to the ghost
       
        GeneralPath wholeGhost = this.get();
	//        wholeGhost.append(leftEye, false);
        //wholeGhost.append(rightEye, false);
        //wholeGhost.append(mouth, false); 
    }

}
