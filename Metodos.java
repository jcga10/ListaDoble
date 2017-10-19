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
		
		if(inicio==null){
			inicio=new NodoDoblee(dato,null,null);
			inicio=fin;
		}else{
			NodoDoblee nuevo= new NodoDoblee(dato,fin,null);
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	}
	
	public void mostraradelantes(){
		NodoDoblee temp=inicio;
		while(temp!=null){
			System.out.println(temp.getDato());
			temp=temp.getSiguiente();
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
	
	public void mostraratras(){
		NodoDoblee temp=fin;
		while(temp!=null){
			System.out.println(temp.getDato());
			temp=temp.getAnterior();
		}
	}
		
}
