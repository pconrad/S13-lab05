package edu.ucsb.cs56.S13.drawings.kailenny9295.advanced;
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


/**
 *
 * @author Kai-chieh Jann
 */
public class Couch extends GeneralPathWrapper implements Shape{
    
    
    
    public Couch (double x, double y, double width, double height){
        
        double seatHeight = 0.6 * height;
        double handRestHeight = height / 2;
        double handRestWidth = width / 5;
        
        Rectangle2D.Double leftSideCouch = 
            new Rectangle2D.Double(x + handRestWidth, y ,
                          width, height );
        
        Rectangle2D.Double rightSideCouch = 
            new Rectangle2D.Double(x + width + handRestWidth, y ,
                          width, height);
                
        Rectangle2D.Double leftHandRest = 
            new Rectangle2D.Double(x , y + handRestHeight ,
                          handRestWidth, handRestHeight );
        
        Rectangle2D.Double rightHandRest = 
            new Rectangle2D.Double(x + width * 2 + handRestWidth, y + handRestHeight,
                          handRestWidth, handRestHeight );
        
        Line2D.Double couchSeat = 
            new Line2D.Double (x + handRestWidth, y + seatHeight,
                               x + width * 2 + handRestWidth, y + seatHeight);

       
        GeneralPath couch = this.get();
        couch.append(leftSideCouch, false);
        couch.append(rightSideCouch, false);
        couch.append(couchSeat, false); 
        couch.append(leftHandRest, false);
        couch.append(rightHandRest, false);
    }
}
