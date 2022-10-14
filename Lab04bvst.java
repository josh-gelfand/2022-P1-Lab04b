// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(0, 0, 125, 125);
        g.drawLine(0, 0, 50, 50);
        g.drawRect(50, 50, 125, 125);
        g.drawLine(125,0,175, 50);
        g.drawLine(0, 125, 50, 175);
g.drawLine(125,125,175, 175);





        // DRAW SPHERE

        g.drawOval(75,12,25,150);
        g.drawOval(51,12,75,150);
        g.drawOval(25,12,125,150);
        g.drawOval(12,12,150,150);

g.drawOval(12, 75, 150, 25);
g.drawOval(12, 51, 150, 75);
        g.drawOval(12, 25, 150, 125);
        g.drawOval(12, 12, 150, 150);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

       g.drawOval(250, 12, 100, 100);
g.drawLine(300, 112, 300, 12);
g.drawLine(300, 12, 250, 62);
g.drawLine(250, 62,300, 112 );
g.drawOval(259,42, 41, 41 );

        // DRAW APCS
g.fillRect(100, 200, 25, 100);
        g.fillRect(125, 200, 25, 25);
        g.fillRect(125, 250, 25, 25);
        g.fillRect(150,200, 25, 100 );

        g.fillRect(200, 200, 25, 100);
        g.fillRect(225, 200, 50, 25);
        g.fillRect(250, 225, 25, 25 );
        g.fillRect(225, 250, 50, 25 );

        g.fillRect(300, 200, 75, 25);
        g.fillRect(300,200, 25, 100);
        g.fillRect(300, 275, 75, 25);

        g.fillRect(400, 200, 75, 25);

        g.fillRect(400,200, 25, 37);

        g.fillRect(400, 237, 75, 25);

        g.fillRect(450,237, 25, 37 );

        g.fillRect(400, 274, 75, 25);
        // DRAW PACMEN FLOWER



    }

}


