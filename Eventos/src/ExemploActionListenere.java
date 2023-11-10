import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploActionListenere implements ActionListener {
    JTextField tf = new JTextField();
    JButton bt = new JButton();
    public ExemploActionListenere() {
        JFrame f = new JFrame("Exemplo de Action Listener");
        f.setSize(400,400);
        bt.setText("Clique aqui");
        bt.addActionListener(this);

        tf.setBounds(50,50,150,20);
        bt.setBounds(50,100,100,30);


        f.add(bt);
        f.add(tf);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("O botão foi clicado");
    }
}
