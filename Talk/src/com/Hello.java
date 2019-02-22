package com;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hello {
	static CardLayout card = null;
	static JPanel panel;
	static JPanel p1;
	static JFrame frame;
	public static void main(String[] args) {
		frame=new JFrame();
		frame.setTitle("窗口");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setResizable(false);
		//设置据中
		Toolkit  toolkit=Toolkit.getDefaultToolkit();
		Dimension screen=toolkit.getScreenSize();
		int x=(screen.width-frame.getWidth())/2;
		int y=(screen.height-frame.getHeight())/2-5;
		frame.setLocation(x, y);
		panel=new JPanel(card);
		frame.add(panel);
		print(panel);
		frame.setVisible(true);
	}
	public static void print(JPanel panel){
		panel.setLayout(card);
		
		JLabel label=new JLabel("当你看到这个窗口的时候我想你已经明白接下来将会发生什么了");
		JLabel label1=new JLabel("是的，没错，你猜的没错,点击付款会出现我的微信付款码");
		JLabel label2=new JLabel("最好不要尝试关闭窗口,还记得我跟你说过的那个删文件的病毒吗？");
		JLabel label3=new JLabel("它就在这。。。");
		label.setBounds(10, 20, 400, 25);
		label1.setBounds(10, 40, 400, 25);
		label2.setBounds(10, 60, 400, 25);
		label3.setBounds(10, 80, 400, 25);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		JLabel userLabel=new JLabel("叫爸爸也可以:");
		userLabel.setBounds(10, 120, 130, 25);
		panel.add(userLabel);
		
		final JTextField userText=new JTextField(20);
		userText.setBounds(100, 120, 165, 25);
		panel.add(userText);
		
		final JLabel label4=new JLabel();
		label4.setBounds(10, 200, 120, 25);
		panel.add(label4);
		
		JButton button = new JButton("确定");
        button.setBounds(140, 160, 80, 25);
        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=userText.getText();
				if(str!=null&&!"".equals(str)){
					if("爸爸".equals(str)){
						label4.setText("好孩子");
					}else{
						label4.setText("一键清空程序已启动");
					}
				}else{
					label4.setText("一键清空程序已启动");
				}
			}
		});
        panel.add(button);
        
        JButton button1 = new JButton("付款");
        button1.setBounds(250, 160, 80, 25);
        button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("付款");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setResizable(false);
				//设置据中
				Toolkit  toolkit=Toolkit.getDefaultToolkit();
				Dimension screen=toolkit.getScreenSize();
				int x=(screen.width-1079)/2;
				int y=0;
				frame.setLocation(x, y);
				p1=new JPanel();
				p1 = new JPanel() {
				   protected void paintComponent(Graphics g) {
						URL url= this.getClass().getResource("");
					    ImageIcon icon = new ImageIcon(url.getPath()+"fk.jpg");
					    Image img = icon.getImage();
					    g.drawImage(img, 0, 0, icon.getIconWidth(),icon.getIconHeight(), icon.getImageObserver());
					    frame.setSize(icon.getIconWidth(), icon.getIconHeight());
				   }
				};
				frame.add(p1);
				
				frame.setVisible(true);
			}
		});
        
        panel.add(button1);
	}
}
