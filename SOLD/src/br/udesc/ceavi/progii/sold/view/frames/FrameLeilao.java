package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.listeners.FrameLeilaoListeners;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Everton Cezar
 */
public class FrameLeilao extends JInternalFramelModelo {

    private JButton btnAremate;
    private JButton btnDarLance;
    private JButton btnSair;
    private JLabel panelDoValorDoLance;
    private JLabel lbImagemDoProduto;
    private JLabel lbNomeDoProduto;
    private JPanel panelFormulario;
    private JScrollPane spTabelaPrincipal;
    private JTextArea taDiscricao;
    private JTable tabelaPrincipal;
    private JTextField tfValorDoAremate;
    private JTextField tfValorDoAremate1;
    private GridBagConstraints cons;
    
    private FrameSistema frameSistema;

    public FrameLeilao(Dimension dimension, FrameSistema frameSistema) {
        super(dimension,frameSistema);
        initComponents();
        ModelTabela();
        addComponents();
        FrameLeilaoListeners listenres = new FrameLeilaoListeners(frameSistema, this);
        super.addFormulario(panelFormulario);
    }

    private void initComponents() {

        panelFormulario = new JPanel();
        lbImagemDoProduto = new JLabel();
        lbNomeDoProduto = new JLabel();
        spTabelaPrincipal = new JScrollPane();
        tabelaPrincipal = new JTable();
        tfValorDoAremate = new JTextField();
        tfValorDoAremate1 = new JTextField();
        taDiscricao = new JTextArea();
        btnAremate = new JButton();
        btnDarLance = new JButton();
        btnSair = new JButton();
        panelDoValorDoLance = new JLabel();
        panelFormulario.setLayout(new GridBagLayout());
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        btnSair.setText("Sair");
        cons.gridx = 0;
        cons.gridy = 5;
        panelFormulario.add(btnSair, cons);
        lbImagemDoProduto.setText("<<Imagem>>");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 100;
        cons.ipady = 100;
        cons.insets = new Insets(0, 50, 0, 0);
        panelFormulario.add(lbImagemDoProduto, cons);

        lbNomeDoProduto.setText("<<Nome do Produto>>");
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 2;
        cons.insets = new Insets(0, 0, 10, 0);
        panelFormulario.add(lbNomeDoProduto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 4;
        cons.gridheight = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 250;
        cons.ipady = 275;
        cons.insets = new Insets(0, 20, 0, 0);
        panelFormulario.add(spTabelaPrincipal, cons);

        btnAremate.setText("AREMATE");
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 5;
        cons.gridwidth = 2;
        cons.insets = new Insets(0, 15, 0, 15);
        panelFormulario.add(btnAremate, cons);
        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 5;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 120;
        panelFormulario.add(tfValorDoAremate, cons);

        btnDarLance.setText("Dar Lance");
        cons = new GridBagConstraints();
        cons.gridx = 6;
        cons.gridy = 5;
        panelFormulario.add(btnDarLance, cons);

        taDiscricao.setEditable(false);
        taDiscricao.setColumns(20);
        taDiscricao.setRows(5);
        taDiscricao.setBorder(BorderFactory.createEtchedBorder());
        taDiscricao.setMaximumSize(new Dimension(100, 100));
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.BOTH;
        cons.insets = new Insets(0, 5, 0, 0);
        panelFormulario.add(taDiscricao, cons);
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 4;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(0, 15, 0, 15);
        panelFormulario.add(tfValorDoAremate1, cons);

        panelDoValorDoLance.setText("<<Valor Do Lance>>");
        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 4;
        cons.gridwidth = 3;
        panelFormulario.add(panelDoValorDoLance, cons);
    }

    private void ModelTabela() {
        tabelaPrincipal.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nome", "Id", "Valor do Lance"
                }
        ) {
            Class[] types = new Class[]{
                String.class, Integer.class, Float.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tabelaPrincipal.getTableHeader().setReorderingAllowed(false);
        spTabelaPrincipal.setViewportView(tabelaPrincipal);
        if (tabelaPrincipal.getColumnModel().getColumnCount() > 0) {
            tabelaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(1).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(2).setResizable(false);
        }
    }

    public JButton getBtnAremate() {
        return btnAremate;
    }

    public JButton getBtnDarLance() {
        return btnDarLance;
    }

    public JButton getBtnSair() {
        return btnSair;
    }
    
}
