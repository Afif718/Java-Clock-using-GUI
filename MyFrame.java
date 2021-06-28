/**
 *
 */
package cllock.intro.gui;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author HP
 *
 */
public class MyFrame extends JFrame {

	Calendar calendar;

	// time
	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	String time;

	// day
	SimpleDateFormat dayFormat;
	JLabel dayLabel;
	String day;

	// date
	SimpleDateFormat dateFormat;
	JLabel dateLabel;
	String date;


	public MyFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(260, 200);
		this.setBackground(Color.black);
		this.setLayout(new FlowLayout());
		this.setResizable(false);



		// this is for the time format from oracle website
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("\nMMMMM dd, yyyy");

		timeLabel = new JLabel();
		// time section design
		timeLabel.setFont(new Font("Garamond", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);

		// for day
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));
		dayLabel.setForeground(Color.BLUE);

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		dateLabel.setForeground(Color.BLUE);

		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);


		this.setVisible(true);

		// this method is for updating time after each one sec
		setTime();

	}

	public void setTime() {

		while (true) {

			// Time
		// This is for getting the current time
		time = timeFormat.format(Calendar.getInstance().getTime());
		// we will save the current time like text here
		timeLabel.setText(time);

		// Day
		// This is for getting the current day
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);

		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);

		// after each one second the time will update
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
