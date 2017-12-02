import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class RnaTranscription {

    String transcribe(String dnaStrand) {

	List<String> asList = Arrays //
		.asList(dnaStrand.split(""));

	if (asList.stream().anyMatch(a -> !(a.equals("G") || a.equals("C") || a.equals("T") || a.equals("A")))) {
	    throw new IllegalArgumentException("Invalid input");
	}
	return asList //
		.stream()
		.map(c -> "C".equals(c) ? "G" : "G".equals(c) ? "C" : "T".equals(c) ? "A" : "A".equals(c) ? "U" : "")
		.collect(Collectors.joining());
    }

}
