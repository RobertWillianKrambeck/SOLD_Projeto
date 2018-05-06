package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro1;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro2;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaInicial;
import br.udesc.ceavi.progii.sold.view.frames.JInternalFramelModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 * Class que define a implementação padrão para os Listeners referentes a tela
 * de cadastro2
 *
 * @author Gustavo Santos
 * @version 1.0
 * @since 23/04/2018
 */
public class FrameCadastro2Listeners {
 /**
     * Atributo que mantém a referencia do objeto do FrameSistema, este
     * instanciado na classe ClassePrincipal
     */
    private FrameSistema frameSistema;
    /**
     * Atributo que mantém a referencia do objeto da Classe telaLeilao
     */
    private JInternalFramelModelo frameAtual;
    /**
     * Atributo que mantém a referencia do objeto da Classe alvo (TelaPrincipal)
     */
    private JInternalFramelModelo frameNovo;

    /**
     * O contrutor da classe
     *
     * @param frameSistema referencia do objeto instaciado na classe Classe
     * Principal
     * @param frameAtual referencia do objeto da classe que possui os listener
     */
    public FrameCadastro2Listeners(FrameSistema frameSistema,
            JInternalFramelModelo frameAtual) {
        this.frameSistema = frameSistema;
        this.frameAtual = frameAtual;
        addCrudListenersButto();
        addCrudListenersRadioButto();
    }

    /**
     * Método que adiciona os Listener para os botões do formulário
     */
    private void addCrudListenersButto() {
        JButton bnt;
        //Add ação ao butao Anterior da classe
        bnt = ((FrameCadastro2)frameAtual).getBotoesDeAction().getBtAnterior();
        bnt.addActionListener(new btnAnteriorActionListener());

        //Add ação ao butao Cancelar da classe
        bnt = ((FrameCadastro2)frameAtual).getBotoesDeAction().getBtCancelar();
        bnt.addActionListener(new btnCancelarActionListener());
        
        bnt = ((FrameCadastro2)frameAtual).getBotoesDeAction().getBtProximo();
        bnt.addActionListener(new btnProximoActionListener());
    }

    private void addCrudListenersRadioButto() {
        JRadioButton rButton;
        rButton = ((FrameCadastro2)frameAtual).getRbUsuarioNormal();
        rButton.addActionListener(new radioButtonNormalActionListener());

        rButton = ((FrameCadastro2)frameAtual).getRbUsuarioProfi();
        rButton.addActionListener(new radioButtonProfiActionListener());
    }

    class btnAnteriorActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameCadastro1(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }

    class btnProximoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Funciona Proximo");
        }
    }

    class btnCancelarActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameTelaInicial(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);        }
    }

    class radioButtonNormalActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ((FrameCadastro2)frameAtual).getTipoCliente().initComponentsClienteNormal();
        }
    }

    class radioButtonProfiActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ((FrameCadastro2)frameAtual).getTipoCliente().initComponentsClienteProfi();
        }
    }
}
