package herancaExemplo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AncestralFrame extends JFrame{

	public JButton btnClick = new JButton("Click");
	public JButton btnClick3 = new JButton("Click3");
	
	public AncestralFrame() {
		super("Exemplo Ancestral");
		this.setBounds(100, 100, 400, 300);
		this.setLayout(null);
		
		this.btnClick.setBounds(100, 100, 100, 30);
		this.add(btnClick);
		
		this.btnClick3.setBounds(100, 190, 100, 30);
		this.add(btnClick3);
		
		this.setVisible(true);
	}
	

}