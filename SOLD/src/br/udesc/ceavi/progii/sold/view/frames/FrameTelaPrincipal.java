package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.imagens.Image;
import br.udesc.ceavi.progii.sold.listeners.FrameTelaPrincipalListeneres;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta Classe é o modelo da tela principal
 *
 * @author Gustavo
 * @version 1.0
 * @since 23/04/2018
 */
public class FrameTelaPrincipal extends JInternalFramelModelo {

    private JButton btnDarLance1;
    private JButton btnDarLance2;
    private JButton btnDarLance3;
    private JButton btnDarLance4;
    private JLabel lbDestaqueTitulo;
    private JLabel lbFoto1;
    private JLabel lbFoto2;
    private JLabel lbFoto3;
    private JLabel lbFoto4;
    private JLabel lbFundo;
    private JLabel lbPagamento;
    private JPanel panelDestaque;
    private JPanel panelFormulario;
    private JPanel panelProdutos;
    private GridBagConstraints cons;
    private Image imagem;

    public FrameTelaPrincipal(Dimension dimension, FrameSistema frameSistema) {
        super(dimension, frameSistema);
        initComponets();
        addComponets();
        setImagem();
        FrameTelaPrincipalListeneres listener = new FrameTelaPrincipalListeneres(frameSistema, this);
        super.addFormulario(panelFormulario);
    }

    private void initComponets() {
        panelFormulario = new JPanel();
        panelDestaque = new JPanel();
        lbDestaqueTitulo = new JLabel("Destaques");
        lbFundo = new JLabel();
        panelProdutos = new JPanel();
        lbFoto1 = new JLabel();
        lbFoto1.setBorder(BorderFactory.createTitledBorder("Telefone"));

        lbFoto2 = new JLabel();
        lbFoto2.setBorder(BorderFactory.createTitledBorder("Geladeira"));

        lbFoto3 = new JLabel();
        lbFoto3.setBorder(BorderFactory.createTitledBorder("Impresora"));

        lbFoto4 = new JLabel();
        lbFoto4.setBorder(BorderFactory.createTitledBorder("Serviço"));
        
        imagem = new Image();

        btnDarLance1 = new JButton("Dar Lance");
        btnDarLance2 = new JButton("Dar Lance");
        btnDarLance3 = new JButton("Dar Lance");
        btnDarLance4 = new JButton("Dar Lance");
        lbPagamento = new JLabel("Aceitamos Cartão e Boleto Bancario");

        panelFormulario.setLayout(new GridBagLayout());
        panelFormulario.setLayout(new GridBagLayout());
        panelDestaque.setBorder(BorderFactory.createEtchedBorder());
        panelDestaque.setLayout(new GridBagLayout());
    }

    private void addComponets() {
        panelDestaque.add(lbDestaqueTitulo, new GridBagConstraints());
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.NORTHEAST;
        panelDestaque.add(lbFundo, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.BOTH;
        cons.ipadx = 400;
        cons.ipady = 75;
        cons.insets = new Insets(0, 40, 50, 40);
        panelFormulario.add(panelDestaque, cons);

        panelProdutos.setBorder(BorderFactory.createEtchedBorder());
        panelProdutos.setLayout(new GridBagLayout());

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFoto1, cons);

        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFoto2, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFoto3, cons);

        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFoto4, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        panelProdutos.add(btnDarLance1, cons);

        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 1;
        panelProdutos.add(btnDarLance2, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 1;
        panelProdutos.add(btnDarLance3, cons);

        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 1;
        panelProdutos.add(btnDarLance4, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.BOTH;
        panelFormulario.add(panelProdutos, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(lbPagamento, cons);
    }

    private void setImagem() {
        lbFoto1.setIcon(imagem.getImageDestaqueGeladeira());
        lbFoto2.setIcon(imagem.getImageDestaqueImpresora()); 
        lbFoto3.setIcon(imagem.getImageDestaqueSemFoto()); 
        lbFoto4.setIcon(imagem.getImageDestaqueTelefone());

    }

    public JButton getBtnDarLance1() {
        return btnDarLance1;
    }

    public JButton getBtnDarLance2() {
        return btnDarLance2;
    }

    public JButton getBtnDarLance3() {
        return btnDarLance3;
    }

    public JButton getBtnDarLance4() {
        return btnDarLance4;
    }

}
