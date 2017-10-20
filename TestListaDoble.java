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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestListaDoble extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtArtista;
	private JTextField txtAlbum;
	private JTextField txtGenero;
	
	Metodos met =new Metodos();
	private JTextField txtBuscar;


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
		setTitle("Lista Doble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setFont(new Font("Verdana", Font.BOLD, 13));
		lblid.setBounds(61, 12, 24, 14);
		contentPane.add(lblid);
		
		JLabel lblalbum = new JLabel("Album:");
		lblalbum.setFont(new Font("Verdana", Font.BOLD, 13));
		lblalbum.setBounds(49, 55, 58, 14);
		contentPane.add(lblalbum);
		
		JLabel lblartista = new JLabel("Artista:");
		lblartista.setFont(new Font("Verdana", Font.BOLD, 13));
		lblartista.setBounds(231, 12, 61, 14);
		contentPane.add(lblartista);
		
		JLabel lblgenero = new JLabel("Genero:");
		lblgenero.setFont(new Font("Verdana", Font.BOLD, 13));
		lblgenero.setBounds(231, 55, 61, 14);
		contentPane.add(lblgenero);
		
		txtId = new JTextField();
		txtId.setBounds(117, 11, 98, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtArtista = new JTextField();
		txtArtista.setBounds(302, 11, 112, 20);
		contentPane.add(txtArtista);
		txtArtista.setColumns(10);
		
		txtAlbum = new JTextField();
		txtAlbum.setBounds(117, 54, 98, 20);
		contentPane.add(txtAlbum);
		txtAlbum.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(302, 54, 108, 20);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);
		
		TextArea scimprimir = new TextArea();
		scimprimir.setBounds(33, 160, 414, 160);
		contentPane.add(scimprimir);
		
		JButton btnAgregarInicio = new JButton("Agregar Inicio");
		btnAgregarInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregarInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregarInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Musica nuevo = new Musica();
			
			if(txtId.getText().isEmpty()||txtArtista.getText().isEmpty()||txtAlbum.getText().isEmpty()||txtGenero.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "¡Completa todos los campos por favor!");
			}else{
			nuevo.setId((txtId.getText()));//txtId.getText());
			nuevo.setArtista(txtArtista.getText());
			nuevo.setGenero(txtGenero.getText());
			nuevo.setAlbum(txtAlbum.getText());
			met.insertarinicio(nuevo);
			JOptionPane.showMessageDialog(null,"Datos insertados delante");
			}
			
			}
			
			});
		btnAgregarInicio.setBounds(61, 100, 161, 20);
		contentPane.add(btnAgregarInicio);
		
		
		JButton btnImprimir = new JButton("Imprimir Adelante");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnImprimir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(met.isVacio()){
					JOptionPane.showMessageDialog(null, "¡LA LISTA ESTA VACIA!");
				}else{
					JOptionPane.showMessageDialog(null, "Se ha imprimido la lista:");
				}
				
						scimprimir.setText(met.mostrardelante().toString());

			}
		});
		btnImprimir.setBounds(61, 332, 143, 20);
		contentPane.add(btnImprimir);
		
		JButton btnAgregarFin = new JButton("Agregar Fin");
		btnAgregarFin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Musica nuevo = new Musica();
				
				if(txtId.getText().isEmpty()||txtArtista.getText().isEmpty()||txtAlbum.getText().isEmpty()||txtGenero.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "¡Completa todos los campos por favor!");
				}else{
				nuevo.setId(txtId.getText());;
				nuevo.setArtista(txtArtista.getText());
				nuevo.setGenero(txtGenero.getText());
				nuevo.setAlbum(txtAlbum.getText());
				met.insertarfin(nuevo);
				JOptionPane.showMessageDialog(null,"Datos insertados Atras");
				}
				
			}
		});
		btnAgregarFin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregarFin.setBounds(249, 100, 161, 20);
		contentPane.add(btnAgregarFin);
		
		JButton btnEliminarInicio = new JButton("Eliminar Inicio");
		btnEliminarInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(met.isVacio()){
					JOptionPane.showMessageDialog(null, "¡Ingresa un elemento en la lista para eliminar!");
				}else{
					int resp=JOptionPane.showConfirmDialog(null, "¿Desea eliminar el primer elemento de la lista?");
					if(JOptionPane.OK_OPTION==resp){
						met.eliminarinicio();
						JOptionPane.showMessageDialog(null, "¡Primer Elemnto de la lista eliminado!");
						scimprimir.setText("");
					}
				}
				
			}
		});
		btnEliminarInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarInicio.setBounds(61, 131, 161, 20);
		contentPane.add(btnEliminarInicio);
		
		JButton btnEliminarFin = new JButton("Eliminar Fin");
		btnEliminarFin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(met.isVacio()){
					JOptionPane.showMessageDialog(null, "¡Ingresa un elemento en la lista para eliminar!");
				}else{
					int resp=JOptionPane.showConfirmDialog(null, "¿Desea eliminar el último elemento de la lista?");
					if(JOptionPane.OK_OPTION==resp){
						met.eliminarfin();
						JOptionPane.showMessageDialog(null, "¡Último Elemnto de la lista eliminado!");
						scimprimir.setText("");
					}
				}
				
			}
		});
		btnEliminarFin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarFin.setBounds(249, 131, 161, 20);
		contentPane.add(btnEliminarFin);
		
		JButton btnImprimirAtras = new JButton("Imprimir Atras");
		btnImprimirAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(met.isVacio()){
					JOptionPane.showMessageDialog(null, "¡LA LISTA ESTA VACIA!");
				}else{
					JOptionPane.showMessageDialog(null, "Se ha imprimido la lista:");
				}
				
						scimprimir.setText(met.mostraratras().toString());
			}
		});
		btnImprimirAtras.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnImprimirAtras.setBounds(231, 332, 143, 20);
		contentPane.add(btnImprimirAtras);
		
		JLabel lblBusqueda = new JLabel("Busqueda:");
		lblBusqueda.setFont(new Font("Verdana", Font.BOLD, 13));
		lblBusqueda.setBounds(61, 377, 83, 20);
		contentPane.add(lblBusqueda);
		
		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(154, 376, 98, 20);
		contentPane.add(txtBuscar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String dato=txtBuscar.getText();
				
				if(txtBuscar.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "¡Escribe un elemento a buscar en el cuadro de texto!");
				}else{
					if(met.buscarr(dato)){
						JOptionPane.showMessageDialog(null, "El elemento: "+dato+" se encuentra en la lista");	
					}else{
						JOptionPane.showMessageDialog(null, "El elemento: "+dato+" no se encuentra en la lista");	
					}
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscar.setBounds(271, 375, 143, 20);
		contentPane.add(btnBuscar);
		
		
	}
}
