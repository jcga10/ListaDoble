package doble;

public class NodoDoblee {

	
		private Musica dato;
		private NodoDoblee anterior;
		private NodoDoblee siguiente;
		
		
		
		
		public Musica getDato() {
			return dato;
		}
		public void setDato(Musica dato) {
			this.dato = dato;
		}
		public NodoDoblee getAnteior() {
			return anterior;
		}
		public void setAnteior(NodoDoblee anterior) {
			this.anterior = anterior;
		}
		public NodoDoblee getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(NodoDoblee siguiente) {
			this.siguiente = siguiente;
		}

}
