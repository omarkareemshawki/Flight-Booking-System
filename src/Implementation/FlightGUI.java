/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import GUI.UpdateFlightGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FlightGUI extends JFrame {
    private final FlightCtrl flightCtrl = new FlightCtrl();
    private final String[] columnNames = {"ID", "Flight Number", "Departure City", "Arrival City", "Departure Time", "Arrival Time", "Flight Category"};
    private final JTable table = new JTable();
    private final JTextField idTextField = new JTextField(5);

    public FlightGUI() {
        super("Flight Records");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        FlightTableModel tableModel = new FlightTableModel(columnNames, flightCtrl);

        table.setModel(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel deletePanel = new JPanel();
        deletePanel.setLayout(new BoxLayout(deletePanel, BoxLayout.X_AXIS));
        JLabel deleteLabel = new JLabel("Enter ID to delete:");
        deleteLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idTextField.getText());
                if (flightCtrl.DeleteFlight(id)) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                    try {
                        tableModel.refresh(); // Refresh the table after deleting a record
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Record not found.");
                }
            }
        });
        deletePanel.add(deleteLabel);
        deletePanel.add(idTextField);
        deletePanel.add(deleteButton);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                if (row >= 0) {
                    String flightNumber = (String) table.getValueAt(row, 2);
                    new UpdateFlightGUI(flightCtrl, flightNumber).setVisible(true); // Open a new JFrame for updating the flight record
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a record to update.");
                }
            }
        });
        JButton addButton = new JButton("Add New Flight");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddFlightGUI().setVisible(true); // Open a new JFrame for adding a new flight record
            }
        });
        buttonPanel.add(updateButton);
        buttonPanel.add(addButton);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(deletePanel, BorderLayout.SOUTH);
        contentPane.add(buttonPanel, BorderLayout.EAST);
        setContentPane(contentPane);

        UIManager.put("TableHeader.background", new Color(38, 50, 56));
        UIManager.put("TableHeader.foreground", Color.WHITE);
        UIManager.put("TableHeader.font", new Font("Tahoma", Font.BOLD, 12));
        UIManager.put("Table.background", Color.WHITE);
        UIManager.put("Table.font", new Font("Tahoma", Font.PLAIN, 12));
        UIManager.put("OptionPane.background", new Color(38, 50, 56));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("Button.background", new Color(0, 150, 136));
        UIManager.put("Button.foreground", Color.WHITE);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlightGUI();
    }
}