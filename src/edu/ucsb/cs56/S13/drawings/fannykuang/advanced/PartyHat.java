package edu.ucsb.cs56.S13.drawings.fannykuang.advanced;

import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

/**
 * Vector drawing of a basic party hat
 * @author Fanny Kuang
 * @version for UCSB CS56 S13, 5/22/2013
 */

public class PartyHat extends GeneralPathWrapper implements Shape{

    /**
     * Constructor
     * @param x x coordinate of center of base
     * @param y y coordinate of center of base
     * @param height height of party hat
     * @param base width of base of party hat
     */

    public PartyHat(double x, double y, double height, double base) {
        double halfbase = base/2.0;

        Line2D.Double baseline = new Line2D.Double (x-halfbase, y, x+halfbase, y);
        Line2D.Double leftside = new Line2D.Double (x-halfbase, y, x, y-height);
        Line2D.Double rightside = new Line2D.Double(x+halfbase, y, x, y-height);

        GeneralPath wholeHat = this.get();
        wholeHat.append(baseline,false);
        wholeHat.append(leftside,false);
        wholeHat.append(rightside,false);
    }
}
