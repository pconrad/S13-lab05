package edu.ucsb.cs56.S13.drawings.briankwan.advanced;
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
   A vector drawing of a stick that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @author Brian Wan
   @version for CS56, Spring 2013, UCSB
   
*/
public class Stick extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of stick
       @param y y coord of lower left corner of stick
       @param width width of the stick
       @param height of stick
     */
    public Stick(double x, double y, double width, double height)
    {
    
        Rectangle2D.Double stick  = new Rectangle2D.Double(x,y,width,height);
       
        GeneralPath pathStick = this.get();
        pathStick.append(stick, false); 
        
    }

}
