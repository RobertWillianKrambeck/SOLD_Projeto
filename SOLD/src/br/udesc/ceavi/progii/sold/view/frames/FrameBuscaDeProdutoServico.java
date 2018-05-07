package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta tela é a tela de Busca de Produto
 *
 * @author Everto Cezar
 * @version 1.0
 * @since 20/04/2018
 *
 */
public class FrameBuscaDeProdutoServico extends JInternalFramelModelo {

    private JScrollPane SPDaTebelaPrincipal;
    private JLabel lbTermoPesquisado;
    private JPanel painelFormulario;
    private JTable tabelaPrincipal;
    private GridBagConstraints cons;
    
    public FrameBuscaDeProdutoServico(Dimension dimension,FrameSistema frameSistema) {
        super(dimension,frameSistema);
        initComponents();
        modeloDaTabela();
        addComponent();
        super.addBotoesDeAcao();
        super.addFormulario(painelFormulario);
    }

    private void addComponent() {
        lbTermoPesquisado.setText("<<Termo Pesquisado>>");
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(45, 58, 0, 0);
        painelFormulario.add(lbTermoPesquisado, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.BOTH;
        cons.ipadx = 624;
        cons.ipady = 183;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.weightx = 1.0;
        cons.weighty = 1.0;
        cons.insets = new Insets(46, 78, 85, 78);
        painelFormulario.add(SPDaTebelaPrincipal, cons);
    }

    private void initComponents() {
        painelFormulario = new JPanel();
        lbTermoPesquisado = new JLabel();
        SPDaTebelaPrincipal = new JScrollPane();
        tabelaPrincipal = new JTable();
        painelFormulario.setLayout(new GridBagLayout());
    }

    private void modeloDaTabela() {
        tabelaPrincipal.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nome", "Preço Atual", "ID", "Cliente"
                }
        ) {
            Class[] types = new Class[]{
                String.class, Float.class, Integer.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        SPDaTebelaPrincipal.setViewportView(tabelaPrincipal);
        if (tabelaPrincipal.getColumnModel().getColumnCount() > 0) {
            tabelaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(1).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(2).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(3).setResizable(false);
        }
    }

}
