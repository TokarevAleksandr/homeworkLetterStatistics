package sample;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String> dict = new HashMap<>();
		dict.put("family", "��'�");
		dict.put("my", "���");
		dict.put("there", "���");
		dict.put("are", "�");
		dict.put("five", "�'���");
		dict.put("of", "�");
		dict.put("us", "���");
		dict.put("parents", "������");
		dict.put("elder", "�������");
		dict.put("brother", "����");
		dict.put("baby", "������");
		dict.put("sister", "������");
		dict.put("and", "�");
		dict.put("me", "����");
		dict.put("first", "��������");
		dict.put("meet", "���������");
		dict.put("mum", "����");
		dict.put("dad", "����");
		dict.put("jane", "�����");
		dict.put("michael", "�����");
		dict.put("enjoys", "�������������");
		dict.put("reading", "�������");
		dict.put("playing", "������");
		dict.put("chess", "����");
		dict.put("with", "�");
		dict.put("ken", "���");
		dict.put("is", "�");
		dict.put("slim", "��������");
		dict.put("rather", "������");
		dict.put("tall", "�������");
		dict.put("she", "����");
		dict.put("has", "��");
		dict.put("long", "�����");
		dict.put("red", "��������");
		dict.put("big", "�������");
		dict.put("brown", "����������");
		dict.put("eyes", "���");
		dict.put("very", "����");
		dict.put("pleasant", "�������");
		dict.put("smile", "����������");
		dict.put("soft", "�'����");
		dict.put("voice", "�����");
		dict.put("mother", "����");
		dict.put("kind", "���");
		dict.put("understanding", "��������");
		dict.put("we", "��");
		dict.put("real", "��������");
		dict.put("friends", "����");
		dict.put("housewife", "��������������");
		dict.put("as", "��");
		dict.put("three", "���");
		dict.put("children", "����");
		dict.put("busy", "�������");
		dict.put("around", "�������");
		dict.put("house", "�������");
		dict.put("takes", "����");
		dict.put("care", "������");
		dict.put("meg", "���");
		dict.put("who", "���");
		dict.put("only", "�����");
		dict.put("months", "������");
		dict.put("old", "������");
		dict.put("small", "�����");
		dict.put("funny", "�����");
		dict.put("sleeps", "�����");
		dict.put("eats", "����");
		dict.put("sometimes", "����");
		dict.put("cries", "�����");
		dict.put("help", "���������");
		dict.put("our", "���");
		dict.put("let", "��������");
		dict.put("her", "��");
		dict.put("have", "�����");
		dict.put("rest", "���������");
		dict.put("in", "�");
		dict.put("evening", "�������");
		dict.put("then", "���");
		dict.put("usually", "��������");
		dict.put("reads", "����");
		dict.put("book", "�����");
		dict.put("or", "���");
		dict.put("just", "������");
		dict.put("watches", "���������");
		dict.put("TV", "��������");
		dict.put("doctor", "����");
		dict.put("he", "��");
		dict.put("handsome", "��������");
		dict.put("short", "��������");
		dict.put("dark", "������");
		dict.put("hair", "�������");
		dict.put("gray", "����");
		dict.put("hardworking", "�����������");
		dict.put("man", "������");
		dict.put("strict", "�������");
		dict.put("but", "���");
		dict.put("always", "������");
		dict.put("fair", "������������");
		dict.put("thirteen", "����������");
		dict.put("clever", "��������");
		dict.put("good", "�����");
		dict.put("at", "��");
		dict.put("maths", "����������");
		dict.put("helps", "��������");
		dict.put("it", "��");
		dict.put("because", "���� ��");
		dict.put("i", "�");
		dict.put("can", "����");
		dict.put("hardly", "������ ��");
		dict.put("understand", "��������");
		dict.put("all", "��");
		dict.put("these", "��");
		dict.put("sums", "����");
		dict.put("problems", "��������");
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
