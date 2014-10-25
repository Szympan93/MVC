package mvc.impl.views;


import java.awt.event.ActionListener;

import javax.swing.*;

import mvc.View;


public class VMain extends View {

	public JButton bTest = new JButton("Test");
	@Override
	public void draw() {
		JFrame window = new JFrame("Main");
		window.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
		window.setLayout(null);
		//window
		window.setSize(400, 400);
		//button
		bTest.setLocation(10, 10);
		bTest.setSize(100, 20);
		window.add(bTest);
		
		
		window.setVisible(true);

	}

	@Override
	public void addListener(ActionListener listener) {
		bTest.addActionListener(listener);
	}

}
