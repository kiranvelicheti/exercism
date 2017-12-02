public class PangramChecker {

    public boolean isPangram(String input) {
	return input //
		.toLowerCase() //
		.replaceAll(" ", "") //
		.replaceAll("_", "") //
		.replaceAll("[`~!@#$%^&*()_+,./{}|:\"<>?]", "") //
		.replaceAll("[0-9]", "") //
		.chars() //
		.distinct() //
		.sorted() //
		.count() == 26;
    }

}
