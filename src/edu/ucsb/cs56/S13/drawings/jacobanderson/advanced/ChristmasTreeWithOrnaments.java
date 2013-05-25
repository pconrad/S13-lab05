package edu.ucsb.cs56.S13.drawings.jacobanderson.advanced;
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
   A ChristmasTree
      
   @author Jacob Anderson 
   @version for CS56, S13, UCSB, 05/25/2013
   
*/
public class ChristmasTreeWithOrnaments extends ChristmasTree implements Shape
{
    /**
     * Constructor for objects of class ChristmasTree
     */
    public ChristmasTreeWithOrnaments(double x, double y, double width, double height)
    {
	// construct the basic tree shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();	

	Ellipse2D.Double firstOrnament = new Ellipse2D.Double(x+width*2/5,y+height*2/5, width*1/10,height*1/10);
	Ellipse2D.Double secondOrnament = new Ellipse2D.Double(x+width*2/5,y+height*4/5, width*1/10,height*1/10);

	GeneralPath wholeTree = this.get();
	wholeTree.append(firstOrnament, false);
	wholeTree.append(secondOrnament, false);

    }

}
