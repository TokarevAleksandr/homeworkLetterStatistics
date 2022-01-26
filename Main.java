package sample;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String> dict = new HashMap<>();
		dict.put("family", "сім'я");
		dict.put("my", "моя");
		dict.put("there", "там");
		dict.put("are", "є");
		dict.put("five", "п'ять");
		dict.put("of", "з");
		dict.put("us", "нас");
		dict.put("parents", "батьків");
		dict.put("elder", "старший");
		dict.put("brother", "брат");
		dict.put("baby", "дитина");
		dict.put("sister", "сестра");
		dict.put("and", "і");
		dict.put("me", "мене");
		dict.put("first", "спочатку");
		dict.put("meet", "зустрітися");
		dict.put("mum", "мама");
		dict.put("dad", "папа");
		dict.put("jane", "Джейн");
		dict.put("michael", "Майкл");
		dict.put("enjoys", "насолоджується");
		dict.put("reading", "читання");
		dict.put("playing", "граючи");
		dict.put("chess", "шахи");
		dict.put("with", "з");
		dict.put("ken", "Кен");
		dict.put("is", "є");
		dict.put("slim", "стрункий");
		dict.put("rather", "скоріше");
		dict.put("tall", "високий");
		dict.put("she", "вона");
		dict.put("has", "має");
		dict.put("long", "довго");
		dict.put("red", "червоний");
		dict.put("big", "великий");
		dict.put("brown", "коричневий");
		dict.put("eyes", "очі");
		dict.put("very", "дуже");
		dict.put("pleasant", "приємний");
		dict.put("smile", "посміхатися");
		dict.put("soft", "м'який");
		dict.put("voice", "голос");
		dict.put("mother", "мати");
		dict.put("kind", "вид");
		dict.put("understanding", "розуміння");
		dict.put("we", "ми");
		dict.put("real", "справжній");
		dict.put("friends", "друзі");
		dict.put("housewife", "домогосподарка");
		dict.put("as", "як");
		dict.put("three", "три");
		dict.put("children", "дітей");
		dict.put("busy", "зайняте");
		dict.put("around", "навколо");
		dict.put("house", "будинок");
		dict.put("takes", "бере");
		dict.put("care", "догляд");
		dict.put("meg", "Мег");
		dict.put("who", "хто");
		dict.put("only", "тільки");
		dict.put("months", "місяців");
		dict.put("old", "старий");
		dict.put("small", "малий");
		dict.put("funny", "смішно");
		dict.put("sleeps", "спить");
		dict.put("eats", "їсть");
		dict.put("sometimes", "іноді");
		dict.put("cries", "плаче");
		dict.put("help", "допомогти");
		dict.put("our", "наш");
		dict.put("let", "дозволяє");
		dict.put("her", "її");
		dict.put("have", "мають");
		dict.put("rest", "відпочинок");
		dict.put("in", "в");
		dict.put("evening", "вечірній");
		dict.put("then", "тоді");
		dict.put("usually", "зазвичай");
		dict.put("reads", "читає");
		dict.put("book", "книга");
		dict.put("or", "або");
		dict.put("just", "просто");
		dict.put("watches", "годинники");
		dict.put("TV", "телевізор");
		dict.put("doctor", "лікар");
		dict.put("he", "він");
		dict.put("handsome", "красивий");
		dict.put("short", "короткий");
		dict.put("dark", "темний");
		dict.put("hair", "волосся");
		dict.put("gray", "сірий");
		dict.put("hardworking", "працьовитий");
		dict.put("man", "чоловік");
		dict.put("strict", "суворий");
		dict.put("but", "але");
		dict.put("always", "завжди");
		dict.put("fair", "справедливий");
		dict.put("thirteen", "тринадцять");
		dict.put("clever", "розумний");
		dict.put("good", "добре");
		dict.put("at", "на");
		dict.put("maths", "математика");
		dict.put("helps", "допомагає");
		dict.put("it", "це");
		dict.put("because", "тому що");
		dict.put("i", "я");
		dict.put("can", "може");
		dict.put("hardly", "навряд чи");
		dict.put("understand", "зрозуміти");
		dict.put("all", "всі");
		dict.put("these", "ці");
		dict.put("sums", "суми");
		dict.put("problems", "проблеми");
		System.out.println(dict);

		 Dictionary  tr = new  Dictionary(dict);

		File english = new File("English_in.txt");
		File ukranian = new File("Ukrainian_out.txt");
		File dictionary = new File("Dictionary.csv");

		tr.translating(english, ukranian);

		for (;;) {
			System.out.println("Enter a new pair of words and enter s to save");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine();
			if (command.equals("s")) {
				tr.savingDictionaryToCSV(dictionary);
				break;
			} else {
				String[] arr = command.split(" ");
				tr.editingDictionary(arr[0], arr[1]);
			}
		}
		

	}
}
