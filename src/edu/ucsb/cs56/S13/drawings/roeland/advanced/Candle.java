package edu.ucsb.cs56.S13.drawings.roeland.advanced;

import java.awt.geom.GeneralPath; 
import java.awt.geom.AffineTransform;
import java.awt.Shape; 

import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
Candle is just an ordinary vector drawing of a candle
that implements the shape interface, so it can be drawn.

@author Roeland Singer-Heinze
@version CS56, Spring 2013, UCSB
 */


public class Candle extends GeneralPathWrapper implements Shape{


    /**
      Constructor

@param x, x coordinate of top left of candle base
@param y, y coordinate of top left of candle base
@param width of candle base
@param height of candle base
    */

    public Candle(double x, double y, double width, double height){

	//the base of the candle
	Rectangle2D.Double candle = new Rectangle2D.Double(x, y, width, height);

	//the wick of the candle
	Line2D.Double wick = new Line2D.Double(x+width*.5, y - height*.3,
					       x+width*.5, y);

	//Put the candle together
	GeneralPath wholeCandle = this.get();
	wholeCandle.append(candle, false);
	wholeCandle.append(wick, false);


    }

}
