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
   A vector drawing of a pole that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Gordon Cheung
   @version for CS56, Spring 2013, UCSB
   
*/
public class Pole extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of upper left of pole
       @param y y coord of upper left of pole
       @param width width of the pole
       @param height of the pole
     */
    public Pole(double x, double y, double width, double height)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
       
	//Make the pole
	Rectangle2D.Double pole = new Rectangle2D.Double(x,y,width,height);
        

        // make a generalpath of pole
       
        GeneralPath polePath = this.get();
        polePath.append(pole, false);
      
        
    }

}
