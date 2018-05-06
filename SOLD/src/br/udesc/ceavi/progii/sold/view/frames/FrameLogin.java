package br.udesc.ceavi.progii.sold.view.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Esta Classe é o modelo da tela de login
 *
 * @author Gustavo
 * @version 1.0
 * @since 19/04/2018
 */
public class FrameLogin extends JInternalFramelModelo {

    private Label lbUsuario;
    private Label lbSenha;

    private JTextField tfUsuario;
    private JPasswordField jpfSenha;

    private JPanel panelFormulario;
    private LayoutManager layout;
    private GridBagConstraints cons;
    
    private JButton btnLogin;
    private JButton btnRegistrar;
    private Dimension dimensionTF;
    private JCheckBox jCBLembrar;

    public FrameLogin(Dimension dimension) {
        super(dimension);
        initComponents();
        personalizeComponents();
        addComponents();
        super.addFormulario(panelFormulario);
    }

    private void initComponents() {
        lbUsuario = new Label("Usuario:");
        lbSenha = new Label("Senha:");
        tfUsuario = new JTextField();
        jpfSenha = new JPasswordField();
        panelFormulario = new JPanel();
        btnLogin = new JButton("Entrar");
        btnRegistrar = new JButton("Registar");
        jCBLembrar = new JCheckBox("Lembrar Usuario");
        layout = new GridBagLayout();
        dimensionTF = new Dimension();
    }

    private void personalizeComponents() {
        //Definição do layout de panelFormulario
        panelFormulario.setLayout(layout);
        
        //Definição do tamanho dos TextF
        dimensionTF.setSize(140, 27);
        tfUsuario.setPreferredSize(dimensionTF);
        jpfSenha.setPreferredSize(dimensionTF);

        Font font = new Font("Abril", 0, 14);
        lbSenha.setFont(font);
        lbUsuario.setFont(font);
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        panelFormulario.add(lbUsuario,cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 2;
        panelFormulario.add(tfUsuario,cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        panelFormulario.add(lbSenha,cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 2;
        panelFormulario.add(jpfSenha,cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        panelFormulario.add(btnLogin,cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        panelFormulario.add(btnRegistrar,cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        
        panelFormulario.add(jCBLembrar,cons);

    }
}
