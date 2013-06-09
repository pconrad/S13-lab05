package edu.ucsb.cs56.S13.drawings.fannykuang.advanced;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

/**
 * Vector drawing of Party hat with an ornament. Draws from original party hat
 * @author Fanny Kuang
 * @version for UCSB CS56 S13, 5/22/2013
 * @see PartyHat
 */
public class PartyHatWithOrnament extends PartyHat implements Shape{

    /** constructor
     * @param x x coordinate of center of base
     * @param y y coordinate of center of base
     * @param height height of party hat
     * @param base width of base of party hat
     * @param radius radius of the circular ornament at top of hat
     */
    public PartyHatWithOrnament(double x, double y, double height, double base, double radius) {
        super(x,y,height,base);
        GeneralPath wholeHat = this.get();

        Ellipse2D.Double ornament = new Ellipse2D.Double(x-radius,y-height-radius*2,radius*2,radius*2);

        wholeHat.append(ornament,false);
    }
}
