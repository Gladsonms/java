/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/**
 *
 * @author student
 */
public class Mouse extends Applet implements MouseMotionListener
{
int x,y;

 

    public void init() {
    MouseMotionListener This = null;
        addMouseMotionListener(This);
    
        
    }
    public void MouseMoved(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        repaint();
    }
    public void MouseDragged(MouseEvent e)
            
   {
       x=e.getX();
       y=e.getX();
       repaint();
       
   }
    public void paint(Graphics g)
    {
        showStatus(x+"."+y);
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}