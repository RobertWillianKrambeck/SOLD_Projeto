package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameDiscricaoProduto;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaPrincipal;
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
public class FrameTelaPrincipalListeneres {

    /**
     * Atributo que mantém a referencia do objeto do FrameSistema, este
     * instanciado na classe ClassePrincipal
     */
    private FrameSistema frameSistema;
    /**
     * Atributo que mantém a referencia do objeto da Classe FrameTelaPrincipal
     */
    private JInternalFramelModelo frameAtual;
    /**
     * Atributo que mantém a referencia do objeto da Classe
     */
    private JInternalFramelModelo frameNovo;

    /**
     * O contrutor da classe
     *
     * @param frameSistema referencia do objeto instaciado na classe Classe
     * Principal
     * @param frameAtual referencia do objeto da classe que possui os listener
     */
    public FrameTelaPrincipalListeneres(FrameSistema frameSistema,
            JInternalFramelModelo frameAtual) {
        this.frameSistema = frameSistema;
        this.frameAtual = frameAtual;
        addCrudListenersButto();
    }

    private void addCrudListenersButto() {
        JButton btn;
        btn = ((FrameTelaPrincipal) frameAtual).getBtnDarLance1();
        btn.addActionListener(new btnActionListener());
        btn = ((FrameTelaPrincipal) frameAtual).getBtnDarLance2();
        btn.addActionListener(new btnActionListener());
        btn = ((FrameTelaPrincipal) frameAtual).getBtnDarLance3();
        btn.addActionListener(new btnActionListener());
        btn = ((FrameTelaPrincipal) frameAtual).getBtnDarLance4();
        btn.addActionListener(new btnActionListener());
    }

    private class btnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameDiscricaoProduto(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }
}
