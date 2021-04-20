package problem1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringUtility {
	public static void main(String[] args) {
		JFrame frame = new JFrame("String Utility");
		frame.setSize(600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}

	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);

		JLabel userLabel = new JLabel("Input");
		userLabel.setBounds(380, 30, 80, 25);
		frame.add(userLabel);

		JTextField userText = new JTextField(30);
		userText.setBounds(380, 50, 160, 25);
		frame.add(userText);

		JLabel outputLabel = new JLabel("Output");
		outputLabel.setBounds(380, 90, 80, 25);
		frame.add(outputLabel);

		JTextField outputText = new JTextField(30);
		outputText.setBounds(380, 110, 160, 25);
		frame.add(outputText);

		JButton countButton = new JButton("Count Letters");
		countButton.setBounds(180, 40, 80, 25);
		countButton.resize(150, 30);
		frame.add(countButton);

		JButton reverseButton = new JButton("Reverse Letters");
		reverseButton.setBounds(180, 80, 80, 25);
		reverseButton.resize(150,30);
		frame.add(reverseButton);

		JButton duplicateButton = new JButton("Remove Duplicate");
		duplicateButton.setBounds(180, 120, 80, 25);
		duplicateButton.resize(150, 30);
		frame.add(duplicateButton);

		// Anonymous class
		countButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton source = (JButton) e.getSource();
				String temp = "";
				int temp1 = userText.getText().length();

				outputText.setText(Integer.toString(temp1));
				
			}
		});

		reverseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String temp = "";
				String temp1 = userText.getText();
				for (int i = temp1.length() - 1; i >= 0; i--) {
					temp = temp + temp1.charAt(i);
				}
				outputText.setText(temp);
			}
		});
		duplicateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String input = userText.getText();
				String result = "";
				for (int i = 0; i < input.length(); i++) {
					if (!result.contains(String.valueOf(input.charAt(i)))) {
						result += String.valueOf(input.charAt(i));
					}
				}

				outputText.setText(result);
			}
		});

	}

}
