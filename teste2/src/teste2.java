import javax.swing.JOptionPane;


public class teste2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String aux = "";
		int x=0;
		
		aux= JOptionPane.showInputDialog("informe numero");
		x = Integer.parseInt (aux);
		
		
		if(x%2==0 ){
			
			 JOptionPane.showMessageDialog(null,"numero par ");
			
			
		}
		
		else {
			JOptionPane.showMessageDialog(null,"numero impar ");
			
			
		}

	}

}
