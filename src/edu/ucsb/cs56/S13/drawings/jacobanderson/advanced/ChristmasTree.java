package edu.ucsb.cs56.S13.drawings.jacobanderson.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A Christmas Tree (wrapper around a General Path, implements Shape)

   @author Jacob Anderson 
   @version for CS56, S13, UCSB, 05/25/2013
   
*/
public class ChristmasTree extends GeneralPathWrapper implements Shape
{

    
    /**
     * Constructor for objects of class ChristmasTree
     */
    public ChristmasTree(double x, double y, double width, double height)
    {
    
        GeneralPath tree = this.get();
        tree.moveTo(x+width/2,y);
        tree.lineTo(x,y+2/5*height);
        tree.lineTo(x+1/3*width, y+2/5*height);
        tree.lineTo(x,y+height);
        tree.lineTo(x+width,y+height);
        tree.lineTo(x+2/3*width, y+2/5*height);
        tree.lineTo(x+width,y+2/5*height);
	tree.closePath();
    }

}
