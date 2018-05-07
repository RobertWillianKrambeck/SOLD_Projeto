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
    private JLabel lbFotoGeradeira;
    private JLabel lbFotoImpresora;
    private JLabel lbFotoTelefone;
    private JLabel lbFotoServico;
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
        
        lbFotoGeradeira = new JLabel();
        lbFotoGeradeira.setBorder(BorderFactory.createTitledBorder("Geladeira"));

        lbFotoImpresora = new JLabel();
        lbFotoImpresora.setBorder(BorderFactory.createTitledBorder("Impresora"));

        lbFotoTelefone = new JLabel();
        lbFotoTelefone.setBorder(BorderFactory.createTitledBorder("Telefone"));

        lbFotoServico = new JLabel();
        lbFotoServico.setBorder(BorderFactory.createTitledBorder("Serviço"));
        
        imagem = new Image();

        btnDarLance1 = new JButton("Discrição");
        btnDarLance2 = new JButton("Discrição");
        btnDarLance3 = new JButton("Discrição");
        btnDarLance4 = new JButton("Discrição");
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
        panelProdutos.add(lbFotoGeradeira, cons);

        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFotoImpresora, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFotoTelefone, cons);

        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(25, 5, 25, 5);
        panelProdutos.add(lbFotoServico, cons);

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
        lbFotoGeradeira.setIcon(imagem.getImageDestaqueGeladeira());
        lbFotoImpresora.setIcon(imagem.getImageDestaqueImpresora()); 
        lbFotoTelefone.setIcon(imagem.getImageDestaqueTelefone()); 
        lbFotoServico.setIcon(imagem.getImageDestaqueSemFoto());

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
