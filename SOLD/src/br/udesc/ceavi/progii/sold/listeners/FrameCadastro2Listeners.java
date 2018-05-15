package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro1;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro2;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaInicial;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaPrincipal;
import br.udesc.ceavi.progii.sold.view.frames.JInternalFramelModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 * Class que define a implementação padrão para os Listeners referentes a tela
 * de cadastro2
 *
 * @author Gustavo Santos
 * @version 2.0
 * @since 23/04/2018
 */
public class FrameCadastro2Listeners {

    /**
     * Atributo que mantém a referencia do objeto do FrameSistema, este
     * instanciado na classe ClassePrincipal
     */
    private FrameSistema frameSistema;

    /**
     * Atributo que mantém a referencia do objeto da Classe FrameCadastro2
     */
    private FrameCadastro2 frameCadastro2;

    /**
     * Atributo que mantém a referencia do objeto da Classe FrameCadastro1
     */
    private FrameCadastro1 frameCadastro1;

    /**
     * Atributo que mantém a referencia do objeto da Classe alvo
     */
    private JInternalFramelModelo frameNovo;

    /**
     * O contrutor da classe
     *
     * @param frameSistema referencia do objeto instaciado na classe Classe
     * Principal
     * @param frameCadastro2 referencia do objeto da classe que possui os
     * listener
     * @param frameCadastro1 referencia do objeto instaciado na classe Classe
     * frameCadastro1
     */
    public FrameCadastro2Listeners(FrameSistema frameSistema,
            FrameCadastro2 frameCadastro2, FrameCadastro1 frameCadastro1) {
        this.frameSistema = frameSistema;
        this.frameCadastro1 = frameCadastro1;
        this.frameCadastro2 = frameCadastro2;
        addCrudListenersButto();
        addCrudListenersRadioButton();
    }

    /**
     * Método que adiciona os Listener para os botões do formulário
     */
    private void addCrudListenersButto() {
        JButton bnt;
        //Add ação ao butao Anterior da classe
        bnt = frameCadastro2.getBotoesDeAction().getBtAnterior();
        bnt.addActionListener(new btnAnteriorActionListener());

        //Add ação ao butao Cancelar da classe
        bnt = frameCadastro2.getBotoesDeAction().getBtCancelar();
        bnt.addActionListener(new btnCancelarActionListener());

        bnt = frameCadastro2.getBotoesDeAction().getBtProximo();
        bnt.addActionListener(new btnProximoActionListener());
    }

    /**
     * Estes metodo ira chamar o frameCadastro1
     */
    class btnAnteriorActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameCadastro2.setVisible(false);
            frameCadastro1.limparSenha();
            frameCadastro1.setVisible(true);
        }
    }

    /**
     * Estes metodo ira chamar o FrameTelaPrincipal
     */
    class btnProximoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameTelaPrincipal(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameCadastro2.dispose();
            frameCadastro1.dispose();
            frameNovo.setVisible(true);
        }
    }

    /**
     * Estes metodo ira chamar o FrameTelaInicial
     */
    class btnCancelarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = JOptionPane.showConfirmDialog(null, "Vocë Perderar Todo O Porcesso!",
                    "Quer Fechar?", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                frameNovo = new FrameTelaInicial(frameSistema.getSize(), frameSistema);
                frameSistema.adicionarFrameInterno(frameNovo);
                frameCadastro1.setVisible(false);
                frameNovo.setVisible(true);
                frameCadastro2.dispose();
                frameCadastro1.dispose();
            }
        }
    }

    /**
     * Método que adiciona os Listener para aos radioButton do formulário
     */
    private void addCrudListenersRadioButton() {
        JRadioButton rButton;
        rButton = ((FrameCadastro2) frameCadastro2).getRbUsuarioNormal();
        rButton.addActionListener(new radioButtonNormalActionListener());

        rButton = ((FrameCadastro2) frameCadastro2).getRbUsuarioProfi();
        rButton.addActionListener(new radioButtonProfiActionListener());
    }

    class radioButtonNormalActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ((FrameCadastro2) frameCadastro2).getTipoCliente().initComponentsClienteNormal();
        }
    }

    class radioButtonProfiActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ((FrameCadastro2) frameCadastro2).getTipoCliente().initComponentsClienteProfi();
        }
    }
}
