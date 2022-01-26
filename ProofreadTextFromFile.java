package homeworkLetterStatistics;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class ProofreadTextFromFile {
	
	Map<Character, Integer> map = new HashMap<>();

	public ProofreadTextFromFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProofreadTextFromFile(HashMap<Character, Integer> map) {
		super();
		this.map = map;
	}

	public HashMap<Character, Integer> getMap() {
		return (HashMap<Character, Integer>) map;
	}

	public void setMap(HashMap<Character, Integer> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ProofreadTextFromFile [map=" + map + "]";
	}
	
	 public void reader (File file) {
	        try (InputStream inputStream = new FileInputStream(file); BufferedReader in
	                = new BufferedReader(new InputStreamReader(inputStream))) {
	            int data = in.read();
	            while (data != -1) {
	                char theChar = (char) Character.toLowerCase(data);
	                if (!map.containsKey(theChar)) {
	                    map.put(theChar, 1);
	                } else {
	                    map.put(theChar, map.get(theChar) + 1);
	                }
	                data = in.read();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        map = map.entrySet()
	                .stream()
	                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
	                .collect(Collectors.toMap(
	                        Map.Entry::getKey,
	                        Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, HashMap::new));
	    }


}
