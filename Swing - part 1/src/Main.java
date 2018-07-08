import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		Okno okno = new Okno();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		okno.setLayout(null);
		okno.setSize(400, 300);
		okno.setLocationRelativeTo(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24,11, 300, 200);
		okno.add(scrollPane);
		JTextArea textArea = new JTextArea();
		textArea.setText("qweqeweqretretreytrytrytruyuytiuyiuyiuouiuoiuoiuouioiuotiu");
		scrollPane.setViewportView(textArea);
		
		//
		MainFrame mainJframe = new MainFrame();
		
	}

}
