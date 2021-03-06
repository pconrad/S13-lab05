package edu.ucsb.cs56.S13.drawings.mastergberry.advanced;
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
   A PaddleBall
      
   @author Adam Ehrlich
   @version for CS56, W13, UCSB, 05/19/2013
   
*/
public class PaddleBall extends Paddle implements Shape
{
    /**
     * Constructor for objects of class PaddleBall
     */
    public PaddleBall(double paddleDiameter, double stickHeight, double stickWidth, double ballDiameter)
    {
	// construct the basic house shell
	super(paddleDiameter, stickHeight, stickWidth);

	double upperLeftY = paddleDiameter + stickHeight + paddleDiameter/2 - ballDiameter;
	double upperLeftX = paddleDiameter + paddleDiameter/4 - ballDiameter/4;
	Ellipse2D.Double ball = new Ellipse2D.Double(upperLeftX, upperLeftY, ballDiameter/2, ballDiameter/2);
	

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	gp.append(ball, false);
    }

}
