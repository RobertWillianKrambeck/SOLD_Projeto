package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.listeners.FrameCadastro1Listeners;
import br.udesc.ceavi.progii.sold.listeners.FrameCadastro2Listeners;
import br.udesc.ceavi.progii.sold.modelo.Estado;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Gustavo de Carvalho Santos
 * @since 19/04/2018
 * @version 1.0
 */
public class FrameCadastro1 extends JInternalFramelModelo {

    private Dimension dimensionTextField;
    private JPanel panelFormulario;
    private JLabel lbCPF;
    private JLabel lbData;
    private JLabel lbEmail;
    private JLabel lbID;
    private JLabel lbNome;
    private JLabel lbSenha;
    private JLabel lbSenhaConfirma;
    private JLabel lbTelefone;
    private JPanel panelEndereco;
    private JPanel panelEspaço;
    private JPasswordField pfSenha;
    private JPasswordField pfSenhaConfirma;
    private JTextField tfCPF;
    private JTextField tfData;
    private JTextField tfEmail;
    private JTextField tfID;
    private JTextField tfNome;
    private JTextField tfTelefone;

    private FrameCRUDEndereco dadosEndereco;
    private GridBagConstraints cons;
    
    private FrameSistema frameSistema;

    public FrameCadastro1(Dimension dimension,FrameSistema frameSistema) {
        super(dimension,frameSistema);
        initComponents();
        personalizeComponents();
        addComponents();
        super.addBotoesDeAcao();
        FrameCadastro1Listeners listerner = new FrameCadastro1Listeners(frameSistema, this);
        super.addFormulario(panelFormulario);
    }

    private void initComponents() {
        panelFormulario = new JPanel();

        panelFormulario = new JPanel();
        lbData = new JLabel();
        tfData = new JTextField();
        lbTelefone = new JLabel();
        tfTelefone = new JTextField();
        tfID = new JTextField();
        lbEmail = new JLabel();
        lbID = new JLabel();
        pfSenhaConfirma = new JPasswordField();
        lbSenhaConfirma = new JLabel();
        tfEmail = new JTextField();
        lbCPF = new JLabel();
        tfCPF = new JTextField();
        lbNome = new JLabel();
        tfNome = new JTextField();
        panelEndereco = new JPanel();
        panelEspaço = new JPanel();
        lbSenha = new JLabel();
        pfSenha = new JPasswordField();
        dadosEndereco = new FrameCRUDEndereco(panelEndereco.getSize(),frameSistema);
        tfNome.setPreferredSize(dimensionTextField);
    }

