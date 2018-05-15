/**
 * Tarefas:
 * 1) Valor de Pacote modificar conforme os beneficios
 */

package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.listeners.FrameCadastro2Listeners;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * Esta classe é o modelo de JInternalFrame da Primeira Tela de Cadastro
 *
 * @author Gustavo Santos
 * @version 2.0
 * @see 05/05/2018
 */
public class FrameCadastro2 extends JInternalFramelModelo {

    private ButtonGroup grupoDeRB;
    private JLabel lbID;
    private JLabel lbIDMostrar;
    private JLabel lbNomeUsu;

    private JLabel lbTipoUssuario;
    private JPanel panelFormulario;
    private JPanel panelTipoUsuario;
    private JRadioButton rbUsuarioProfi;
    private JRadioButton rbUsuarioNormal;
    private GridBagConstraints cons;
    private LayoutManager layout;
    private TipoCliente tipoCliente;
    private JLabel lbNomeUsuMostrar;
    private Font font;
    private FrameCadastro2Listeners listenrsDaClasse;

    public FrameCadastro2(Dimension dimension, FrameSistema frameSistema, FrameCadastro1 frameCadastro1) {
        super(dimension, frameSistema);
        initComponents();
        personalize();
        addComponents();
        listenrsDaClasse = new FrameCadastro2Listeners(frameSistema,
                this, frameCadastro1);
        super.addBotoesDeAcao();
        super.addFormulario(panelFormulario);
    }

    private void addComponents() {
        lbNomeUsu.setText("Nome Do Usuario:");
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.ipadx = 31;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(31, 39, 0, 0);
        panelFormulario.add(lbNomeUsu, cons);

        lbNomeUsuMostrar.setText("<<Nome Aqui>>");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.ipadx = 80;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(31, 0, 0, 0);
        panelFormulario.add(lbNomeUsuMostrar, cons);

        lbID.setText("ID:");
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.ipadx = 102;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(0, 39, 0, 0);
        panelFormulario.add(lbID, cons);

        lbIDMostrar.setText("<<ID Aqui>>");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.ipadx = 96;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbIDMostrar, cons);

        lbTipoUssuario.setText("Tipo de Usuario:");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 3;
        cons.ipadx = 148;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(30, 0, 0, 0);
        panelFormulario.add(lbTipoUssuario, cons);

        grupoDeRB.add(rbUsuarioNormal);
        rbUsuarioNormal.setText("USUÁRIO PADRÃO");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(7, 64, 0, 0);
        panelFormulario.add(rbUsuarioNormal, cons);

        grupoDeRB.add(rbUsuarioProfi);
        rbUsuarioProfi.setText("USUÁRIO PARA PROFISSÃO");
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 3;
        cons.gridwidth = 4;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(7, 0, 0, 0);
        panelFormulario.add(rbUsuarioProfi, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 8;
        cons.ipadx = 509;
        cons.ipady = 185;
        cons.insets = new Insets(18, 120, 36, 120);
        panelFormulario.add(panelTipoUsuario, cons);
    }

    private void personalize() {
        font = new Font("Tahoma", 1, 14);
        lbTipoUssuario.setFont(font);
        panelTipoUsuario.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        panelFormulario.setLayout(layout);
        panelTipoUsuario.setMaximumSize(new Dimension(20, 20));
        panelTipoUsuario.setMinimumSize(new Dimension(20, 20));
        panelTipoUsuario.setPreferredSize(new Dimension(20, 20));
        panelTipoUsuario.setLayout(new GridLayout(1, 3));
        //Modifica o Conteudo do Bt Proximo para Concluir
        getBotoesDeAction().getBtProximo().setText("Concluir");
    }

    private void initComponents() {
        panelFormulario = new JPanel();
        layout = new GridBagLayout();
        grupoDeRB = new ButtonGroup();
        lbNomeUsu = new JLabel();
        lbNomeUsuMostrar = new JLabel();
        lbID = new JLabel();
        lbIDMostrar = new JLabel();
        lbTipoUssuario = new JLabel();
        rbUsuarioNormal = new JRadioButton();
        rbUsuarioProfi = new JRadioButton();
        panelTipoUsuario = new JPanel();
        tipoCliente = new TipoCliente();
    }

    /**
     * Esta classe interna serve para modificar o Panel do Tipo Endereco Ela
     * controi um JInternalFrame
     *
     * @author Gustavo
     * @since 20/04/2018
     * @version 2.0
     */
    public class TipoCliente extends JInternalFrame {

        //Usuario Simples
        private JButton btnPremiun;
        private JButton btnFree;
        private JButton btnOutros;

        //Atributos de beneficios
        private JPanel panelBeneficios;

