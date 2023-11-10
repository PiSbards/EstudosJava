import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ExemploMouseMotionListener extends JFrame implements MouseMotionListener {
    public ExemploMouseMotionListener(){
        setSize(400,400);
        addMouseMotionListener(this);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(), 30,30);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
