/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import javax.swing.text.html.StyleSheet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author student
 */
public class rectangle extends Applet {
String a,b,c,d,e;
    Color colr;
int x1,y1,x2,y2;
StyleSheet s=new StyleSheet();


    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        a=getParameter("x1");
        b=getParameter("y1");
        c=getParameter("x2");
        d=getParameter("y2");
        e=getParameter("color");
        x1=Integer.parseInt(a);
        y1=Integer.parseInt(b);
        x2=Integer.parseInt(c);
        y2=Integer.parseInt(d);
        colr=s.stringToColor(e);
    }
    public void paint(Graphics g)
    {
        g.setColor(colr);
        g.drawRect(x1, y1, x2, y2);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
