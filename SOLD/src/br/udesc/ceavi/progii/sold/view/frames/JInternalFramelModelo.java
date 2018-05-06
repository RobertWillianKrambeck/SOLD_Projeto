package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.view.painels.CRUDActionPanel;
import br.udesc.ceavi.progii.sold.view.painels.CRUDActionRegistroPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 * Esta classe define o JInternalFrame padrão para telas do tipo CRUDRegistro
 *
 * @author Gustavo de Carvalho Santos
 * @version 1.0
 * @since 09/04/2018
 *
 */
public abstract class JInternalFramelModelo extends JInternalFrame {

    //O titulo da Tela
    private static String titulo = "Sold - Tela Inicial";
    //Dimension do panelPrincipal;
    private Dimension dimension;
    //Layout do panel Principal
    private LayoutManager layout;
    //Classes que retonaram os botoes de Registro
    private CRUDActionRegistroPanel botoesDeRegistro;
    //Classes que retonaram os botoes de Açao
    private CRUDActionPanel botoesDeAction;
    //JPanel principal do JInternalFrame, que será utilizado como container dos demais componetes
    private JPanel panelPrincipal;
    //JPanel para add os BotoesCRUD
    private JPanel panelBotoesCRUD;

    /**
     * Contrutor da Classe FrameCRUDModelo
     *
     * @param dimension
     */
    public JInternalFramelModelo(Dimension dimension) {
        /**
         * O Codigo a baixo serve para definir o tamanho, tal tamanho basea-se
         * na lagura da tela onde esse serar add. Por isso Recebe-se as
         * dimenções e usa-se essas para definir a dimension da classe
         */
        this.dimension = new Dimension((int) (dimension.getWidth() - 6), 430);
        super.setSize(this.dimension);
       
        //Definição do Layout
        super.setLayout(layout);

        initializeComponets();
        addComponets();

        //Torna a tela Visivel
        super.setVisible(true);
    }

    /**
     * Método que istancia os objetos que serão utilizados na JInternalFrame
     */
    private void initializeComponets() {
        //Define o painel principla da tela
        panelPrincipal = new JPanel();
        panelPrincipal.setSize(this.dimension);
        //Define o gerenciador de layout
        layout = new BorderLayout();
        panelPrincipal.setLayout(layout);
        botoesDeAction = new CRUDActionPanel(this);
        botoesDeRegistro = new CRUDActionRegistroPanel(this);
    }

    /**
     * Método que permite inserir um painel contendo os campos do formulário na
     * JInternalFrame
     *
     * @param container Panel que deverá ser adiconado
     */
    public void addFormulario(Container container) {
        //Adiciona o container na posiçõa central do formulário
        panelPrincipal.add(container, BorderLayout.CENTER);
    }
    private void addComponets() {

        this.add(panelPrincipal);
    }

    public void addBotoesDeRegistro() {
        this.setContentPane(panelPrincipal);
        panelBotoesCRUD = new CRUDActionRegistroPanel(this);
        panelPrincipal.add(panelBotoesCRUD, BorderLayout.SOUTH);
    }
    
    public void addBotoesDeAcao() {
        this.setContentPane(panelPrincipal);
        panelBotoesCRUD = new CRUDActionPanel(this);
        panelPrincipal.add(panelBotoesCRUD, BorderLayout.SOUTH);
    }
}
