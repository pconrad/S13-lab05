package edu.ucsb.cs56.S13.drawings.sophiamao.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A House
   
   @author Sophia Mao
   @version for CS56, Spring 2013, UCSB, 05/23/2013
   
*/
public class MeasureWithNotes extends EmptyMeasure implements Shape
{
    /**
     * Constructor for MeasureWithNotes
     *@param x x coord of lower left corner of measure
     *@param y y coord of lower left corner of measure
     *@param width width of the measure
     *@param height height of measure
     */
    public MeasureWithNotes(double x, double y, double width, double height)
    {
	// construct the basic EmptyMeasure shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// make three notes (each 15pixel width and 8pixel height with a 20 pixel stem
	// _____________________    line 4
	//|_____________________|   line 3 space 4
	//|________@____________|   line 2 space 3
	//|__@__________________|   line 1 space 2
	//|_______________@_____|   line 0 space 1
	//
	//notes consist of an ellipse2D and a line extending from the notes.
	//
	
	//
	
	double numSpaceNote = height / 4;
	double numLineNote  =  height / 4 - height/8;
	double noteDistance = width / 4;
	double noteWidth = width/8;
	double noteHeight = height/4;
	double stemLength = height/2;
	
	Ellipse2D.Double note1 =
	    new Ellipse2D.Double(x + noteDistance - noteWidth/2, y - 2*numSpaceNote,noteWidth, noteHeight);
	Line2D.Double stem1 = 
	    new Line2D.Double(x + noteDistance + noteWidth/2, y - 2*numSpaceNote + noteHeight/2, x + noteDistance + noteWidth/2, y - 2* numSpaceNote + noteHeight/2 - stemLength);
	
	Ellipse2D.Double note2 =
	    new Ellipse2D.Double(x + 2 * noteDistance - noteWidth/2, y - 3*numSpaceNote, noteWidth, noteHeight);
	
	Line2D.Double stem2 = 
	    new Line2D.Double(x + 2*noteDistance + noteWidth/2, y - 3*numSpaceNote + noteHeight/2, x+2*noteDistance + noteWidth/2, y-3*numSpaceNote + noteHeight/2 - stemLength);
	
	
	Line2D.Double eighthNoteStem = 
	    new Line2D.Double(x + noteDistance + noteWidth/2, y -2*numSpaceNote + noteHeight/2 - stemLength, x + 2*noteDistance + noteWidth/2, y - 3*numSpaceNote + noteHeight/2 - stemLength);
	
	
	Ellipse2D.Double note3 =
	    new Ellipse2D.Double(x + 3 * noteDistance - noteWidth/2, y - numLineNote, noteWidth, noteHeight);
	
	Line2D.Double stem3 = 
	    new Line2D.Double(x + 3* noteDistance + noteWidth/2, y - numLineNote + noteHeight/2, x + 3*noteDistance + noteWidth/2, y - numLineNote + noteHeight/2 - stemLength);
	
	// add the notes to the measure
	// second parameter of append is a boolean to control whether or not to turn an initial moveTo segment into a lineTo segment to connect the new geometry to the existing path.
	
        GeneralPath wholeMeasure = this.get();
        wholeMeasure.append(note1, false);
	wholeMeasure.append(stem1, false);
        wholeMeasure.append(note2, false);
	wholeMeasure.append(stem2, false);
	wholeMeasure.append(eighthNoteStem, false);
        wholeMeasure.append(note3, false); 
	wholeMeasure.append(stem3, false);
    }
    
}