    private void addComponents() {
        panelFormulario.setLayout(new GridBagLayout());

        //Nome >>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbNome, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(tfNome, cons);
        //Nome <<<<<

        //Data >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 0;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbData, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 1;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(tfData, cons);
        //Data <<<<

        //Email >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbEmail, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(tfEmail, cons);
        //Email <<<<

        //Telefone >>>>
        //Telefone >>>>
        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 2;
        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbTelefone, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 3;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(tfTelefone, cons);
        //Telefone <<<<<
        //Telefone <<<<<

        //ID >>>>>
        //ID >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 7;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbID, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 8;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(tfID, cons);
        //ID <<<<<<
        //ID <<<<<<

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 5;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbCPF, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 6;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(tfCPF, cons);

        //Formulario de Endereco >>>>>
        //Formulario de Endereco >>>>>
        panelEndereco.add(dadosEndereco.getPanelFormulario());
        panelEndereco.setBorder(BorderFactory.createTitledBorder("Dados De Endereço"));
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 9;
        cons.gridwidth = 9;
        cons.gridheight = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(panelEndereco, cons);
        //Formulario de Endereco <<<<<

        //So espaco
        //So espaco
        //So espaco
        panelEspaço.setPreferredSize(new Dimension(50, 0));
        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 1;
        panelFormulario.add(panelEspaço, cons);
        //So espaco
        //So espaco
        //So espaco
        //So espaco
        //So espaco

        //Senha >>>>
        //Senha >>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 12;
        panelFormulario.add(lbSenha, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 13;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(pfSenha, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 13;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(pfSenhaConfirma, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 12;
        panelFormulario.add(lbSenhaConfirma, cons);
        //Senha <<<<<
        //Senha <<<<<

    }

    private void personalizeComponents() {
        lbNome.setText("Nome:");
        lbTelefone.setText("Telefone:");
        lbEmail.setText("Email:");
        lbSenha.setText("Senha:");
        lbSenhaConfirma.setText("Confirmação de Senha");
        lbData.setText("Data:");
        lbID.setText("ID:");
        lbCPF.setText("CPF:");
        dimensionTextField = new Dimension(155, 20);
        tfData.setPreferredSize(dimensionTextField);
        tfNome.setPreferredSize(dimensionTextField);
        tfID.setEditable(false);
    }

    class FrameCRUDEndereco extends JInternalFramelModelo {

        private final Dimension dimension = new Dimension(320, 200);
        //
        private Label lbCep;
        private Label lbLogradouro;
        private Label lbNumero;
        private Label lbComplemento;
        private Label lbBairro;
        private Label lbCidade;
        private Label lbSigla;
        private Label lbUF;

        private JTextField tfCep;
        private JTextField tfLogradouro;
        private JTextField tfNumero;
        private JTextField tfComplemento;
        private JTextField tfBairro;
        private JTextField tfCidade;
        private JTextField tfSigla;

        private JComboBox cbUF;

        private JPanel panelFormulario;
        private LayoutManager layout;

        private GridBagConstraints cons;
        //

        public FrameCRUDEndereco(Dimension dimension,FrameSistema frameSistema) throws HeadlessException {
            super(dimension, frameSistema);
            initComponents();
            addComponents();
        }

        private void initComponents() {
            //
            lbCep = new Label("Cep*");
            lbLogradouro = new Label("Operador*");
            lbNumero = new Label("Numero*");
            lbComplemento = new Label("Complemento*");
            lbBairro = new Label("Bairro*");
            lbCidade = new Label("Cidade*");
            lbSigla = new Label("Sigla*");
            lbUF = new Label("UF*");

            tfCep = new JTextField();
            tfLogradouro = new JTextField();
            tfNumero = new JTextField();
            tfComplemento = new JTextField();
            tfBairro = new JTextField();
            tfCidade = new JTextField();
            tfSigla = new JTextField();
            cbUF = new JComboBox(Estado.values());
            cbUF.setSelectedIndex(-1);

            layout = new GridBagLayout();

            panelFormulario = new JPanel(layout);
        }

        private void addComponents() {
            //Cep --->
            //(0,0) lbCep
            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 0;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbCep, cons);

            //(1,0) tfCep
            cons = new GridBagConstraints();
            cons.gridx = 1;
            cons.gridy = 0;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 50;
            panelFormulario.add(tfCep, cons);
            //Cep <---

            //Logradouro --->
            //(2,0) lbLogradouro
            cons = new GridBagConstraints();
            cons.gridx = 2;
            cons.gridy = 0;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbLogradouro, cons);

            //(3,0) lbLogradouro
            cons = new GridBagConstraints();
            cons.gridx = 3;
            cons.gridy = 0;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 50;
            panelFormulario.add(tfLogradouro, cons);
            //Logradouro <---

            //Numero --->
            //(0,1) lbNumero
            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 1;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbNumero, cons);

            //(1,1) tfNumero
            cons = new GridBagConstraints();
            cons.gridx = 1;
            cons.gridy = 1;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 50;
            panelFormulario.add(tfNumero, cons);
            //Numero <---

            //Complemento --->
            //(2,1) lbComplemento
            cons = new GridBagConstraints();
            cons.gridx = 2;
            cons.gridy = 1;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbComplemento, cons);

            //(4,2) tfComplemento
            cons = new GridBagConstraints();
            cons.gridx = 3;
            cons.gridy = 1;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 50;
            panelFormulario.add(tfComplemento, cons);
            //Complemento <---

            //Bairro --->
            //(0,2) lbBairro
            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 2;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbBairro, cons);

            //(1,2) tfBairro
            cons = new GridBagConstraints();
            cons.gridx = 1;
            cons.gridy = 2;
            cons.gridwidth = 3;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 100;
            panelFormulario.add(tfBairro, cons);
            //Bairro <---

            //Cidade --->
            //(0,3) lbCidade
            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 3;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbCidade, cons);

            //(1,3) tfCidade
            cons = new GridBagConstraints();
            cons.gridx = 1;
            cons.gridy = 3;
            cons.gridwidth = 3;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 100;
            panelFormulario.add(tfCidade, cons);
            //Cidade <---

            //UF --->
            //(0,4) lbUF
            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 4;
            cons.gridwidth = 1;
            cons.fill = GridBagConstraints.HORIZONTAL;
            panelFormulario.add(lbUF, cons);

            //(1,4) cbUF
            cons = new GridBagConstraints();
            cons.gridx = 1;
            cons.gridy = 4;
            cons.gridwidth = 3;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipadx = 100;
            panelFormulario.add(cbUF, cons);
            //Cidade <---
            super.addFormulario(panelFormulario);
        }

        public JPanel getPanelFormulario() {
            return panelFormulario;
        }
    }
}
