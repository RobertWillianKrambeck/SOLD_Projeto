/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.listeners.FrameDiscricaoProdutoListeners;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Esta Tela é onde sera visivel o produto e sua discrição
 *
 * @author Everton Cezar e Gustavo Santos
 * @since 19/04/2018
 * @version 1.0
 */
public class FrameDiscricaoProduto extends JInternalFramelModelo {

    private JButton btnIrParaLeilao;
    private JPanel panelFormulario;
    private JLabel lbNomeProduto;
    private JLabel lbPreco;
    private JTextField tfDescricaoProduto;
    private LayoutManager layout;
    private GridBagConstraints cons;
    
    public FrameDiscricaoProduto(Dimension dimension,FrameSistema frameSistema) {
        super(dimension,frameSistema);
        initComponents();
        personalizeComponents();
        addComponents();
        FrameDiscricaoProdutoListeners listeners = new FrameDiscricaoProdutoListeners(frameSistema, this);
        super.addFormulario(panelFormulario);
    }

    private void initComponents() {
        panelFormulario = new JPanel();
        lbNomeProduto = new JLabel();
        lbPreco = new JLabel();
        btnIrParaLeilao = new JButton();
        tfDescricaoProduto = new JTextField();
        layout = new GridBagLayout();
    }

    private void personalizeComponents() {
        //Personalização da Labe Nome Produto
        Font font = new Font("Tahoma", 0, 24);
        lbNomeProduto.setFont(font);
        lbNomeProduto.setText("<<Nome do Produto>>");

        //Personalização da Label Preço
        lbPreco.setFont(font);
        lbPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPreco.setText("<<Preço>>");

        //Personalização da TextF Preço
        tfDescricaoProduto.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        tfDescricaoProduto.setText("Descrição do Produto");

        //Personalização do butao lance
        btnIrParaLeilao.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        btnIrParaLeilao.setText("IR Para Leilão");
        //Personalização Panel Formulario
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 5;
        cons.ipady = 39;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(86, 44, 0, 0);
        panelFormulario.add(lbNomeProduto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 7;
        cons.gridy = 4;
        cons.gridwidth = 7;
        cons.ipadx = 2;
        cons.ipady = 39;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(86, 57, 0, 0);
        panelFormulario.add(lbPreco, cons);

        cons = new GridBagConstraints();
        cons.gridx = 12;
        cons.gridy = 6;
        cons.gridwidth = 7;
        cons.ipadx = 35;
        cons.ipady = 21;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(18, 82, 100, 0);
        panelFormulario.add(btnIrParaLeilao, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 5;
        cons.gridwidth = 14;
        cons.ipadx = 837;
        cons.ipady = 223;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(18, 44, 0, 0);
        panelFormulario.add(tfDescricaoProduto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.BOTH;
        getContentPane().add(panelFormulario, cons);
    }

    public JButton getBtnIrParaLeilao() {
        return btnIrParaLeilao;
    }

}
