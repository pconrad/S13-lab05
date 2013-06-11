package edu.ucsb.cs56.S13.drawings.fannykuang.advanced;

import javax.swing.*;
import java.awt.*;

// the four tools things we'll use to draw


/**
   A component that draws a Picture by Phill Conrad
   
   @author Phill Conrad (original drawing)
   @version UCSB, CS56, S13, 5/22/2013

   
*/


public class MultiPictureComponent extends JComponent
{  
    private int whichPicture = 0;

    public MultiPictureComponent(int whichPicture) {
	this.whichPicture = whichPicture;
    }

    /** The paintComponent method is always required if you want
     * any graphics to appear in your JComponent.    
     * 
     * There is a paintComponent
     * method that is created for you in the JComponent class, but it
     * doesn't do what we want, so we have to "override" that method with
     * our own method.  
     */
    
   public void paintComponent(Graphics g)
   {  

       Graphics2D g2 = (Graphics2D) g;

       // Call a static method for drawing picture 2

       switch (this.whichPicture) {
	   
       case 1:
	   AllMyDrawings.drawPicture1(g2);
	   break;

       case 2:
	   AllMyDrawings.drawPicture2(g2);
	   break;

       case 3:
	   AllMyDrawings.drawPicture3(g2);
	   break;
       default:
	   throw new IllegalArgumentException("Unknown value for whichPicture in MultiPictureComponent" + this.whichPicture);
	   
       } // switch
   } // paintComponent
        
  
}