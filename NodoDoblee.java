package doble;


public class NodoDoblee {

	
		private Musica dato;
		private NodoDoblee anterior;
		private NodoDoblee siguiente;
		
		
		public NodoDoblee(Musica dat, NodoDoblee ant, NodoDoblee sig) {
			siguiente=sig;
			anterior=ant;
			dato=dat;
		}
		
		public Musica getDato() {
			return dato;
		}
		public void setDato(Musica dato) {
			this.dato = dato;
		}
		public NodoDoblee getAnterior() {
			return anterior;
		}
		public void setAnterior(NodoDoblee anterior) {
			this.anterior = anterior;
		}
		public NodoDoblee getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(NodoDoblee siguiente) {
			this.siguiente = siguiente;
		}

}
