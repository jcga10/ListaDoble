package doble;



public class Metodos {
	
	
	private NodoDoblee head;

	
	public NodoDoblee getHead() {
		return head;
	}

	public void setHead(NodoDoblee head) {
		this.head = head;
	}

	public boolean isvacio(){
		boolean respuesta=false;
		if(this.head==null){
			respuesta=true;
		}
		return respuesta;
	}
	 public void insertar (Musica valor){
		 NodoDoblee nuevo = new NodoDoblee();
		 nuevo.setDato(valor);
		 nuevo.setSiguiente(null);
		 nuevo.setAnteior(null);
		 this.head=nuevo;
	 }

	 public void insertardelante(Musica valor){
		 if(isvacio()){
			 insertar(valor);
		 }
		 else{
			 NodoDoblee nuevo= new NodoDoblee();
			 nuevo.setDato(valor);
			 nuevo.setSiguiente(this.head);
			 nuevo.setAnteior(null);
			 this.head=nuevo;
		 }
	 }
	 
	 
	 public StringBuilder imprimir(){
			StringBuilder cadena = new StringBuilder();
			NodoDoblee temporal = new NodoDoblee();
			temporal=this.getHead();
			cadena.append("HEAD<-->");
			while(temporal!=null){
				cadena.append(temporal.getDato());
				cadena.append("<-->");
				temporal=temporal.getSiguiente();
			}
			cadena.append("NULL");
			return cadena;
		}
}
