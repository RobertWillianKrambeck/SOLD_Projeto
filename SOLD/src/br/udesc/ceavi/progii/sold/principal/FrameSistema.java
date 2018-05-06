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
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * Esta é a tela principal da aplicação
 *
 * @author Gustavo de Carvalho Santos
 * @version 1.0
 * @since 09/04/2018
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

    //TextFild para a barra de pesquisa
    private JTextField tfBarraDePesquisa;

    //Cor
    private Color cor;

    //Butão Busca
    private JLabel btBusca;

    //Constante ussada no layout
    GridBagConstraints cons;

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
        adicionaMenuPrincipal();
        addComponents();
        personalizarComponents();

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

        //adiciona a barra de menu na panelMenu
        panelMenu.add(menuPrincipal);

        //Add o Panel de Menu ao Cabeçario
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 10;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(5, 0, 0, 5);
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

        //Instancia da "Barra de Busca"
        tfBarraDePesquisa = new JTextField();

        //Definição do Tamanho da TelaPrincipal
        dimensaoTelaPrincipal = new Dimension(800, 654);

        //Instancia do Butao de Busca;
        btBusca = new JLabel();

        //Instancia da class imagem
        imagem = new Image();
    }

    /**
     * Método que Adiciona os elementos no panelCabecario e depois no
     * ContentPane
     */
    private void addComponents() {
        //Definição do Layout de Cabeçario como GridBagLayout
        panelCabecario.setLayout(new GridBagLayout());
        //Add os elementos ao Cabeçario

        //Add o Logo ao Cabeçario
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        panelCabecario.add(lbLogo, cons);

        //Add A Barra de Pesquisa ao Cabeçario
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        panelCabecario.add(tfBarraDePesquisa, cons);

        //Add o butao de Busca ao Cabeçario
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 0;
        panelCabecario.add(btBusca, cons);

        //Add o Cabeçario ao contener da Classe
        contentPane.add(panelCabecario, BorderLayout.PAGE_START);

        //Add o Rodape ao contener da Classe
        contentPane.add(panelRodape, BorderLayout.SOUTH);
    }

    /**
     * Este metodo tem como objetivo personalizar os compomentes
     */
    private void personalizarComponents() {
        //Cor,Borda e tamanho da Barra de Busca
        cor = new Color(250, 226, 110);
        tfBarraDePesquisa.setBorder(BorderFactory.createLineBorder(cor, 4));
        tfBarraDePesquisa.setPreferredSize(new Dimension(450, 27));
        //Cor do Cabecario
        cor = new Color(24, 24, 24);
        panelCabecario.setBackground(cor);
        //Cor do Rodapé
        panelRodape.setBackground(cor);

        //Set Imagem do logo
        lbLogo.setIcon(imagem.getImageLogo());

        //Add Icone ao Butao de Busca
        btBusca.setIcon(imagem.getImageIcon());
        
        //Personalização Panel de Menu
        panelMenu.setPreferredSize(new Dimension(WIDTH, 40));
        panelMenu.setBackground(cor);
        panelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }
}
