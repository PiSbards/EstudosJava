import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploActionListenerClasseAnonima {

    JTextField tf;
    JFrame j;
    JButton bt;

    public ExemploActionListenerClasseAnonima() {
        j = new JFrame("Exemplo Action Listener");
        j.setSize(400,400);

        tf = new JTextField();
        tf.setBounds(50,50,150,20);

        bt = new JButton();
        bt.setBounds(50,100,100,30);
        bt.setText("Clique AQUI!");

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("O botão foi clicado!");
            }
        });

        j.add(tf);
        j.add(bt);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
