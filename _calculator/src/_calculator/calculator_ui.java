package _calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator_ui implements ActionListener {
	
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel(new FlowLayout());
	
	JTextArea text = new JTextArea(1,18);
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");
	
	JButton butadd = new JButton("+");
	JButton butsub = new JButton("-");
	JButton butmulti = new JButton("*");
	JButton butdiv = new JButton("/");
	JButton butpow = new JButton("^");
	JButton butsqrt = new JButton("sqrt");
	JButton buteq = new JButton("=");
	JButton butclear = new JButton("C");
	JButton butpoint = new JButton(".");
	
	public void ui(){
		frame.setVisible(true);
		frame.setSize(250, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.add(text);
		
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		
		panel.add(butadd);
		panel.add(butsub);
		panel.add(butmulti);
		panel.add(butdiv);
		panel.add(butpow);
		panel.add(butsqrt);
		panel.add(butpoint);
		panel.add(buteq);
		panel.add(butclear);
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);
		butadd.addActionListener(this);
		butsub.addActionListener(this);
		butmulti.addActionListener(this);
		butdiv.addActionListener(this);
		butpow.addActionListener(this);
		butsqrt.addActionListener(this);
		butpoint.addActionListener(this);
		buteq.addActionListener(this);
		butclear.addActionListener(this);
		
	}

	String str, text_area;
	Double rez = 0.0, nr1, nr2;
	int addclc=0, subclc=0, multiclc=0, divclc=0, powclc=0, sqrtclc=0, k=0;
	int rez_i = 0;
	
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if(source==but1){
			text.append("1");
		}
		if(source==but2){
			text.append("2");
		}
		if(source==but3){
			text.append("3");
		}
		if(source==but4){
			text.append("4");
		}
		if(source==but5){
			text.append("5");
		}
		if(source==but6){
			text.append("6");
		}
		if(source==but7){
			text.append("7");
		}
		if(source==but8){
			text.append("8");
		}
		if(source==but9){
			text.append("9");
		}
		if(source==but0){
			text.append("0");
		}
		if(source==butadd || source==butsub || source==butmulti || source==butdiv || source==butpow || source==butsqrt){
			str = text.getText();
			if((addclc==0 && subclc==0 && multiclc==0 && divclc==0 && powclc==0 && sqrtclc==0))
				nr1 = Double.parseDouble(str);
			if(source==butadd){
				addclc=1;
				text.append("+");
				subclc=0;
				multiclc=0;
				divclc=0;
				powclc=0;
				sqrtclc=0;
				text.setText("");
				text.append(String.valueOf(nr1)+"+");
			}
			else if(source==butsub){
				subclc=1;
				text.append("-");
				addclc=0;
				multiclc=0;
				divclc=0;
				powclc=0;
				sqrtclc=0;
				text.setText("");
				text.append(String.valueOf(nr1)+"-");
			}
			else if(source==butmulti){
				multiclc=1;
				text.append("*");
				subclc=0;
				addclc=0;
				divclc=0;
				powclc=0;
				sqrtclc=0;
				text.setText("");
				text.append(String.valueOf(nr1)+"*");
			}
			else if(source==butdiv){
				divclc=1;
				text.append("/");
				subclc=0;
				multiclc=0;
				addclc=0;
				powclc=0;
				sqrtclc=0;
				text.setText("");
				text.append(String.valueOf(nr1)+"/");
			}
			else if(source==butpow){
				divclc=0;
				text.append("^");
				subclc=0;
				multiclc=0;
				addclc=0;
				powclc=1;
				sqrtclc=0;
				text.setText("");
				text.append(String.valueOf(nr1)+"^");
			}
			else if(source==butsqrt){
				divclc=0;
				//text.append("");
				subclc=0;
				multiclc=0;
				addclc=0;
				powclc=0;
				sqrtclc=1;
				text.setText("");
				text.append(String.valueOf(nr1));
			}
		}
		if(source==butpoint){
			text.append(".");
		}
		if(source==buteq){
			text_area = text.getText();
			char[] chr_arr = text_area.toCharArray();
			for(int i=0; i<text_area.length(); i++){
				if(chr_arr[i] == '+' || chr_arr[i] == '-' || chr_arr[i] == '*' || chr_arr[i] == '/' || chr_arr[i] == '^')
					k=i;
			}
			if(sqrtclc ==0){
				for(int j=0; j<=k; j++)
					chr_arr[j] = '0';
				nr2 = Double.parseDouble(String.valueOf(chr_arr));
			}
			text.append("");
			if(addclc != 0 )
				rez = nr1 + nr2;
			else if(subclc != 0 )
				rez = nr1 - nr2;
			else if(multiclc != 0 )
				rez = nr1 * nr2;
			else if(divclc != 0 )
				rez = nr1 / nr2;
			else if(powclc != 0 ){
				rez = Math.pow(nr1, nr2);
			}
			else if(sqrtclc != 0 ){
				rez = Math.sqrt(nr1);
			}
			if(rez%2 == 1 || rez%2 == 0){
				rez_i = rez.intValue();
				text.setText("");
				str = String.valueOf("="+rez_i);
				text.append(str);
				nr1 = (double) rez_i;
			}
			else{
				text.setText("");
				str = String.valueOf("="+rez);
				text.append(str);
				nr1 = rez;
			}
			
			//addclc=0; subclc=0; multiclc=0; divclc=0;
		}
		if(source==butclear){
			text.setText("");
			addclc=0; subclc=0; multiclc=0; divclc=0; powclc=0; sqrtclc=0;
			nr1=0.0; nr2=0.0;
		}
	}
	
}
