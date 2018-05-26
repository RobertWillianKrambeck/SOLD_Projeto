package br.udesc.ceavi.progii.sold.principal;

import br.udesc.ceavi.progii.sold.modelo.Cliente;
import br.udesc.ceavi.progii.sold.modelo.EstadoDoProduto;
import br.udesc.ceavi.progii.sold.modelo.Negociacao;
import br.udesc.ceavi.progii.sold.modelo.Pagamento;
import br.udesc.ceavi.progii.sold.modelo.Produto;
import br.udesc.ceavi.progii.sold.modelo.TipoCliente;
import br.udesc.ceavi.progii.sold.modelo.TipoProduto;
import br.udesc.ceavi.progii.sold.view.frames.*;
import java.util.Date;

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
    public void run() { //Instancia a tela principal da aplicação
        FrameSistema frameSistema = new FrameSistema();
        JInternalFramelModelo tela = new FrameTelaInicial(frameSistema.getSize(),frameSistema);
        frameSistema.adicionarFrameInterno(tela);
        //Exibe a tela principal para o usuário
        frameSistema.setVisible(true);

    }

}
