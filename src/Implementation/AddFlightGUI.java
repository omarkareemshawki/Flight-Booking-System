/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

import Implementation.FlightCtrl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AddFlightGUI extends JFrame {
    private final FlightCtrl flightCtrl = new FlightCtrl();

    private final JTextField flightNumberTextField = new JTextField(10);
    private final JTextField departureCityTextField = new JTextField(10);
    private final JTextField arrivalCityTextField = new JTextField(10);
    private final JTextField departureTimeTextField = new JTextField(10);
    private final JTextField arrivalTimeTextField = new JTextField(10);
    private final JTextField flightCategoryTextField = new JTextField(10);

    public AddFlightGUI() {
        super("Add New Flight");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 300);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));

        JLabel flightNumberLabel = new JLabel("Flight Number:");
        JLabel departureCityLabel = new JLabel("Departure City:");
        JLabel arrivalCityLabel = new JLabel("Arrival City:");
        JLabel departureTimeLabel = new JLabel("Departure Time:");
        JLabel arrivalTimeLabel = new JLabel("Arrival Time:");
        JLabel flightCategoryLabel = new JLabel("Flight Category:");

        inputPanel.add(flightNumberLabel);
        inputPanel.add(flightNumberTextField);
        inputPanel.add(departureCityLabel);
        inputPanel.add(departureCityTextField);
        inputPanel.add(arrivalCityLabel);
        inputPanel.add(arrivalCityTextField);
        inputPanel.add(departureTimeLabel);
        inputPanel.add(departureTimeTextField);
        inputPanel.add(arrivalTimeLabel);
        inputPanel.add(arrivalTimeTextField);
        inputPanel.add(flightCategoryLabel);
        inputPanel.add(flightCategoryTextField);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Flight");
        buttonPanel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flightNumber = flightNumberTextField.getText();
                String departureCity = departureCityTextField.getText();
                String arrivalCity = arrivalCityTextField.getText();
                String departureTime = departureTimeTextField.getText();
                String arrivalTime = arrivalTimeTextField.getText();
                String flightCategory = flightCategoryTextField.getText();

                try {
                    if (flightCtrl.AddFlight(flightNumber, departureCity, arrivalCity, departureTime, arrivalTime, flightCategory)) {
                        JOptionPane.showMessageDialog(null, "Flight added successfully.");
                        dispose(); 
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to add flight.");
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}

