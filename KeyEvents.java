import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyEvents extends Applet implements KeyListener
{
    String msg="";
    int X=10,Y=20;
    public void init()
    {
        addKeyListener(this);
        setForegroung(Color.red);
    }
    public void keyPressed(KeyEvents ke)
    {
        showStatus("KEY DOWN");
    }
    public void keyReleased(KeyEvents ke)
    {
        showStatus("Key up");
    }
    public void keyTyped(KeyEvents ke)
    {
        msg=msg+ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,X,Y);
    }
}