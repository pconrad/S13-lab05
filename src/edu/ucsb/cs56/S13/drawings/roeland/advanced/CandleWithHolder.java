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
Vector drawing of candle with holder that extends class Candle.

@author Roeland Singer-Heinze
@version CS56, Spring 2013, UCSB
 */


public class CandleWithHolder extends Candle implements Shape{

    /** 
Constructor

@param x, x coordinate of center of candle with holder
@para y, y coordinate of center of candle with holder
@param width is the width of the holder with candle
@param height is the heigh of the candle holder

    */

    public CandleWithHolder(double x, double y, double width, double height){

	//construct the candle
	super(x - width*.35, y - height *.5, width*.7, height*.25);

	//get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Rectangle2D.Double holderTop = new Rectangle2D.Double(x - width*.45,
							      y - height*.25, 
							      width *.9, 
							      height* .05);

	Rectangle2D.Double holderMiddle = new Rectangle2D.Double(x - width*.15,
								 y - height*.2,
								 width * .3,
								 height*.65);


	Rectangle2D.Double holderBottom = new Rectangle2D.Double(x - width*.5,
								 y + height*.45,
								 width,
								 height*.05);



	GeneralPath wholeCandle = this.get();
	wholeCandle.append(holderTop, false);
	wholeCandle.append(holderMiddle, false);
	wholeCandle.append(holderBottom, false);



    }


} 



								 
								 



								 


