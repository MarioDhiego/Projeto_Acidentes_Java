package abstracts;

import classes.TipoLocal;

public abstract class Local {
	TipoLocal tipoLocal;

	public TipoLocal getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(TipoLocal tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

}
