package it.cfcalculator.randomGeneration;
import java.util.Map;
import it.cfCalculator.CfValidationException;
import it.cfCalculator.model.CfInputRequest;

public interface GenerazioneCodiciFiscali {
	/**
	 * <p>
	 * Genera un numero predefinito di codici fiscali casuali
	 * </p>
	 * @param numero il numero di codici fiscali che si desidera generare
	 * @return
	 * @throws CfValidationException
	 */
	public Map<String, CfInputRequest> getRandomCf(int numero) throws CfValidationException;
	
	

}
