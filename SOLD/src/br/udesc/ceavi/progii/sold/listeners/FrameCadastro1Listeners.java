package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro1;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro2;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaInicial;
import br.udesc.ceavi.progii.sold.view.frames.JInternalFramelModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Class que define a implementação padrão para os Listeners referentes a tela
 * de cadastro1
 *
 * @author Gustavo Santos
 * @version 1.0
 * @since 23/04/2018
 */
public class FrameCadastro1Listeners {

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
    public FrameCadastro1Listeners(FrameSistema frameSistema,
            FrameCadastro1 frameAtual) {
        this.frameSistema = frameSistema;
        this.frameAtual = frameAtual;
        addCrudListenersButto();
    }

    /**
     * Método que adiciona os Listener para os botões do formulário
     */
    private void addCrudListenersButto() {
        JButton bnt;
        //Add ação ao butao Anterior da classe
        bnt = frameAtual.getBotoesDeAction().getBtAnterior();
        bnt.addActionListener(new btnAnteriorActionListener());

        //Add ação ao butao Cancelar da classe
        bnt = frameAtual.getBotoesDeAction().getBtCancelar();
        bnt.addActionListener(new btnCancelarActionListener());
        
        bnt = frameAtual.getBotoesDeAction().getBtProximo();
        bnt.addActionListener(new btnProximoActionListener());
    }


    class btnAnteriorActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameTelaInicial(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }

    class btnProximoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameCadastro2(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);        }
    }

    class btnCancelarActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameTelaInicial(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);        }
    }
}
