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
	A UFO with a tractor beam
	
	@author Jonathan Moody
	@version for CS56, S13, UCSB, 05/24/2013
	
*/
public class UFOWithTractorBeam extends UFO implements Shape
{
	/**
	 *  Constructor for objects of class UFOWithTractorBeam
	 */
	public UFOWithTractorBeam(double x, double y, double width, double height)
	{
		// Construct the basic UFO without the tractor beam
		super(x,y,width,height);
		
		// get the GeneralPath that we are going to append stuff to
		GeneralPath gp = this.get();
		
		GeneralPath lb = new GeneralPath();
		
		double leftBeamX = x + 0.55 * width;
		double leftBeamY = y - 3000/height;
		lb.moveTo(leftBeamX, leftBeamY);
		lb.lineTo(leftBeamX - width * 0.1, leftBeamY + height);
		
		Shape rb = ShapeTransforms.horizontallyFlippedCopyOf(lb);
		rb = ShapeTransforms.translatedCopyOf(rb, 0.6 * width, 0.0);
		
		
		// add the tractor beams to the UFOs
	
        GeneralPath wholeUFO = this.get();
        wholeUFO.append(lb, false);
        wholeUFO.append(rb, false);
	}
}