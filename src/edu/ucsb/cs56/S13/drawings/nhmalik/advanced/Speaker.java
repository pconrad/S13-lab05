package edu.ucsb.cs56.S13.drawings.nhmalik.advanced;
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
import edu.ucsb.cs56.S13.drawings.nhmalik.simple.Circle;

/**
   A vector drawing of a speaker that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   Modeled off of House.java

   @author Noah Malik 
   @version for CS56, Spring 13, UCSB
   
*/
public class Speaker extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of upper left corner of speaker
       @param y y coord of upper left corner of speaker
       @param width width of the speaker
       @param height height of speaker (this param sets minimum size of speaker)
     */
    public Speaker(double x, double y, double width, double height)
    {
    
        // This shape autoscales to maintain a minimum speaker ratio
        // The width should be grater than or equal to 0.4*height
        // This ensures the speaker drivers do not extend out of the case
        // It is understood that speakers with relatively small drivers are still possible

        if(width < 0.4*height){
          width = 0.4*height;
        }
        
        double wubOuterRadius = 0.175*height;
        double wubInnerRadius = 0.0175*height;
        double wubSpacing = 0.1*height;

        double wubX = x + 0.5*width;
        double wubTopY = y + wubSpacing + wubOuterRadius;
        double wubBotY = y + 2*wubSpacing + 3*wubOuterRadius;

        // Make the outline
        
        Rectangle2D.Double casing = 
            new Rectangle2D.Double(x, y,
                          width, height);
                          
        // Make the parts that goes WUBWUBWUB
        // (They are the drivers: cirle parts)
        
        Circle wubOuterTop = new Circle(wubX, wubTopY, wubOuterRadius);
        Circle wubInnerTop = new Circle(wubX, wubTopY, wubInnerRadius);

        Circle wubOuterBot = new Circle(wubX, wubBotY, wubOuterRadius);
        Circle wubInnerBot = new Circle(wubX, wubBotY, wubInnerRadius);

        // put the whole house together
       
        GeneralPath wholeSpeaker = this.get();
        wholeSpeaker.append(casing, false);
        wholeSpeaker.append(wubOuterTop, false);
        wholeSpeaker.append(wubInnerTop, false);
        wholeSpeaker.append(wubOuterBot, false);
        wholeSpeaker.append(wubInnerBot, false);

        
    }

}
