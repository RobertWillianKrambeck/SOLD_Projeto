package br.udesc.ceavi.progii.sold.listeners;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro1;
import br.udesc.ceavi.progii.sold.view.frames.FrameCadastro2;
import br.udesc.ceavi.progii.sold.view.frames.FrameTelaInicial;
import br.udesc.ceavi.progii.sold.view.frames.JInternalFramelModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Class que define a implementação padrão para os Listeners referentes a tela
 * de cadastro1
 *
 * @author Gustavo Santos
 * @version 2.0
 * @since 23/04/2018
 */
public class FrameCadastro1Listeners {

    /**
     * Atributo que mantém a referencia do objeto do FrameSistema, este
     * instanciado na classe ClassePrincipal
     */
    private FrameSistema frameSistema;

    /**
     * Atributo que mantém a referencia do objeto da Classe FrameCadastro1
     */
    private FrameCadastro1 frameCadastro1;

    /**
     * Atributo que mantém a referencia do objeto da Classe alvo (TelaInicial)
     */
    private JInternalFramelModelo frameNovo;

    /**
     * Atributo que mantém a referencia do objeto da Classe Cadastro2
     */
    private FrameCadastro2 frameCadastro2;

    /**
     * O contrutor da classe Padrao
     *
     * @param frameSistema referencia do objeto instaciado na classe Classe
     * Principal
     * @param frameAtual referencia do objeto da classe que possui os listener
     */
    public FrameCadastro1Listeners(FrameSistema frameSistema,
            FrameCadastro1 frameAtual) {
        //Recebe as referencia passadas pelo parametro do contrutor
        this.frameSistema = frameSistema;
        this.frameCadastro1 = frameAtual;
        /**
         * Esse treço de codigo permite a passagem de telas sem perder a
         * referencia. Esse listener e FrameCadastro2Listerner DEVEM MANTER a
         * referencia dos objetos criados (Cadastro1 e Cadastro2)e add
         * frameCadastro2 (Cadastro2) ao FrameSistema
         */
        this.frameCadastro2 = new FrameCadastro2(frameSistema.getSize(), frameSistema,
                frameCadastro1);
        frameCadastro2.setVisible(false);
        frameCadastro1.setVisible(true);
        frameSistema.adicionarFrameInterno(frameCadastro2);

        //Gera e Modifica o Id        
        frameCadastro2.getLbIDMostrar().setText("" + frameCadastro1.gerarID());
        addCrudListenersButto();
    }

    /**
     * Método que adiciona os Listener para os botões do formulário
     */
    private void addCrudListenersButto() {
        JButton bnt;
        //Add ação ao butao Anterior da classe
//        bnt = frameCadastro1.getBotoesDeAction().getBtAnterior();
//        bnt.addActionListener(new actionListenerChamadaDeTelaInicial());

        //Add ação ao butao Cancelar da classe
        bnt = frameCadastro1.getBotoesDeAction().getBtCancelar();
        bnt.addActionListener(new actionListenerChamadaDeTelaInicial());

        //Add ação ao butao Proximo da classe
        bnt = frameCadastro1.getBotoesDeAction().getBtProximo();
        bnt.addActionListener(new btnProximoActionListener());
    }

    /**
     * Estes metodo ira chamar o FrameTelaInicial 1) Veriica se o ussuario
     * realmente quer fecha, informando que ira perder o progresso <<Feito>> 2)
     * Se 1) true entao fecha: FrameCadastro1 e FrameCadastro2; e Abre a
     * TelaInicial <<Feito>>
     */
    class actionListenerChamadaDeTelaInicial implements ActionListener {

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
     * Estes metodo ira chamar o FrameCadastro2 1)Tratamento de senha <<Feito>>
     * 2)Tratamento de Nome <<Feito>>
     */
    class btnProximoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            /**
             * Tratamento de senha 1) Verificação se os campos estão preencidos
             * <<Feito>> 2) Verificação se os campos são iguais <<Feito>>
             */
            if (frameCadastro1.senhaEqual()) {
                /**
                 * Tratamento de Nome 1) Verificação se os
                 * campos(frameCadastro2.getTfNome()) <<Feito>> 2) Obtem
                 * ele(frameCadastro2.getTfNome()) é o transfere para o seu
                 * campo em FrameCadastro2(frameCadastro2.getLbNomeUsuMostrar())
                 * <<Feito>>
                 */
                frameCadastro2.getLbNomeUsuMostrar().setText(frameCadastro1.getTfNome().getText());

                frameCadastro1.setVisible(false);
                frameCadastro2.setVisible(true);
            } else {

                JOptionPane.showMessageDialog(null, "Verifique Se O Campo Esta Preencido!\n"
                        + "Verifique Se As Senha Sâo Iquais!", "Campo de Senha Com Erro!",
                         JOptionPane.OK_OPTION);

                frameCadastro1.limparSenha();
            }
        }
    }
}
