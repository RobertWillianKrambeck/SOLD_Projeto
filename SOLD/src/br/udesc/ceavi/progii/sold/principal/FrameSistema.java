package br.udesc.ceavi.progii.sold.principal;

import br.udesc.ceavi.progii.sold.imagens.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * Classe FrameSistema é o casco do sistema
 *
 * @author Gustavo de Carvalho Santos
 * @since 09/04/2018
 * @version 1.0
 */
public class FrameSistema extends JFrame {

    //Dimensão da tela principal
    private static Dimension dimensaoTelaPrincipal;

    //Dimensão do Cabeçario
    private Dimension dimensionCabecario;

    //Dimension do Rodapé
    private Dimension dimensionRodapé;

    //JPanel do Cabaçario
    private JPanel panelCabecario;

    //Jpanel Do rodapé
    private JPanel panelRodape;

    //Painel para adicionar as telas internas (JInternalFrame)
    private JDesktopPane desktop;

    //Container da tela principal
    private Container contentPane;

    //JPanel de Menu
    private JPanel panelMenu;

    //Barra de menu da aplicação
    private JMenuBar menuPrincipal;

    //Label do onde ficara o Logo
    private JLabel lbLogo;

    //Classe Image onde tem as imagens
    private Image imagem;

    //Cor
    private Color cor;

    //Panel Usuario
    private JPanel panelUsuario;

    //Constante ussada no layout
    private GridBagConstraints cons;

    private String usuario;

    /**
     * Construtor da classe Frame Sistema.
     */
    public FrameSistema() {
        super();

        //Define o título da tela principa
        super.setTitle("Sold - Tela Inicial");

        //Métodos responsáveis pela construção da GUI da tela principal
        initializeDesktopPane();
        initComponents();
        addComponents();
        //Define a dimensão da tela principal
        super.setSize(dimensaoTelaPrincipal);

        //Define alguns parâmentros para a GUI        
        super.setResizable(false);
        super.setLocationRelativeTo(null);

        //Encerra a thread da aplicação quando a tela principal for fechada
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Método responsável por criar o DesktopPanel da aplicação, onde serão
     * inseridas as telas internas da aplicação
     */
    private void initializeDesktopPane() {
        //Instancia o painel princpal da aplicação, onde as telas internas serão exibidas
        desktop = new JDesktopPane();

        //Pega o painel da JFrame
        contentPane = super.getContentPane();

        //Adiciona o desktopPanel no container da JPanel
        contentPane.add(desktop, BorderLayout.CENTER);
    }

    /**
     * Método responsável por adicionar o menu principal da aplicação.
     */
    private void adicionaMenuPrincipal() {
        //Instancia do JPanel onde ficar o menu
        panelMenu = new JPanel();

        //Instancia a barra de menus
        menuPrincipal = new MenuPrincipal(this);
        Dimension menuTamanho = new Dimension(400, 30);
        //Personalização Panel de Menu
        panelMenu.setPreferredSize(menuTamanho);
        panelMenu.setSize(menuTamanho);
        panelMenu.setMaximumSize(menuTamanho);
        panelMenu.setMinimumSize(menuTamanho);
        panelMenu.setBackground(cor);

        //adiciona a barra de menu na panelMenu
        panelMenu.add(menuPrincipal);

        //Add o Panel de Menu ao Cabeçario
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.BOTH;
//        cons.insets = new Insets(5, 0, 0, 5);
        panelCabecario.add(panelMenu, cons);

    }

    /**
     * Método que adiciona um JInternalFrame na tela principal da aplicação
     *
     * @param frame JInternalFrame a ser adicionado na aplicação.
     */
    public void adicionarFrameInterno(JInternalFrame frame) {
        //Insere a instância de um JInternalFrame no DesktopPanel da aplicação
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null); //retirar o painel superior
        frame.setBorder(null);
        desktop.add(frame, BorderLayout.BEFORE_FIRST_LINE);
    }

    /**
     * Método que cria as instância de alguns elementos
     */
    private void initComponents() {
        //Instancia da class imagem
        imagem = new Image();

        //Cria uma instâncioa do JPanel panelCabecario e defime um tamanho
        panelCabecario = new JPanel();
        dimensionCabecario = new Dimension(this.contentPane.getWidth(), 135);
        panelCabecario.setPreferredSize(dimensionCabecario);

        //Cria uma instâncioa do JPanel panelRodape e defime um tamanho
        panelRodape = new JPanel();
        dimensionRodapé = new Dimension(this.contentPane.getWidth(), 60);
        panelRodape.setPreferredSize(dimensionRodapé);

        //Instancia de JLabel e ImageIcon e set a imagem
        lbLogo = new JLabel();
        //Set Imagem do logo
        lbLogo.setIcon(imagem.getImageLogo());

        //Definição do Tamanho da TelaPrincipal
        dimensaoTelaPrincipal = new Dimension(800, 654);

        //Instancia do JPanel de Usuario
        panelUsuario = new JPanel();
        panelUsuario.setPreferredSize(new Dimension(155, 80));
        panelUsuario.setBackground(cor);
        BorderFactory border;
        usuario = "Gustavo";
        cor = new Color(255, 255, 255);
        panelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, usuario,
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 11), cor));
    }

    /**
     * Método que Adiciona os elementos no panelCabecario e depois no
     * ContentPane
     */
    private void addComponents() {
        //Definição do Layout de Cabeçario como GridBagLayout
        panelCabecario.setLayout(new GridBagLayout());
        /**
         * Add os elementos ao Cabeçario Add os elementos ao Cabeçario Add os
         * elementos ao Cabeçario
         */
        //Add o Logo ao Cabeçario
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.insets = new Insets(0, -125, 0, 0);
        panelCabecario.add(lbLogo, cons);

        //Add O Panel De Usuario
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 0;
        cons.insets = new Insets(0, 0, -20, -170);
        cons.anchor = GridBagConstraints.NORTHEAST;
        panelCabecario.add(panelUsuario, cons);

        //Cor do Cabecario
        cor = new Color(24, 24, 24);
        panelCabecario.setBackground(cor);
        //Add o Cabeçario ao contener da Classe
        contentPane.add(panelCabecario, BorderLayout.PAGE_START);

        //Cor do Rodapé
        panelRodape.setBackground(cor);
        //Add o Rodape ao contener da Classe
        contentPane.add(panelRodape, BorderLayout.SOUTH);
        adicionaMenuPrincipal();
    }
}
