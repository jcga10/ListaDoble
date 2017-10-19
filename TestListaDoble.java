package doble;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.TextArea;

public class TestListaDoble extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtArtista;
	private JTextField txtAlbum;
	private JTextField txtGenero;
	
	Metodos met =new Metodos();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestListaDoble frame = new TestListaDoble();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestListaDoble() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(33, 11, 66, 14);
		contentPane.add(lblid);
		
		JLabel lblalbum = new JLabel("Album:");
		lblalbum.setBounds(21, 54, 46, 14);
		contentPane.add(lblalbum);
		
		JLabel lblartista = new JLabel("Artista:");
		lblartista.setBounds(203, 11, 46, 14);
		contentPane.add(lblartista);
		
		JLabel lblgenero = new JLabel("Genero:");
		lblgenero.setBounds(203, 54, 46, 14);
		contentPane.add(lblgenero);
		
		txtId = new JTextField();
		txtId.setBounds(67, 8, 98, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtArtista = new JTextField();
		txtArtista.setBounds(255, 8, 112, 20);
		contentPane.add(txtArtista);
		txtArtista.setColumns(10);
		
		txtAlbum = new JTextField();
		txtAlbum.setBounds(67, 51, 98, 20);
		contentPane.add(txtAlbum);
		txtAlbum.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(259, 51, 108, 20);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);
		
		TextArea scimprimir = new TextArea();
		scimprimir.setBounds(33, 160, 380, 160);
		contentPane.add(scimprimir);
		
		JButton btnAgregarInicio = new JButton("Agregar Inicio");
		btnAgregarInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Musica nuevo = new Musica();
			nuevo.setId((txtId.getText()));//txtId.getText());
			nuevo.setArtista(txtArtista.getText());
			nuevo.setGenero(txtGenero.getText());
			nuevo.setAlbum(txtAlbum.getText());
			met.insertar(nuevo);
			JOptionPane.showMessageDialog(null,"Datos insertados delante");
			
			
			}
		});
		btnAgregarInicio.setBounds(21, 100, 161, 20);
		contentPane.add(btnAgregarInicio);
		
		
//		JButton btnImprimir = new JButton("Imprimir");
//		btnImprimir.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				TestListaDoble tld = new TestListaDoble();
////				
////					if(tld.met.isvacio()){
////						scimprimir.setText("Lista Doble Vacia");
////					}
////					else{
////						scimprimir.setText(met.imprimir().toString());
////					}
////				
////					Musica mu= new Musica();
////					scimprimir.setText(mu.toString());
//				
//			}
//		});
//		btnImprimir.setBounds(67, 355, 89, 23);
//		contentPane.add(btnImprimir);
//		
		
	}
}
