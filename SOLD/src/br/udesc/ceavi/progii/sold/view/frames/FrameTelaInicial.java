/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.listeners.FrameTelaInicialListener;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class FrameTelaInicial extends JInternalFramelModelo {

    private Label lbBemVindo;
    private JButton jbRegistrar;
    private JButton jbAcessar;

    private Dimension dimensionButao;

    private JPanel panelFormulario;
    private LayoutManager layout;
    private GridBagConstraints cons;
    
    private FrameSistema frameSistema;

    public FrameTelaInicial(Dimension dimension, FrameSistema frameSistema) {
        super(dimension,frameSistema);
        this.frameSistema = frameSistema;
        initComponents();
        personalizeComponents();
        addComponents();
        adicionarListenersTelaInicial();
    }

    private void initComponents() {
        lbBemVindo = new Label();
        jbRegistrar = new JButton();
        jbAcessar = new JButton();
        panelFormulario = new JPanel();
        layout = new GridBagLayout();
        dimensionButao = new Dimension();
    }

    private void addComponents() {
        //Label Bem Vindo >>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipady = 50;
        panelFormulario.add(lbBemVindo, cons);
        //Label Bem Vindo <<<<

        //Butao de Registra >>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(jbRegistrar, cons);
        //Butao de Registra <<<<

        //Butao de Acessar >>>>
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(0, 145, 0, 0);
        panelFormulario.add(jbAcessar, cons);
        //Butao de Acessar <<<<

        super.addFormulario(panelFormulario);
    }

    private void personalizeComponents() {
        lbBemVindo.setText("Bem Vindo");
        Font font = new Font("Arial", 1, 75);
        Color cor = new Color(0, 0, 20);
        lbBemVindo.setFont(font);
        lbBemVindo.setForeground(cor);

        dimensionButao.setSize(125, 35);
        jbRegistrar.setText("Registrar");
        jbRegistrar.setPreferredSize(dimensionButao);

        jbAcessar.setText("Login");
        jbAcessar.setPreferredSize(dimensionButao);
        panelFormulario.setLayout(layout);
    }
    
    public void adicionarListenersTelaInicial(){
        FrameTelaInicialListener listener = new FrameTelaInicialListener(frameSistema, this);
    }

    public JButton getJbRegistrar() {
        return jbRegistrar;
    }

    public JButton getJbAcessar() {
        return jbAcessar;
    }

    
}
