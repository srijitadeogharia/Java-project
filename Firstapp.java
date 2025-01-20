import java.applet.*;
import java.awt.*;
public class Firstapp extends Applet{
    public void paint(Graphics g){
        //g.drawString("welcome",50,60);
        g.setColor(Color.MAGENTA);
        g.drawOval(60,60,100,100);
        g.fillOval(60,200,100,100);
        g.setColor(Color.MAGENTA);
        g.drawRect(700,90,100,100);
        g.fillRect(750,250,100,100);
    }
}
