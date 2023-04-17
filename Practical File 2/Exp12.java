/*OBJECTIVE: Event Handling Programs.
(a)	 Write a program for handling Button Event
(b)	 Write a program for handling Mouse Event

SOFTWARE USED: NetBeans IDE*/

//SOURCE CODE:
//a)
package buttondemo;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="ButtonDemo" width=250 height=150>
    </applet>
*/
public class ButtonDemo extends Applet implements ActionListener
{
  String msg = "";
  Button yes, no, maybe;

  public void init ()
  {
    yes = new Button ("Yes");
    no = new Button ("No");
    maybe = new Button ("Undecided");

    add (yes);
    add (no);
    add (maybe);

    yes.addActionListener (this);
    no.addActionListener (this);
    maybe.addActionListener (this);
  }
  public void actionPerformed (ActionEvent ae)
  {
    String str = ae.getActionCommand ();
    if (str.equals ("Yes"))
      {
	msg = "You pressed Yes.";
      }
    else if (str.equals ("No"))
      {
	msg = "You pressed No.";
      }
    else
      {
	msg = "You pressed Maybe.";
      }
    repaint ();
  }
  public void paint (Graphics g)
  {
    g.drawString (msg, 6, 100);
  }
}

//b)
package mouseevents;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="MouseEvents" width=300 height=100>
    </applet>
*/
public class MouseEvents extends Applet implements MouseListener,
  MouseMotionListener
{
  String msg = "";
  int mouseX = 0, mouseY = 0;
  public void init ()
  {
    addMouseListener (this);
    addMouseMotionListener (this);
  }
  public void mouseClicked (MouseEvent me)
  {
    mouseX = 0;
    mouseY = 10;
    msg = "Mouse clicked.";
    repaint ();
  }
  public void mouseEntered (MouseEvent me)
  {
    mouseX = 0;
    mouseY = 10;
    msg = "Mouse entered.";
    repaint ();
  }
  public void mouseExited (MouseEvent me)
  {
    mouseX = 0;
    mouseY = 10;
    msg = "Mouse exited.";
    repaint ();
  }
  public void mousePressed (MouseEvent me)
  {
    mouseX = me.getX ();
    mouseY = me.getY ();
    msg = "Down";
    repaint ();
  }
  public void mouseReleased (MouseEvent me)
  {
    mouseX = me.getX ();
    mouseY = me.getY ();
    msg = "Up";
    repaint ();
  }
  public void mouseDragged (MouseEvent me)
  {
    mouseX = me.getX ();
    mouseY = me.getY ();
    msg = "*";
    showStatus ("Dragging mouse at " + mouseX + "," + mouseY);
    repaint ();
  }
  public void mouseMoved (MouseEvent me)
  {
    showStatus ("Moving mouse at " + me.getX () + "," + me.getY ());
  }
  public void paint (Graphics g)
  {
    g.drawString (msg, mouseX, mouseY);
  }
}
