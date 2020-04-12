package MyCalcu;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//public class Test {
//
//	public static void main(String[] args) {
//		new MainWid();
//	}
//}

@SuppressWarnings("serial")
class MainWid extends JFrame {
	JTextField screen = new JTextField("0");
	JButton clear = new JButton("CE");
	String[] str = { "√", "%", "CE", "C", "÷", "sin", "7", "8", "9", "×", "cos", "4", "5", "6", "-", "tan", "1", "2",
			"3", "+", "1/x", "±", "0", ".", "=", };
	JButton[] button = new JButton[str.length];
	JTextArea text = new JTextArea(8, 25);
	JLabel lb = new JLabel("历史记录");
	JButton qc = new JButton("删除");
	Font font = new Font("Consolas", Font.BOLD, 23);
	Font fot = new Font("Consolas", Font.BOLD, 55);

	MainWid() {
		setTitle("计算器");
		setSize(1200, 850);
		// setLocation(100, 100);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		clear.setFont(fot);
		text.setFont(font);
		screen.setFont(fot);
		JPanel pnlHead = new JPanel(new BorderLayout());
		pnlHead.add(screen, BorderLayout.CENTER);
		// pnlHead.add(clear, BorderLayout.EAST);
		clear.addActionListener(new MyActionListener());
		screen.addActionListener(new MyActionListener());
		qc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("");
			}
		});
		JPanel pnlBodyL = new JPanel(new GridLayout(5, 5));
		for (int i = 0; i < str.length; i++) {
			button[i] = new JButton(str[i]);
			button[i].setBorderPainted(false);
			pnlBodyL.add(button[i]);
			button[i].addActionListener(new MyActionListener());
			//button[i].addMouseListener(new MyMouseAdapter(button[i]));
		}
