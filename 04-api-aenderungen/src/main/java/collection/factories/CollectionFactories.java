package collection.factories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")
public class CollectionFactories {

	public static void main(String[] args) {
//		collectionErstellungBisJava8();
		collectionFactories();
//		mapErstellungBisJava8();
//		mapFactories();
	}

	private static void collectionErstellungBisJava8() {
		{
			// Erstellung von List mit Werten bisher durch manuelles einfuegen:
			List<String> strings = new ArrayList<>();
			strings.add("a");
			strings.add("b");
			strings.add("c");
		}

		{
			// Alternative Erstellung einer List ueber Factory in Arrays:
			List<String> strings = Arrays.asList("a", "b", "c");
			// Setzen eines Wertes moeglich:
			strings.set(0, "d");
			// Hinzufuegen eines Wertes ist nicht moeglich (UnsupportedOperationException):
			// strings.add("e");
			System.out.println(strings);
		}

		{
			// Erstellung von Set mit Werten bisher durch manuelles einfuegen:
			Set<String> strings = new HashSet<>();
			strings.add("a");
			strings.add("b");
			strings.add("c");
		}

		{
			// Erstellung von Set mit Werten mit Umweg ueber List:
			Set<String> strings = new HashSet<>(Arrays.asList("a", "b", "c"));
		}

	}
	
	private static void collectionFactories() {
		{
			// Erstellung einer List ueber Factory Methode:
			List<String> list = List.of("d", "e", "f");
			System.out.println("Liste: " + list);
//			list.add("g"); // funktioniert nicht, da Immutable
//			list.set(8, "x"); // funktioniert nicht, da Immutable
		}
		
		{
			// Erstellung eines Set ueber Factory Methode:
			Set<String> set = Set.of("d", "e", "f");
			System.out.println("Set: " + set);
//			set.add("g"); // funktioniert nicht, da Immutable
//			set = Set.of("x"); // funktioniert nicht, da Immutable

			// Unterschied unmodifiable / immutable
			// Basically unModifiable Collection is a view, So indirectly it could still be 'modified' from some other reference that is
			// modifiable. Also as its just a readonly view of annother collection , When the source collection changes unModifiable
			// Collection will always present with latest values.
			// However immutable Collection can be treated as a readonly copy of another collection and can not be modified.
			// In this case when the source collection changes , immutable Collection do not reflect the changes
		}
	}
	
	private static void mapErstellungBisJava8() {
		{
			Map<String, Integer> values = new HashMap<>();
			values.put("a", 1);
			values.put("b", 2);
			values.put("c", 3);
		}
	}
	
	private static void mapFactories() {
		{
			// Erstellung einer Map ueber Factory Methode:
		}
		
		{
			// Map.Entry Instanzen koennen jetzt auch direkt erzeugt werden:
			Map.Entry<String, Integer> entry = Map.entry("a", 1);
			
			// Erstellung einer Map ueber Factory Methode und Map.Entry Instanzen:
		}
	}
}
