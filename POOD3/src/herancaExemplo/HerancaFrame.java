package herancaExemplo;

import javax.swing.JButton;

public class HerancaFrame  extends AncestralFrame{

	public JButton btnClick2 = new JButton("Click 2");
	
	public HerancaFrame() {
		super();
		this.setBounds(400, 100, 400, 300);
		this.setTitle("Exemplo Herança");
		this.btnClick2.setBounds(100, 200, 100, 30);
		this.add(btnClick2);
	}
}