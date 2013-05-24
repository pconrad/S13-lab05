package edu.ucsb.cs56.S13.drawings.nhmalik.advanced;

import java.util.ArrayList;
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
import edu.ucsb.cs56.S13.drawings.nhmalik.advanced.Speaker;
import edu.ucsb.cs56.S13.drawings.nhmalik.simple.Circle;

/**
   A boombox can change the world
   You've got to know your limits with a boombox
   This is a cautionary tale
   A boombox is not a toy
      
   @author Noah Malik
   @version for CS56, S13, UCSB, 05/24/2013
   
*/
public class Boombox extends Speaker implements Shape
{
    /**
     * Constructor for objects of class Speaker
     */
    public Boombox(double x, double y, double width, double height)
    {
    	
    	super(x, y, 0.25*width, height);

    	// This shape maintains the minimum ratio requirements of Speaker
    	// Speakers should be 0.25*width, so width should be 1.6*height
    	if(width < 1.6*height){
    		width = 1.6*height;
    	}

    	// Boombox feature parameters
    	double speakerWidth = 0.25*width;
    	double consoleWidth = 0.5*width;
    	double buttonsWidth = 0.6*consoleWidth;
    	double buttonsHeight = 0.1*height;
    	double cassetteWidth = 0.8*buttonsWidth;
    	double cassetteHeight = 0.4*height;
    	
    	double consoleX = x + speakerWidth;
    	double rightSpeakerX = x + speakerWidth + consoleWidth;
    	double buttonsX = consoleX + 0.2*consoleWidth;
    	double buttonsY = y + 0.1*height;
    	double cassetteX = buttonsX + 0.1*buttonsWidth;
    	double cassetteY = y + 0.45*height;

    	// Declaration Speakers for each side

    	Speaker rightSpeaker = new Speaker(rightSpeakerX, y, speakerWidth, height);

    	// Boombox Console Features
    	Rectangle2D.Double console =
    		new Rectangle2D.Double(consoleX, y, consoleWidth, height);
		ArrayList<Rectangle2D.Double> buttons = new ArrayList<Rectangle2D.Double>();
		for(int i = 0; i < 5; i++){
			Rectangle2D.Double b =
	    		new Rectangle2D.Double((buttonsX + i*0.2*buttonsWidth), buttonsY,
	    								(0.2*buttonsWidth), buttonsHeight);
	    	buttons.add(b);
	    }
		
		Rectangle2D.Double cassette =
	    	new Rectangle2D.Double(cassetteX, cassetteY, cassetteWidth, cassetteHeight);
	
	// add the components of the boombox together

        GeneralPath boombox = this.get();
        boombox.append(console, false);
        for(Rectangle2D.Double button : buttons){
        	boombox.append(button, false);
        }
        boombox.append(cassette, false);
        boombox.append(rightSpeaker, false); 
    }

}
