package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dictionary {
	
	private  Map<String, String> dictionary = new HashMap<>();

	public Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dictionary(Map<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
	}

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	public void setDictionary(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	@Override
	public String toString() {
		return "Dictionary [dictionary=" + dictionary + "]";
	}
	
	public void translating(File english, File ukranian) {
		try (BufferedReader br = new BufferedReader(new FileReader(english));
				PrintWriter pw = new PrintWriter(ukranian)) {

			for (;;) {
				String line  = br.readLine();
				if (line == null) {
					break;
				}
				String[] arr = line.split(" ");

				for (int i = 0; i < arr.length; i++) {
					if (dictionary.containsKey(arr[i])) {
						pw.print(dictionary.get(arr[i]) + " ");
					} else {
						pw.print("'Unknow word' ");
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editingDictionary (String englishWord, String ukranianWord) {
		dictionary.put(englishWord, ukranianWord);
	}
	
	public void savingDictionaryToCSV (File file) {
			String divider = ";";
			Set<Map.Entry<String, String>> set = dictionary.entrySet();
			try (PrintWriter pw = new PrintWriter(file)) {
				for (Entry<String, String> pair : set) {
					pw.println(pair + divider);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

	}





}
