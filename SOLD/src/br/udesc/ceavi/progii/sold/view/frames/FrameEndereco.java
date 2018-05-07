package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.modelo.Estado;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Esta classe é o molde do Frame Endereco
 *
 * @author Gustavo
 * @since 20/04/2018
 * @version 2.0
 */
public class FrameEndereco {

    private JInternalFrame frameInternoPrincipal;
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

    private LayoutManager layout;

    private GridBagConstraints cons;
    //

    public FrameEndereco() {

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
        frameInternoPrincipal = new JInternalFrame();
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
        frameInternoPrincipal.setLayout(layout);
    }

    private void addComponents() {
        //Cep --->
        //(0,0) lbCep
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbCep, cons);

        //(1,0) tfCep
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        frameInternoPrincipal.add(tfCep, cons);
        //Cep <---

        //Logradouro --->
        //(2,0) lbLogradouro
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbLogradouro, cons);

        //(3,0) lbLogradouro
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        frameInternoPrincipal.add(tfLogradouro, cons);
        //Logradouro <---

        //Numero --->
        //(0,1) lbNumero
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbNumero, cons);

        //(1,1) tfNumero
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        frameInternoPrincipal.add(tfNumero, cons);
        //Numero <---

        //Complemento --->
        //(2,1) lbComplemento
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbComplemento, cons);

        //(4,2) tfComplemento
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        frameInternoPrincipal.add(tfComplemento, cons);
        //Complemento <---

        //Bairro --->
        //(0,2) lbBairro
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbBairro, cons);

        //(1,2) tfBairro
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 100;
        frameInternoPrincipal.add(tfBairro, cons);
        //Bairro <---

        //Cidade --->
        //(0,3) lbCidade
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbCidade, cons);

        //(1,3) tfCidade
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 100;
        frameInternoPrincipal.add(tfCidade, cons);
        //Cidade <---

        //UF --->
        //(0,4) lbUF
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        frameInternoPrincipal.add(lbUF, cons);

        //(1,4) cbUF
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 4;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 100;
        frameInternoPrincipal.add(cbUF, cons);
        //Cidade <---
    }

    public JInternalFrame getFrameInternoPrincipal() {
        return frameInternoPrincipal;
    }
}
