import java.awt.Button;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.GridLayout;

import javax.swing.JPanel;
//creation de la fenettre
public class Panneaux1 extends JFrame {
	private Button p1,p2,p3,p4,p11,p12;
	//constructeur de le fenetre 
	public Panneaux1 () {
		this.setSize(300, 200);
		GridLayout MaGrille= new GridLayout(1,2);
		JPanel p1= new JPanel();
		JPanel p2 = new JPanel();
		//colloration de la fenetre p2
		
		p2.setBackground(Color.RED);
		
		setLayout(MaGrille);
		GridLayout MaGrille2= new GridLayout(2,1);
		JPanel p11 = new JPanel();
		JPanel p12= new JPanel();
		p1.setLayout(MaGrille2);
		
		p1.add(p11);
		p1.add(p12);
		p12.setBackground(Color.BLUE);
		GridLayout Gl= new GridLayout(1,2);
		p11.setLayout(Gl);
		JPanel p111 = new JPanel();
		JPanel p112 = new JPanel();
		p111.setBackground(Color.YELLOW);
		p112.setBackground(Color.GREEN);
		p11.add(p111);
		p11.add(p112);
		
		this.getContentPane().add(p1);
		this.getContentPane().add(p2);
		setVisible(true);
		
		
		
		
	}

}
