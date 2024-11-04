package interfaces;

import classes.Bairro;
import classes.Causa;
import classes.Fonte;
import classes.LocalOcorrenciaAcidente;
import classes.OcorrenciaAcidente;
import classes.RodoviaOcorrenciaAcidente;
import classes.TipoVia;
import classes.TipoZona;

public interface IocorrenciaAcidente {
	public OcorrenciaAcidente gravarOcorrenciaAcidente(Integer idOcorrenciaAcidente, 
			String logradouro, 
			String dtAcidente, 
			RodoviaOcorrenciaAcidente rodoviaOcorrenciaAcidente, 
			Fonte fonte, 
			Causa causa,
			TipoVia tipoVia,
			TipoZona tipoZona,
			LocalOcorrenciaAcidente localOcorrenciaAcidente,
			Bairro bairro);

}
