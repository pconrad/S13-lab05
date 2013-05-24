package edu.ucsb.cs56.S13.drawings.briankwan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A Lollipop
      
   @author Phill Conrad
   @author Brian Wan
   @version for CS56, S13, UCSB
   
*/
public class Lollipop extends Stick implements Shape
{
    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop(double x, double y, double width, double height)
    {
	// construct the basic stick shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	/*(())3w
	   ||
	   ||
	   w
	   Lollipop (stick base, Candy on top) 
	   x=x-width
	   y=y-.35*height
	   candy=width*3
	   
	*/
	double a = x- width; 
	double b = y-.35*height; 
	double w = width * 2;
	double h= height-2/5*height;
	double candy = width*3;
	
	Ellipse2D.Double circle = new Ellipse2D.Double(a,b,candy,candy);

        GeneralPath pathLollipop = this.get();
        pathLollipop.append(circle, false);
      
    }

}
