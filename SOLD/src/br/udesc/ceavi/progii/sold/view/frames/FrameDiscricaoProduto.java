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
 * @version 1.1
 */
public class FrameDiscricaoProduto extends JInternalFramelModelo {

    private JButton btnIrParaLeilao;
    private JButton btnVoltar;
    private JPanel panelFormulario;
    private JLabel lbNomeProduto;
    private JLabel lbPreco;
    private JTextField tfDescricaoProduto;
    private LayoutManager layout;
    private GridBagConstraints cons;

    public FrameDiscricaoProduto(Dimension dimension, FrameSistema frameSistema) {
        super(dimension, frameSistema);
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
        btnVoltar = new JButton();
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
        tfDescricaoProduto.setFont(font);
        tfDescricaoProduto.setText("Descrição do Produto");

        //Personalização do butao lance
        btnIrParaLeilao.setText("IR Para Leilão");

        //Personalização Panel Formulario
        panelFormulario.setLayout(layout);
        tfDescricaoProduto.setEditable(false);

        //Personalização do butao voltar
        btnVoltar.setText("<<<Voltar");
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(0, 86, 0, 0);
        panelFormulario.add(lbNomeProduto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 6;
        cons.gridy = 0;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbPreco, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 13;
        cons.ipadx = 650;
        cons.ipady = 200;
        cons.insets = new Insets(0, 20, 0, 20);
        panelFormulario.add(tfDescricaoProduto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 11;
        cons.gridy = 13;
        cons.insets = new Insets(5, 75, 0, 0);
        panelFormulario.add(btnIrParaLeilao, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 13;
        cons.insets = new Insets(5, -300, 0, 0);
        panelFormulario.add(btnVoltar, cons);
    }

    public JButton getBtnIrParaLeilao() {
        return btnIrParaLeilao;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }
    
}
