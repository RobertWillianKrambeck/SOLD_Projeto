package br.udesc.ceavi.progii.sold.view.painels;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Esta classe define o painel para as funcionalidades CRUD para as telas de registro
 *
 * @author Gustavo de Carvalho Santos
 * @version 1.0
 * @since 09/04/2018
 */
public class CRUDActionRegistroPanel extends JPanel {

    //Botões para as funcionalidades CRUD
    private JButton btCancelar;
    private JButton btProximo;
    private JButton btAnterior;

    //Gerenciador de Layout 
    private LayoutManager layout;

    //Dimensão do painel
    private Dimension dimensaoBotao;

    //Dimensão padrão para os botões
    private Dimension dimensaoPainel;

    //Container onde o Painel será adicionado
    private Container parent;

    /**
     * Construtor do painel para o funcionamento dos formulários tipo CRUD
     *
     * @param parent Container onde o painel de botões deverá ser inserido
     */
    public CRUDActionRegistroPanel(Container parent) {
        //Define o parent
        this.parent = parent;

        //Constrói o panel com os botões
        initComponents();
        addComponents();

        //Parametrização do JPanel
        super.setVisible(true);
        super.setSize(dimensaoPainel);
    }

    /**
     * Método responsável pela instanciação dos objetos utilizados no JPanel
     */
    private void initComponents() {
        //Define o tamanho padrão para os botẽos do formulário
        dimensaoBotao = new Dimension(100, 20);

        //Define a dimensão do JPanel com base na largura definida no parent
        dimensaoPainel = new Dimension(parent.getWidth(), 30);

        //Define o gerenciador de layout para o JPanel
        layout = new FlowLayout(FlowLayout.CENTER);

        //Define o botão Cancelar
        btCancelar = new JButton("Cancelar");
        btCancelar.setSize(dimensaoBotao);

        //Define o botão Proximo
        btProximo = new JButton("Proximo");
        btProximo.setSize(dimensaoBotao);

        //Define o botão Anterior
        btAnterior = new JButton("Anterior");
        btAnterior.setSize(dimensaoBotao);
    }

    /**
     * Método para adicionar os componentes no JPanel
     */
    private void addComponents() {
        //Define o gerenciador de layout
        this.setLayout(layout);

        //adiciona os botões no JPanel
        this.add(btAnterior);
        this.add(btProximo);
        this.add(btCancelar);
    }

    /**
     * Método que retorna o Botão Cancelar do painel CRUD
     *
     * @return JButton para a funcionalidade Cancelar
     */
    public JButton getBtCancelar() {
        return btCancelar;
    }

    /**
     * Método que retorna o Botão Proximo do painel CRUD
     *
     * @return JButton para a funcionalidade Proximo
     */
    public JButton getBtProximo() {
        return btProximo;
    }

    /**
     * Método que retorna o Botão Anterior do painel CRUD
     *
     * @return JButton para a funcionalidade Anterior
     */
    public JButton getBtAnterior() {
        return btAnterior;
    }

}
