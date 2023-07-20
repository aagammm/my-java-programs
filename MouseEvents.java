import java.awt.*;
import java.awt.event.*;
import java.awt.applet.*;

public class MouseEvents extends Applet implements MouseMotionListener,MouseListener
{
    String msg="";
    int mouseX=0,mouseY=0;
    
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        
        setForeground(Color.red);
    }
    public void mouseClicked(MouseEvents me)
    {
        mouseX=0;
        mouseY=10;
        msg="mouse clicked";
        repaint();
    }
    public void mouseEntered(MouseEvents me)
    {
        mouseX=0;
        mouseY=10;
        msg="mouse entered";
        repaint();
    }
    public void mouseExited(MouseEvents me)
    {
        mouseX=0;
        mouseY=10;
        msg="mouse entered";
        repaint();
    }
    public void mousePressed(MouseEvents me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg="down";
        repaint();
    }
    public void mouseReleased(MouseEvents me)
    { }
    public void mouseDragged(MouseEvents me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg="*";
        repaint();
    }
    public void mouse(MouseEvents me)
    {
        showStatus("Moving mouse at"+me.getX()+","+me.getY());
    }
    public void paint(Graphic g)
    {
        g.drawString(msg,mouseX,mouseY);
    }
}