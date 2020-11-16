package loadingConfig;

import java.io.IOException;
import java.util.HashMap;

public class TestLoadManager {
	public String baseUrl;

	public void loadConfigurations() {
		HashMap<String, String> configs = null;
		try {
			configs = new ConfigurationProvider().getDataFromTheFile("config.properties");
		} catch (IOException e) {
			throw new RuntimeException("Config file does not exist.");
		}
		baseUrl = configs.get(ConfigurationParameters.Url);
		System.out.println(baseUrl);
	}

}
