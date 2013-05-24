package edu.ucsb.cs56.S13.drawings.spencerpao.advanced;
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
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a lightsaber that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Spencer Pao
   @version for CS56, Spring 2013, UCSB
   
*/
public class LS extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of upper left corner of lightsaber
       @param y y coord of upper left corner of lightsaber
       @param width width of the lightsaber
       @param height height of lightsaber
     */

    public LS(double x, double y, double width, double height)
    {
	//x and y determine top left corner
        
        double guard = .2 * height;
	double topGuardLocation = y   + height;
	double lsWidth          = .4  * width;
	double lsHeight         = height;
	double buttonRadius     = .15 * height;
	double buttonLocationX  = x   + .2 * lsWidth;
	double buttonLocationY  = y   + .8 * lsHeight;

        Rectangle2D.Double topGuard    = new Rectangle2D.Double( x , topGuardLocation , lsWidth, guard );
	Rectangle2D.Double bottomGuard = new Rectangle2D.Double( x , y , lsWidth, guard );
	Rectangle2D.Double handle      = new Rectangle2D.Double( x , y , lsWidth, lsHeight );
        Ellipse2D.Double   button      = new Ellipse2D.Double  ( buttonLocationX, buttonLocationY ,buttonRadius , buttonRadius );
                          
 
       
        GeneralPath wholeLS = this.get();
        wholeLS.append(topGuard    , false);
        wholeLS.append(bottomGuard , false);
	wholeLS.append(handle      , false);
	wholeLS.append(button      , false);

    }

}
