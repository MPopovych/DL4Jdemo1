import org.deeplearning4j.nn.modelimport.keras.KerasModelImport;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;

import java.io.IOException;

class StuckMain {
	public static void main(String[] args) throws IOException, UnsupportedKerasConfigurationException, InvalidKerasConfigurationException {
		String filePath = "res/export_model.h5";
		MultiLayerNetwork model = KerasModelImport.importKerasSequentialModelAndWeights(filePath, false);
		System.out.println("\u001B[32mLoaded model\u001B[0m");
	}
}