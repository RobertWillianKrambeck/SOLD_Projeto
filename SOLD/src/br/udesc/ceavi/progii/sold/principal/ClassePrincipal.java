package br.udesc.ceavi.progii.sold.principal;

import br.udesc.ceavi.progii.sold.view.frames.*;


/**
 * Classe Principal do Pacote
 *
 * @author Gustavo de Carvalho Santos
 * @since 09/04/2018
 * @version 1.0
 */
public class ClassePrincipal implements Runnable {

    public static void main(String[] args) {
        //Instancia a classe principal da aplicação
        ClassePrincipal telaPrincipal = new ClassePrincipal();

        //Instancia uma thread para executar a aplicação
        Thread thread = new Thread(telaPrincipal);

        //Executa a thread da aplicação.
        thread.start();
    }

    /**
     * Método responsável pela execução da Thread principal da aplicação.
     */
    @Override
    public void run() {
        //Instancia a tela principal da aplicação
        FrameSistema frame = new FrameSistema();
        JInternalFramelModelo tela = new FrameTelaInicial(frame.getSize());
        frame.adicionarFrameInterno(tela);
        //Exibe a tela principal para o usuário
        frame.setVisible(true);
    }
}
