package abstracts;

import classes.TipoRodovia;

public abstract class Rodovia {
	TipoRodovia tipoRodovia;
	
	public abstract void imprimirRodovia();

	public TipoRodovia getTipoRodovia() {
		return tipoRodovia;
	}

	public void setTipoRodovia(TipoRodovia tipoRodovia) {
		this.tipoRodovia = tipoRodovia;
	}
	
}
