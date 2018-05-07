package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro1;
import br.udesc.ceavi.progii.sold.view.frames.FrameLogin;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaInicial;
import br.udesc.ceavi.progii.sold.view.frames.JInternalFramelModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Class que define a implementação padrão para os Listeners referentes a tela
 * de FrameTelaInicial
 *
 * @author Everton e Gustavo
 */
public class FrameTelaInicialListener {

    /**
     * Atributo que mantém a referencia do objeto do FrameSistema, este
     * instanciado na classe ClassePrincipal
     */
    private FrameSistema frameSistema;
    /**
     * Atributo que mantém a referencia do objeto da Classe FrameTelaInicial
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
    public FrameTelaInicialListener(FrameSistema frameSistema, JInternalFramelModelo frameAtual) {
        this.frameSistema = frameSistema;
        this.frameAtual = frameAtual;
        addCrudListenr();
    }

    public void addCrudListenr() {
        JButton btn;
        btn = ((FrameTelaInicial) frameAtual).getJbAcessar();
        btn.addActionListener(new jbAcessarActionPerformed());
        btn = ((FrameTelaInicial) frameAtual).getJbRegistrar();
        btn.addActionListener(new jbRegistroActionPerformed());
    }

    private class jbAcessarActionPerformed implements ActionListener {

        public jbAcessarActionPerformed() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameLogin(frameSistema.getSize(), frameSistema);

            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }

    private class jbRegistroActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frameNovo = new FrameCadastro1(frameSistema.getSize(), frameSistema);
            frameSistema.adicionarFrameInterno(frameNovo);
            frameAtual.dispose();
            frameNovo.setVisible(true);
        }
    }
}
