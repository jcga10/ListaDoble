package doble;


public class Metodos {
	
	private NodoDoblee inicio;
	private NodoDoblee fin;
	
	public Metodos(){
		inicio=null;
		fin=null;
	}

	public void insertarinicio(Musica dato){
		
		if(inicio==null){
			inicio=new NodoDoblee(dato,null,null);
			fin=inicio;
		}else{
			NodoDoblee nuevo= new NodoDoblee(dato,null,inicio);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
		}
	}
	
	public boolean isVacio(){
		if(fin==null&&inicio==null){
			return true;
		}else{
			return false;
		}
	}
	
	
	public void insertarfin(Musica dato){
		
		if(fin==null){
			fin=new NodoDoblee(dato,null,null);
			inicio=fin;
		}else{
			NodoDoblee nuevo= new NodoDoblee(dato,fin,null);
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	}
	
	
	public StringBuilder mostrardelante(){
		StringBuilder cadena = new StringBuilder();
		NodoDoblee temp= inicio;
		cadena.append("NULL<-->");
		while(temp!=null){
			cadena.append(temp.getDato());
			cadena.append("<-->");
			temp=temp.getSiguiente();
		}
		cadena.append("NULL");
		return cadena;
	}
	
	public StringBuilder mostraratras(){
		StringBuilder cadena = new StringBuilder();
		NodoDoblee temp= fin;
		cadena.append("NULL<-->");
		while(temp!=null){
			cadena.append(temp.getDato());
			cadena.append("<-->");
			temp=temp.getAnterior();
		}
		cadena.append("NULL");
		return cadena;
	}
	
	
	
	public boolean buscar(String dato){
		NodoDoblee temp=inicio;
		while(temp!=null){
			if(temp.getDato().getId().equals(dato)){
				return true;
			}
			temp=temp.getSiguiente();
		}
		
		return false;
	}
	
	
	public Musica eliminarinicio(){
		Musica dato=inicio.getDato();
		
		inicio=inicio.getSiguiente();
		
		if(inicio !=null){
			inicio.setAnterior(null);
		}else{
			fin=null;
		}
		return dato;
	}
	
	
	public Musica eliminarfin(){
		Musica dato=fin.getDato();
		
		fin=fin.getAnterior();
		
		if(fin !=null){
			fin.setSiguiente(null);
		}else{
			inicio=null;
		}
		return dato;
	}
	
	
		
}
