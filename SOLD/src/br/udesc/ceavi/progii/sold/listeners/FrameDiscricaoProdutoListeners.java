package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameDiscricaoProduto;
import br.udesc.ceavi.progii.sold.view.frames.FrameLeilao;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaPrincipal;
import br.udesc.ceavi.progii.sold.view.frames.JInternalFramelModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Class que define a implementação padrão para os Listeners referentes a tela
 * de leilao
 *
 * @author Gustavo Santos
 * @version 1.1
 * @since 23/04/2018
 */
public class FrameDiscricaoProdutoListeners {

    /**
     * Atributo que mantém a referencia do objeto do FrameSistema, este
     * instanciado na classe ClassePrincipal
     */
    private FrameSistema frameSistema;
    /**
     * Atributo que mantém a referencia do objeto da Classe (FrameDiscricaoProduto)
     */
    private JInternalFramelModelo frameAtual;
    /**
     * Atributo que mantém a referencia do objeto da Classe alvo 
     */
    private JInternalFramelModelo frameNovo;

    /**
     * O contrutor da classe
     *
     * @param frameSistema referencia do objeto instaciado na classe Classe
     * Principal
     * @param frameAtual referencia do objeto da classe que possui os listener
     */
    public FrameDiscricaoProdutoListeners(FrameSistema frameSistema, JInternalFramelModelo frameAtual) {
        this.frameSistema = frameSistema;
        this.frameAtual = frameAtual;
        addCrudListener();
    }

    private void addCrudListener() {
        JButton btn;
        btn = ((FrameDiscricaoProduto) frameAtual).getBtnIrParaLeilao();
        btn.addActionListener(new btnIrParaLeilaoActionListener());
        btn = ((FrameDiscricaoProduto) frameAtual).getBtnVoltar();
        btn.addActionListener(new btnVoltarActionListener());
    }

    private class btnVoltarActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameTelaPrincipal(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }

    private class btnIrParaLeilaoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameLeilao(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }
}
