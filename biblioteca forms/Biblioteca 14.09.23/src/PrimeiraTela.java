import javax.swing.*;
import java.awt.*;

public class PrimeiraTela extends JFrame{
    JLabel lblNome = new JLabel("NOME");
    JLabel lblEndereco = new JLabel("ENDEREÇO");
    JLabel lblSexo = new JLabel("SEXO");
    JTextField txtNome = new JTextField(null,20);
    JTextField txtEndereco = new JTextField(null,30);
    JButton btnSalvar = new JButton("SALVAR");
    JButton btnFechar = new JButton("FECHAR");
    String[] sexos = {"Masculino","Feminino"};
    JComboBox cbxSexo = new JComboBox(sexos);
    public PrimeiraTela(){
        //setLayout(new FlowLayout());posiciona os componentes um após o outro.
        setLayout(new GridLayout(4,2));
        //Os componentes serão apresentados na tela nesta ordem.
        getContentPane().add(lblNome);
        getContentPane().add(lblEndereco);
        getContentPane().add(txtNome);
        getContentPane().add(txtEndereco);
        getContentPane().add(lblSexo);
        getContentPane().add(cbxSexo);
        getContentPane().add(btnSalvar);//adicionei o primeiro botão
        getContentPane().add(btnFechar);
        setVisible(true);
        pack();
    }
}
