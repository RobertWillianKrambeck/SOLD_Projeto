package br.udesc.ceavi.progii.sold.view.frames;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Gustavo Santos
 */
public class FrameCadastro2 extends JInternalFramelModelo {

    private ButtonGroup grupoDeRB;
    private JLabel lbID;
    private JLabel lbIDMostrar;
    private JLabel lbNomeUsu;

    private JLabel lbTipoUssuario;
    private JPanel panelFormulario;
    private JPanel panelTipoUsuario;
    private JRadioButton rbUsuarioProfi;
    private JRadioButton rbUsuarioNormal;
    private GridBagConstraints cons;
    private LayoutManager layout;
    private TipoCliente tipoCliente;
    private JLabel lbNomeUsuMostrar;

    public FrameCadastro2(Dimension dimension) {
        super(dimension);
        initComponents();
        personalize();
        addComponents();
        super.addFormulario(panelFormulario);
        super.addBotoesDeRegistro();
    }

    private void addComponents() {
        lbNomeUsu.setText("Nome Do Usuario:");
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.ipadx = 31;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(31, 39, 0, 0);
        panelFormulario.add(lbNomeUsu, cons);

        lbNomeUsuMostrar.setText("<<Nome Aqui>>");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.ipadx = 80;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(31, 0, 0, 0);
        panelFormulario.add(lbNomeUsuMostrar, cons);

        lbID.setText("ID:");
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.ipadx = 102;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(0, 39, 0, 0);
        panelFormulario.add(lbID, cons);

        lbIDMostrar.setText("<<ID Aqui>>");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.ipadx = 96;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbIDMostrar, cons);

        lbTipoUssuario.setText("Tipo de Usuario:");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 3;
        cons.ipadx = 148;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(30, 0, 0, 0);
        panelFormulario.add(lbTipoUssuario, cons);

        grupoDeRB.add(rbUsuarioNormal);
        rbUsuarioNormal.setText("USUÁRIO PADRÃO");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(7, 64, 0, 0);
        panelFormulario.add(rbUsuarioNormal, cons);

        grupoDeRB.add(rbUsuarioProfi);
        rbUsuarioProfi.setText("USUÁRIO PARA PROFISSÃO");
        rbUsuarioProfi.addActionListener(new TipoCliente());
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 3;
        cons.gridwidth = 4;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(7, 0, 0, 0);
        panelFormulario.add(rbUsuarioProfi, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 8;
        cons.ipadx = 509;
        cons.ipady = 185;
        cons.insets = new Insets(18, 120, 36, 120);
        panelFormulario.add(panelTipoUsuario, cons);
    }

    private void personalize() {
        Font font = new Font("Tahoma", 1, 14);
        lbTipoUssuario.setFont(font);
        panelTipoUsuario.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        panelFormulario.setLayout(layout);
        panelTipoUsuario.setMaximumSize(new Dimension(20, 20));
        panelTipoUsuario.setMinimumSize(new Dimension(20, 20));
        panelTipoUsuario.setPreferredSize(new Dimension(20, 20));
        panelTipoUsuario.setLayout(new GridLayout(1, 3));

        rbUsuarioNormal.addActionListener(tipoCliente);
        rbUsuarioProfi.addActionListener(tipoCliente);
    }

    private void initComponents() {
        panelFormulario = new JPanel();
        layout = new GridBagLayout();
        grupoDeRB = new ButtonGroup();
        lbNomeUsu = new JLabel();
        lbNomeUsuMostrar = new JLabel();
        lbID = new JLabel();
        lbIDMostrar = new JLabel();
        lbTipoUssuario = new JLabel();
        rbUsuarioNormal = new JRadioButton();
        rbUsuarioProfi = new JRadioButton();
        panelTipoUsuario = new JPanel();
        tipoCliente = new TipoCliente();
    }

    private class TipoCliente extends JInternalFrame implements ActionListener {

        //Usuario Simples
        private JButton btnPremiun;
        private JButton btnFree;
        private JButton btnOutros;

        //Usuario Proficional
        private JLabel lbNDaCarteira;
        private JLabel lbDiscricao;
        private JTextArea tfDiscricao;
        private JTextField tfNDaCarteira;
        private GridBagConstraints cons;

        public TipoCliente() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (rbUsuarioNormal.isSelected() && !rbUsuarioProfi.isSelected()) {
                tipoCliente.initComponentsClienteNormal();
            } else if (!rbUsuarioNormal.isSelected() && rbUsuarioProfi.isSelected()) {
                tipoCliente.initComponentsClienteProfi();
            }

        }

        private void initComponentsClienteProfi() {
            tipoCliente = new TipoCliente();
            lbDiscricao = new JLabel("Discrição");
            lbNDaCarteira = new JLabel("Carteira de Trabalho");
            tfDiscricao = new JTextArea();
            tfNDaCarteira = new JTextField();

            this.setLayout(new GridBagLayout());

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 0;
            cons.insets = new Insets(10, 10, 0, 10);
            this.add(lbNDaCarteira, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 2;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.insets = new Insets(0, 10, 0, 0);
            this.add(tfNDaCarteira, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 3;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.insets = new Insets(10, 10, 0, 0);
            this.add(lbDiscricao, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 4;
            cons.gridwidth = 2;
            cons.weightx = 1;
            cons.insets = new Insets(10, 10, 25, 10);
            cons.fill = GridBagConstraints.HORIZONTAL;
            Dimension dime = new Dimension(50, 90);
            tfDiscricao.setPreferredSize(dime);
            tfDiscricao.setSize(dime);
            tfDiscricao.setMaximumSize(dime);
            tfDiscricao.setMinimumSize(dime);
            this.add(tfDiscricao, cons);
            setPanelTipoUsuario(this);
        }

        private void initComponentsClienteNormal() {
            tipoCliente = new TipoCliente();
            this.setLayout(new GridLayout(1, 3));
            btnFree = new JButton("Free");
            btnPremiun = new JButton("Premiun");
            btnOutros = new JButton("Outros Tipos");
            this.add(btnFree);
            this.add(btnPremiun);
            this.add(btnOutros);
            setPanelTipoUsuario(this);
        }
    }

    public void setPanelTipoUsuario(JInternalFrame frame) {
        frame.setVisible(true);
        frame.setBorder(null);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);
        this.panelTipoUsuario.removeAll();
        this.panelTipoUsuario.add(frame, BorderLayout.CENTER);
        this.panelTipoUsuario.repaint();
        this.panelTipoUsuario.revalidate();

        this.repaint();
        this.revalidate();
    }
}
