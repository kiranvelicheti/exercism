import java.util.Arrays;

public class Acronym {
    String phrase;

    Acronym(String phrase) {
	this.phrase = phrase;
    }

    public String get() {

	return Arrays.asList(phrase.replace("-", " ").split(" "))//
		.stream()//
		.map(a -> a.substring(0, 1)) //
		.map(b -> b.toUpperCase()) //
		.reduce((s, f) -> s + f) //
		.get();
    }

}
