import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExemploMouseListener extends JFrame implements MouseListener {
    JLabel texto;
    public ExemploMouseListener(){
        setSize(400,400);

        addMouseListener(this);//Adicionando o lugar do evento;

        texto = new JLabel();
        texto.setBounds(60,50,300,20);


        add(texto);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText("O mouse foi clicado");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        texto.setText("O Mouse foi pressionado, mas ainda não soltou");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        texto.setText("O Mouse foi solto/liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        texto.setText("O mouse entrou na janela");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        texto.setText("O mouse saiu na janela");
    }
}
