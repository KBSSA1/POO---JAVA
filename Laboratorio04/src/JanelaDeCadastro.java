import javax.swing.JFrame;

public class JanelaDeCadastro extends JFrame {
	
		public JanelaDeCadastro() {
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setSize(600, 800);
			this.setTitle("MONTEIRO MOTOS");
			this.setResizable(false);//nao pode redimencionar a janela
			this.setLayout(null); // apagando o gerenciador de layout para fazer do jeito que eu quero
			this.setVisible(true);
			
		}
		
}
