import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("João");
		list.add("Alex");
		list.add("Anna");
		list.add(2, "Felipe");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		list.removeIf(x -> x.charAt(0) == 'F'); // Remover itens que iniciam com letra F

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------");

		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		System.out.println("Index of Anna: " + list.indexOf("Felipe"));

		System.out.println("-----------------------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Aplicação de filtro

		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(nome);

	}
}