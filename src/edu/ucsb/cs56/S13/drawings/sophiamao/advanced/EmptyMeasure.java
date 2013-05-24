package edu.ucsb.cs56.S13.drawings.sophiamao.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an empty music measure that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
   
   @author Sophia Mao
   @version for CS56, Spring 2013, UCSB
   
*/
public class EmptyMeasure extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of measure
       @param y y coord of lower left corner of measure
       @param width width of the measure
       @param height height of measure
    */
    public EmptyMeasure(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double lineHeight = height;
        double lineGap = (height) / 4;
        //double trebleWidth = width / 5;
	GeneralPath oneMeasure = this.get();
	
	//draw the lines of the measure
	
	for( int i = 0; i < 5; i++){
	    Line2D.Double Line = new Line2D.Double(x, y - i*lineGap, 
						   x + width, y - i*lineGap);
	    oneMeasure.append(Line, false);
    	}
	
	// draw beginning line
        Line2D.Double beginMeasure = 
            new Line2D.Double (x, y - lineHeight,
                               x, y);
	// draw end line
        Line2D.Double endMeasure=
            new Line2D.Double (x + width, y,
                               x + width, y - lineHeight);
	
	
	
        oneMeasure.append(beginMeasure, false);
        oneMeasure.append(endMeasure, false); 
        
    }
    
}
