package edu.ucsb.cs56.S13.drawings.fannykuang.advanced;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;

import java.awt.*;

/**
 * A class with static methods for drawing various pictures
 * @author Fanny Kuang
 * @version for UCSB CS56 S13, 5/22/2013
 */


public class AllMyDrawings
{
    /** Draw a few party hats
     */

    public static void drawPicture1(Graphics2D g2) {

	PartyHat h1 = new PartyHat(150, 200, 70, 50);
	g2.setColor(Color.RED); g2.draw(h1);
	
	// Smaller house, and shifted around

	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Bigger hats, and shifted around
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// bolder lines
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	

	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x00A71A));
	g2.draw(h2); 
	
	// Draw two party hats with ornaments

	PartyHatWithOrnament hw1 = new PartyHatWithOrnament(50,350,40,75,10);
	PartyHatWithOrnament hw2 = new PartyHatWithOrnament(400,350,200,150,20);
	
	g2.draw(hw1);
	g2.setColor(new Color(0xFD60FF)); g2.draw(hw2);


	g2.setStroke(orig);
	g2.setColor(Color.BLACK);

	g2.drawString("Some party hats by Fanny Kuang", 20,20);
    }


    /** Draw different arrangements
     */
    public static void drawPicture2(Graphics2D g2) {
	//Placeholder for 2
    }
  
    /** Draw different arrangements
     */

    public static void drawPicture3(Graphics2D g2) {
	//Placeholder for 3
    }
    

}
