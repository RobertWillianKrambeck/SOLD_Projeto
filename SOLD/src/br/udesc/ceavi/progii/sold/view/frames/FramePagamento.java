package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.modelo.Pagamento;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Gustavo C. Santos
 * @version 1.0
 * @since 25/05/2018
 */
public class FramePagamento extends JInternalFramelModelo {

    //Atributos
    private JPanel panelFormulario;
    private JTextArea taProduto;
    private JButton btnPagamentoEmBoleto;
    private JButton btnPagamentoEmCartao;
    private JButton btnPagamentoEmPayPal;
    private JButton btnPagamentoEmDeposito;
    private final Pagamento pagamento;
    private GridBagConstraints cons;

    public FramePagamento(Dimension dimension, FrameSistema frameSistema, Pagamento pagamento) {
        super(dimension, frameSistema);
        this.pagamento = pagamento;
        initComponents();
        addComponents();

        super.addFormulario(panelFormulario);
    }

    private void initComponents() {
        panelFormulario = new JPanel(new GridBagLayout());
        taProduto = new JTextArea(this.toString());
        Font font = new Font("Monospaced", 1, 15);
        taProduto.setFont(font);
        btnPagamentoEmBoleto = new JButton("Boleto");
        btnPagamentoEmCartao = new JButton("Cartão");
        btnPagamentoEmPayPal = new JButton("PayPal");
        btnPagamentoEmDeposito = new JButton("Deposito");
        btnPagamentoEmBoleto.setPreferredSize(new Dimension(120, 30));
        btnPagamentoEmCartao.setPreferredSize(new Dimension(120, 30));
        btnPagamentoEmPayPal.setPreferredSize(new Dimension(120, 30));
        btnPagamentoEmDeposito.setPreferredSize(new Dimension(120, 30));
    }

    private void addComponents() {
        //Add JTextArea Produto
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 5;
        cons.fill = GridBagConstraints.HORIZONTAL;
        taProduto.setEditable(false);
//        lbProduto.setEnabled(false);
        panelFormulario.add(taProduto, cons);

        //Add Botoao Boleto
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        panelFormulario.add(btnPagamentoEmBoleto, cons);
        //Add Botoao Cartao
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        panelFormulario.add(btnPagamentoEmCartao, cons);
        //Add Botoao Deposito
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 1;
        panelFormulario.add(btnPagamentoEmDeposito, cons);
        //Add Botoao PayPal
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 1;
        panelFormulario.add(btnPagamentoEmPayPal, cons);
    }

    @Override
    public String toString() {
        return pagamento.getNegociacaoEmPagamento().toString() + "\n"
                + pagamento.getNegociacaoEmPagamento().produtoServico() + "\n"
                + "#######################Ganhador######################" + "\n"
                + pagamento.getCliente() + "\n";
    }

}
