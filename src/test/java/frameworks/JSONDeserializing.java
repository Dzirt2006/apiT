package frameworks;

import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import APIData.DeserializeUser;

public interface JSONDeserializing {

	default void deserializeFromList(List<Object> clastList, JsonObject jsonObj) {
		for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
			try {
				JsonArray array = entry.getValue().getAsJsonArray();
				for (JsonElement elementJSON : array) {
					Gson gson = new Gson();
					System.out.println(elementJSON.toString());
					DeserializeUser tempUser = gson.fromJson(elementJSON, DeserializeUser.class);
					clastList.add(tempUser);
				}
			} catch (java.lang.IllegalStateException e) {
				continue;
			}
		}
	}
}
