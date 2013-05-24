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
public class CouchWithCoffeeTable extends Couch implements Shape {
    public CouchWithCoffeeTable(double x, double y, double width, double height)
    {
    
        super(x,y,width,height);
        
        GeneralPath gp = this.get();
        
        double tableWidth = 0.5 * width;
	double tableHeight = 0.5 * height;
        double tableLength = 0.2 * height;
        double legWidth = 0.2 * tableWidth; 
               
        Rectangle.Double lefttableTop = 
            new Rectangle.Double(x - tableWidth * 2, y + tableHeight ,
                          tableWidth, tableLength);
        
        Rectangle.Double lefttableLeftLegs = 
            new Rectangle.Double(x - tableWidth * 2 - legWidth, y + tableHeight ,
                          legWidth, tableHeight);
        
        Rectangle.Double lefttableRightLegs = 
            new Rectangle.Double(x - tableWidth , y + tableHeight ,
                          legWidth, tableHeight);
        
        Line2D.Double lefttableBottom = 
            new Line2D.Double (x - tableWidth * 2, y + tableHeight + tableLength * 2 ,
                               x - tableWidth, y + tableHeight + tableLength * 2 );
        
        Rectangle.Double righttableTop = 
            new Rectangle.Double(x - tableWidth * 2 + width * 4, y + tableHeight ,
                          tableWidth, tableLength);
        
        Rectangle.Double righttableLeftLegs = 
            new Rectangle.Double(x - tableWidth * 2 - legWidth + width * 4, y + tableHeight ,
                          legWidth, tableHeight);
        
        Rectangle.Double righttableRightLegs = 
            new Rectangle.Double(x - tableWidth + width * 4, y + tableHeight ,
                          legWidth, tableHeight);
        
        Line2D.Double righttableBottom = 
            new Line2D.Double (x - tableWidth * 2 + width * 4, y + tableHeight + tableLength * 2 ,
                               x - tableWidth + width * 4, y + tableHeight + tableLength * 2 );

       
        GeneralPath table = this.get();
        table.append(lefttableTop, false);
        table.append(lefttableLeftLegs, false);
        table.append(lefttableRightLegs, false);
        table.append(lefttableBottom, false);
        table.append(righttableTop, false);
        table.append(righttableLeftLegs, false);
        table.append(righttableRightLegs, false);
        table.append(righttableBottom, false);
        
    }
    
}