        private JRadioButton beneficioFree1;
        private JRadioButton beneficioPremium1;
        private ButtonGroup beneficio1;
        private JRadioButton beneficioFree2;
        private JRadioButton beneficioPremium2;
        private ButtonGroup beneficio2;
        private JRadioButton beneficioFree3;
        private JRadioButton beneficioPremium3;
        private ButtonGroup beneficio3;
        //Tem como objetivo modificar o estado de seleção dos beneficios
        public boolean beneficiosSelecionaveis = true;

        //Usuario Proficional
        private JLabel lbNDaCarteira;
        private JLabel lbDiscricao;
        private JTextArea tfDiscricao;
        private JTextField tfNDaCarteira;
        private GridBagConstraints cons;

        public TipoCliente() {
        }

        public void initComponentsClienteProfi() {
            tipoCliente = new TipoCliente();
            lbDiscricao = new JLabel("Discrição");
            lbNDaCarteira = new JLabel("Carteira de Trabalho");
            tfDiscricao = new JTextArea();
            tfNDaCarteira = new JTextField();

            this.setLayout(new GridBagLayout());

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 0;
            cons.insets = new Insets(10, 10, 0, 10);
            this.add(lbNDaCarteira, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 2;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.insets = new Insets(0, 10, 0, 0);
            this.add(tfNDaCarteira, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 3;
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.insets = new Insets(10, 10, 0, 0);
            this.add(lbDiscricao, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 4;
            cons.gridwidth = 2;
            cons.weightx = 1;
            cons.insets = new Insets(10, 10, 25, 10);
            cons.fill = GridBagConstraints.HORIZONTAL;
            Dimension dime = new Dimension(50, 90);
            tfDiscricao.setPreferredSize(dime);
            tfDiscricao.setSize(dime);
            tfDiscricao.setMaximumSize(dime);
            tfDiscricao.setMinimumSize(dime);
            this.add(tfDiscricao, cons);
            setPanelTipoUsuario(this);
        }

        public void initComponentsClienteNormal() {
            tipoCliente = new TipoCliente();
            this.setLayout(new GridBagLayout());
            btnFree = new JButton("Free");
            btnPremiun = new JButton("Premium");
            btnOutros = new JButton("Outros Tipos");

            panelBeneficios = new JPanel(new GridLayout(3, 2));
            font = new Font("Times New Roman", 1, 20);
            //Grupo 1 de Beneficio
            beneficio1 = new ButtonGroup();
            beneficioFree1 = new JRadioButton("Benefício Free");
            beneficioFree1.setFont(font);
            beneficioPremium1 = new JRadioButton("Benefício Premium");
            beneficioPremium1.setFont(font);
            beneficio1.add(beneficioFree1);
            beneficio1.add(beneficioPremium1);

            //Grupo 2 de Beneficio
            beneficio2 = new ButtonGroup();
            beneficioFree2 = new JRadioButton("Benefício Free");
            beneficioFree2.setFont(font);
            beneficioPremium2 = new JRadioButton("Benefício Premium");
            beneficioPremium2.setFont(font);
            beneficio2.add(beneficioFree2);
            beneficio2.add(beneficioPremium2);

            //Grupo 3 de Beneficio
            beneficio3 = new ButtonGroup();
            beneficioFree3 = new JRadioButton("Benefício Free");
            beneficioFree3.setFont(font);
            beneficioPremium3 = new JRadioButton("Benefício Premium");
            beneficioPremium3.setFont(font);
            beneficio3.add(beneficioFree3);
            beneficio3.add(beneficioPremium3);

            //Add os beneficios ao panelBeneficio
            panelBeneficios.add(beneficioFree1);
            panelBeneficios.add(beneficioPremium1);
            panelBeneficios.add(beneficioFree2);
            panelBeneficios.add(beneficioPremium2);
            panelBeneficios.add(beneficioFree3);
            panelBeneficios.add(beneficioPremium3);

            //Colocanco no JIntenoFrame
            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 0;
            cons.ipadx = 50;
            cons.ipady = 15;
            this.add(btnFree, cons);

            cons = new GridBagConstraints();
            cons.gridx = 1;
            cons.gridy = 0;
            cons.ipadx = 50;
            cons.ipady = 15;
            this.add(btnPremiun, cons);

            cons = new GridBagConstraints();
            cons.gridx = 2;
            cons.gridy = 0;
            cons.ipadx = 50;
            cons.ipady = 15;
            this.add(btnOutros, cons);

            cons = new GridBagConstraints();
            cons.gridx = 0;
            cons.gridy = 1;
            cons.gridwidth = 3;
            cons.insets = new Insets(15, 0, 0, 0);
            this.add(panelBeneficios, cons);
            setPanelTipoUsuario(this);
            addGrudListenersRadioButtonPacotes();
        }

        /**
         * Este metodo tem como objetivo mudar o estado de selecionabilidade dos
         * beneficios
         *
         * @param aux este inteiro permitarir o metodo saber qual ação tomar 0
         * tornar dos os beneficos não selecionaveis 1 tornar dos os beneficos
         * selecionaveis
         *
         * Estrutura 
         * 1) o metodo recebe e "avalia" o parametro recebido, tal 
         * avaliação esta a CIMA !!!Feito!!!
         * 2) o metodo muda o estado de selecao dos beneficios !!!Feito!!!
         */
        private void beneficiosSelecionaveis(int aux) {
            if (aux == 0 && beneficiosSelecionaveis) {
                beneficiosSelecionaveis = false;
                beneficioFree1.setEnabled(beneficiosSelecionaveis);
                beneficioFree2.setEnabled(beneficiosSelecionaveis);
                beneficioFree3.setEnabled(beneficiosSelecionaveis);
                beneficioPremium1.setEnabled(beneficiosSelecionaveis);
                beneficioPremium2.setEnabled(beneficiosSelecionaveis);
                beneficioPremium3.setEnabled(beneficiosSelecionaveis);
            } else if (aux == 1 && !beneficiosSelecionaveis) {
                beneficiosSelecionaveis = true;
                beneficioFree1.setEnabled(beneficiosSelecionaveis);
                beneficioFree2.setEnabled(beneficiosSelecionaveis);
                beneficioFree3.setEnabled(beneficiosSelecionaveis);
                beneficioPremium1.setEnabled(beneficiosSelecionaveis);
                beneficioPremium2.setEnabled(beneficiosSelecionaveis);
                beneficioPremium3.setEnabled(beneficiosSelecionaveis);
            }
        }

        /**
         * Este metodo tem como objetivo atribuir açoes de clique aos botoes dos
         * pacotes! 1) Tornar todos os radios button ineditaveis, isso se deve
         * ao fato do pacote vai decidir os beneficios !!!Feito!!! 2) atributir
         * as açoes aos repetivos butoes !!!Feito!!!
         */
        public void addGrudListenersRadioButtonPacotes() {
            beneficiosSelecionaveis(0);
            JButton btn;
            btn = btnFree;
            btn.addActionListener(new tipoClienteActionListenerFreePackage());
            btn = btnPremiun;
            btn.addActionListener(new tipoClienteActionListenerPremiunPackage());
            btn = btnOutros;
            btn.addActionListener(new tipoClienteActionListenerOutrosPackage());
        }

        /**
         * Este metodo é a açao do butao Premium 1) Tornar apenas o butao
         * premium desativado !!!Feito!!! 2) Setar os beneficios do pacote
         * premium !!!Feito!!! 3) Manter a não selecionabilidade do beneficios
         */
        private class tipoClienteActionListenerPremiunPackage implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                beneficiosSelecionaveis(0);
                btnPremiun.setEnabled(false);
                btnOutros.setEnabled(true);
                btnFree.setEnabled(true);
                beneficioPremium1.setSelected(true);
                beneficioPremium2.setSelected(true);
                beneficioPremium3.setSelected(true);
            }
        }

        /**
         * Este metodo é a açao do butao Outros 1) Tornar apenas o butao Outros
         * desativado !!!Feito!!! 2) Tornar todos os benificios selecionavaeis
         * !!!Feito!!!
         */
        private class tipoClienteActionListenerOutrosPackage implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                beneficiosSelecionaveis(1);
                btnPremiun.setEnabled(true);
                btnOutros.setEnabled(false);
                btnFree.setEnabled(true);
                beneficioFree1.setEnabled(true);
                beneficioFree2.setEnabled(true);
                beneficioFree3.setEnabled(true);
                beneficioPremium1.setEnabled(true);
                beneficioPremium2.setEnabled(true);
                beneficioPremium3.setEnabled(true);
            }
        }

        /**
         * Este metodo é a açao do butao Free 1) Tornar apenas o butao Free
         * desativado !!!Feito!!! 2) Setar os beneficios do pacote Free
         * !!!Feito!!!
         */
        private class tipoClienteActionListenerFreePackage implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                beneficiosSelecionaveis(0);
                btnPremiun.setEnabled(true);
                btnOutros.setEnabled(true);
                btnFree.setEnabled(false);
                beneficioFree1.setSelected(true);
                beneficioFree2.setSelected(true);
                beneficioFree3.setSelected(true);
            }
        }
    }

    public void setPanelTipoUsuario(JInternalFrame frame) {
        frame.setVisible(true);
        frame.setBorder(null);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);
        this.panelTipoUsuario.removeAll();
        this.panelTipoUsuario.add(frame, BorderLayout.CENTER);
        this.panelTipoUsuario.revalidate();
    }

    public JRadioButton getRbUsuarioProfi() {
        return rbUsuarioProfi;
    }

    public JRadioButton getRbUsuarioNormal() {
        return rbUsuarioNormal;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public JLabel getLbIDMostrar() {
        return this.lbIDMostrar;
    }

    public JLabel getLbNomeUsuMostrar() {
        return lbNomeUsuMostrar;
    }
}