//		class MyMouseAdapter extends MouseAdapter {
//			JButton jb;
//			Color c;
//			public MyMouseAdapter(JButton jb){
//				this.jb=jb;
//				c=jb.getBackground();
//			}
//			@Override
//			public void mouseEntered(MouseEvent e){
//				jb.setBackground(Color.BLUE);
//			}
//			@Override
//			public void mouseExited(MouseEvent e){
//				jb.setBackground(c);
//			}
//		}
		
		for (int i = 0; i < 6; i++) {
			button[i].setBackground(new Color(240, 240, 240));
			button[i].setFont(font);
		}
		for (int i = 6; i < 19; i++) {
			button[i].setBackground(Color.white);
			button[i].setFont(font);

		}
		for (int i = 19; i < 25; i++) {
			button[i].setBackground(new Color(240, 240, 240));
			button[i].setFont(font);
		}
		button[9].setBackground(new Color(240, 240, 240));
		button[10].setBackground(new Color(240, 240, 240));
		button[14].setBackground(new Color(240, 240, 240));
		button[15].setBackground(new Color(240, 240, 240));
		button[22].setBackground(Color.white);
		
		
		
		button[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[4].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[4].setBackground(new Color(240, 240, 240));
			}
		});

		button[9].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[9].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[9].setBackground(new Color(240, 240, 240));
			}
		});
		button[14].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[14].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[14].setBackground(new Color(240, 240, 240));
			}
		});

		button[19].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[19].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[19].setBackground(new Color(240, 240, 240));
			}
		});
		button[24].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[24].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[24].setBackground(new Color(240, 240, 240));
			}
		});
		button[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[0].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[0].setBackground(new Color(240, 240, 240));
			}
		});

		button[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[1].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[1].setBackground(new Color(240, 240, 240));
			}
		});
		button[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[2].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[2].setBackground(new Color(240, 240, 240));
			}
		});
		button[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[3].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[3].setBackground(new Color(240, 240, 240));
			}
		});
		button[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[4].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[4].setBackground(new Color(240, 240, 240));
			}
		});

		button[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[5].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[5].setBackground(new Color(240, 240, 240));
			}
		});
		button[10].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[10].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[10].setBackground(new Color(240, 240, 240));
			}
		});
		button[15].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[15].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[15].setBackground(new Color(240, 240, 240));
			}
		});

		button[20].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[20].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[20].setBackground(new Color(240, 240, 240));
			}
		});
		button[21].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[21].setBackground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[21].setBackground(new Color(240, 240, 240));
			}
		});
		button[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[6].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[6].setBackground(Color.white);
			}
		});

		button[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[7].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[7].setBackground(Color.white);
			}
		});
		button[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[8].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[8].setBackground(Color.white);
			}
		});
		button[11].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[11].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[11].setBackground(Color.white);
			}
		});
		button[12].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[12].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[12].setBackground(Color.white);
			}
		});

		button[13].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[13].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[13].setBackground(Color.white);
			}
		});
		button[16].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[16].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[16].setBackground(Color.white);
			}
		});
		button[17].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[17].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[17].setBackground(Color.white);
			}
		});
		button[18].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[18].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[18].setBackground(Color.white);
			}
		});

		button[22].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button[22].setBackground(new Color(220, 220, 220));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button[22].setBackground(Color.white);
			}
		});
		JPanel pnlBodyR = new JPanel(new BorderLayout());
		pnlBodyR.add(lb, BorderLayout.NORTH);
		pnlBodyR.add(text, BorderLayout.CENTER);
		pnlBodyR.add(qc, BorderLayout.SOUTH);

		Container cp = getContentPane();
		cp.setBackground(Color.darkGray);
		cp.add(pnlHead, BorderLayout.NORTH);
		cp.add(pnlBodyR, BorderLayout.EAST);
		cp.add(pnlBodyL, BorderLayout.CENTER);
		cp.validate();
	}

	boolean isFirstNum = true;
	double number = 0;
	String operator = "=";

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Object source = e.getSource();
			String cmd = e.getActionCommand(); // ������˶�����ص������ַ���
			if ("CE".indexOf(cmd) >= 0)// ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ���������
				handleClear(cmd);
			else if ("0123456789.".indexOf(cmd) >= 0)
				handleNumber(cmd);
			else if ("+-×÷=".indexOf(cmd) >= 0)
				handleOperator(cmd);
			else
				specialOperator(cmd);
		}

		public void handleClear(String cmd) {
			if (cmd == "CE") {
				screen.setText("0");
				isFirstNum = true;
				operator = "=";
			} else {
				String remove = screen.getText();
				screen.setText(remove.substring(0, remove.length() - 1));
			}
		}

		public void handleNumber(String key) {
			if (isFirstNum) {
				screen.setText(key);
			} else if (!key.equals(".")) { // boolean equals(Object anObject)�����ַ�����ָ���Ķ���Ƚ�
				String msg = screen.getText();
				screen.setText(msg + key);
			} else if (screen.getText().indexOf(".") < 0) {
				screen.setText(screen.getText() + ".");
			}
			isFirstNum = false;
		}

		public void handleOperator(String cmd) {
			double dDisplay = Double.parseDouble(screen.getText());// Integer.parseInt
			text.append(screen.getText());
			switch (operator) {
			case "+": {
				number += dDisplay;
				text.append("=" + String.valueOf(number) + "\n");
				break;
			}
			case "-": {
				number -= dDisplay;
				text.append("=" + String.valueOf(number) + "\n");
				break;
			}
			case "×": {
				number *= dDisplay;
				text.append("=" + String.valueOf(number) + "\n");
				break;
			}
			case "÷": {

				number /= dDisplay;
				text.append("=" + String.valueOf(number) + "\n");
				break;
			}
			case "%": {
				number %= dDisplay;
				text.append("=" + String.valueOf(number) + "\n");
				break;
			}
			case "=": {
				number = dDisplay;
				break;
			}

			}
			operator = cmd;
			screen.setText(String.valueOf(number));
			isFirstNum = true;
			switch (operator) {
			case "+":
				text.append("+");
				break;
			case "-":
				text.append("-");
				break;
			case "×":
				text.append("÷");
				break;
			case "÷":
				text.append("÷");
				break;
			case "%":
				text.append(" %");
				break;
			}
		}

		public void specialOperator(String cmd) {
			double dDisplay = Double.parseDouble(screen.getText());// Integer.parseInt
			switch (cmd) {

			case "0": {
				number = -dDisplay;
				break;
			}
			case "1/x": {
				number = 1 / dDisplay;
				text.append("1/" + "(" + screen.getText() + ")" + "=" + String.valueOf(number) + "\n");
				break;
			}
			case "sin": {
				number = Math.sin(dDisplay);
				text.append("sin" + "(" + screen.getText() + ")" + "=" + String.valueOf(number) + "\n");
				break;
			}
			case "cos": {
				number = Math.cos(dDisplay);
				text.append("cos" + "(" + screen.getText() + ")" + "=" + String.valueOf(number) + "\n");
				break;
			}
			case "tan": {
				number = Math.tan(dDisplay);
				text.append("tan" + "(" + screen.getText() + ")" + "=" + String.valueOf(number) + "\n");
				break;
			}
			case "±": {
				number = Math.sqrt(dDisplay);
				text.append("±" + "(" + screen.getText() + ")" + "=" + String.valueOf(number) + "\n");
				break;
			}
			}
			screen.setText(String.valueOf(number));
			operator = "=";
			isFirstNum = true;
		}
	}
}