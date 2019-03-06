import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeC extends JFrame implements ActionListener {
	private static int WIDTH =300 ;
	private static int HEIGHT =200 ;
    private BorderLayout bd;

	private int cpt =0;
	private JPanel pG= new JPanel();
	private JButton b =  new JButton("Changer");
	private CardLayout cd = new CardLayout();
	
	public ChangeC() {
		super("Change Couleur");
		this.setSize(WIDTH,HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		bd = new BorderLayout();
		
		setLayout(bd);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.GRAY);
		p5.setBackground(Color.YELLOW);
		pG.setLayout(cd);
		pG.add("1",p1);
		pG.add("2",p2);
		pG.add("3",p3);
		pG.add("4",p4);
		pG.add("5",p5);
				
		this.getContentPane().add(pG, BorderLayout.CENTER);
		b.addActionListener(this);
		this.getContentPane().add(b, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*if(e.getSource() == b && cpt<=5 ) {
			this.cpt+=1;
			String s = String.valueOf(cpt);
			cd.show(pG,s);
		}
		else {
			this.cpt = 0;
			this.cpt+=1;			
			String s = String.valueOf(cpt);
			cd.show(pG,s);
		}*/
		
		if(e.getSource() == b && cpt<=5 ) {
			cd.next(pG);
		}
	}
	
	public static void main(String[] args) {
		ChangeC unJeu = new ChangeC();

	}
}
