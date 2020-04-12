package MyCalcu;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("serial")
public class Login extends JFrame implements KeyListener {
	public static void main(String[] args) {
		new Login();
	}

	JLabel yh = new JLabel("用户名");
	JLabel mm = new JLabel("密码");
	JButton dl = new JButton("登录");
	JButton qx = new JButton("取消");
	JLabel zc = new JLabel("注册");

	ImageIcon icon = new ImageIcon("//D:/Java-project/Workspace/Calculator/src/MyCalcu/eye.jpg");
	JButton look = new JButton(icon);
	JTextField yh1 = new JTextField(null);
	JPasswordField mm1 = new JPasswordField(null);

	public int pd = 0;
	public String ak1, ak2;

	Login() {
		setTitle("登录");
		setLayout(null);
		setBounds(400, 200, 520, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font ziti1 = new Font("����", Font.BOLD, 18);
		Font ziti2 = new Font("����", Font.BOLD, 15);
		yh.setFont(ziti1);
		mm.setFont(ziti1);
		dl.setFont(ziti2);
		qx.setFont(ziti2);
		zc.setFont(ziti2);

		yh.setBounds(120, 80, 80, 30);
		mm.setBounds(120, 150, 80, 30);
		yh1.setBounds(220, 80, 180, 30);
		mm1.setBounds(220, 150, 180, 30);
		look.setBounds(400, 150, 33, 24);
		dl.setBounds(160, 230, 80, 30);
		qx.setBounds(280, 230, 80, 30);
		zc.setBounds(160, 250, 80, 40);
		mm1.addKeyListener(this);
		look.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = String.valueOf(mm1.getPassword());
				System.out.println(mm1.getPassword());
				if (password.length() == 0) {
					JOptionPane.showMessageDialog(null, "密码不为空");

				}
				mm1.setEchoChar((char) 0);
			}
		});
		dl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pd == 1 || pd == 0) {
					File fName = new File("users.dat");
					try {
						FileReader fRead = new FileReader(fName);// FileReader
						BufferedReader bRead = new BufferedReader(fRead);
						String s = null;
						int judge = 1;
						while ((s = bRead.readLine()) != null) {
							StringBuilder zfBuilder = new StringBuilder();
							zfBuilder.append("ID:");
							zfBuilder.append(yh1.getText());
							zfBuilder.append("&&");
							zfBuilder.append("Password:");
							zfBuilder.append(String.valueOf(mm1.getPassword()));
							String ak = zfBuilder.toString();
							if (s.equals(ak)) {
								JOptionPane.showMessageDialog(null, "登录成功");
								yh1.setText("");
								mm1.setText("");
								judge = 0;
							}
							//break;
						}
						bRead.close();
						fRead.close();
						if (judge == 1) {
							JOptionPane.showMessageDialog(null, "用户名或密码错误", null, JOptionPane.ERROR_MESSAGE, null);
						}
						if (judge == 0) {
							new MainWid();
							dispose();// �ͷ��ɴ� Window�������������ӵ�е������������ʹ�õ����б�����Ļ��Դ
							return;
						}
					} catch (IOException event) {
						JOptionPane.showMessageDialog(null, "未知错误" + event, null, JOptionPane.ERROR_MESSAGE, null);

					}
				}
			}
		});
		zc.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ak1 = yh1.getText();
				ak2 = String.valueOf(mm1.getPassword());
				String fName = "users.dat";
				try {
					FileWriter writer = new FileWriter(fName, true);
					BufferedWriter outWriter = new BufferedWriter(writer);
					outWriter.write("ID:" + ak1 + "&&" + "Password:" + ak2);
					outWriter.newLine();
					outWriter.close();
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				yh1.setText("");
				mm1.setText("");
				JOptionPane.showMessageDialog(null, "��ϲ�㣬ע��ɹ���");
			}

		});

		Container c = getContentPane(); // ������������
		c.add(yh);
		c.add(mm);
		c.add(yh1);
		c.add(mm1);
		c.add(dl);
		c.add(qx);
		c.add(zc);
		c.add(look);
		setVisible(true);
		validate();
	}

	public void keyTyped(KeyEvent e) {
		if (!Character.isDigit(e.getKeyChar()) || e.getKeyCode() == KeyEvent.VK_SPACE) {
			e.setKeyChar((char) KeyEvent.VK_CANCEL);
		}
	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {

	}
}
