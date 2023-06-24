
package listadecontatos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class ListaDeContatos extends JFrame {
private DefaultListModel<String> listaModel;
    private JList<String> listaContatos;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JTextField txtNome;

    public ListaDeContatos() {
        
        setTitle("Lista de Contatos");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        listaModel = new DefaultListModel<>();
        listaContatos = new JList<>(listaModel);
        JScrollPane scrollPane = new JScrollPane(listaContatos);
        txtNome = new JTextField(20);
        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(100, 100, 50, 50);
        btnRemover = new JButton("Remover");
        btnRemover.setBounds(100, 100, 50, 50);

        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarContato();
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerContato();
            }
        });

       
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(btnAdicionar);
        panel.add(btnRemover);
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void adicionarContato() {
        String nome = txtNome.getText().trim();
        if (!nome.isEmpty()) {
            listaModel.addElement(nome);
            txtNome.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Digite o nome do contato");
        }
    }

    private void removerContato() {
        int index = listaContatos.getSelectedIndex();
        if (index != -1) {
            listaModel.remove(index);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um contato para remover");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaDeContatos().setVisible(true);
            }
        });
    }
    
}
