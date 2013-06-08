package edu.ucsb.cs56.S13.drawings.gordoncheung.advanced;
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
   A stopsign
      
   @author Gordon Cheung 
   @version for CS56, Spring 2013, UCSB
   
*/
public class Stopsign extends Pole implements Shape
{
    /**
     * Constructor for objects of class Stopsign, sticks a hexagon on top of pole
     */
    public Stopsign(double x, double y, double width, double height)
    {
	// construct the pole
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	//  side 3   _
	// side 2   / \ side 4 
	// side 1   \_/ side 5   No need to draw the bottomside because it will be attached to the top of the pole
	//

	Line2D.Double side= new Line2D.Double(x, y, x-width*Math.sin(120),y-width*Math.sin(120));
	Line2D.Double side2=new Line2D.Double(x-width*Math.sin(120), y-width*Math.sin(120), x,y-2*width*Math.sin(120));
	Line2D.Double side3= new Line2D.Double(x, y-2*width*Math.sin(120),x+width, y-2*width*Math.sin(120));
	Line2D.Double side4= new Line2D.Double(x+width, y-2*width*Math.sin(120),x+width+width*Math.sin(120),y-width*Math.sin(120));
	Line2D.Double side5= new Line2D.Double(x+width+width*Math.sin(120),y-width*Math.sin(120),x+width,y);
			      

	// add the lines to the pole


        GeneralPath completeStopSign = this.get();
        completeStopSign.append(side, false);
        completeStopSign.append(side2, false);
        completeStopSign.append(side3, false); 
	completeStopSign.append(side4,false);
	completeStopSign.append(side5,false);
    }

}
