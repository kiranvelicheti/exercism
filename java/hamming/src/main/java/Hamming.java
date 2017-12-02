import java.util.stream.IntStream;

public class Hamming {

    String leftStrand;
    String rightStrand;
    int hammingDistance = 0;

    Hamming(String leftStrand, String rightStrand) {
	this.leftStrand = leftStrand;
	this.rightStrand = rightStrand;
	if (leftStrand.length() != rightStrand.length()) {
	    throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
	}
    }

    int getHammingDistance() {
	IntStream //
		.range(0, leftStrand.length()) //
		.forEach(i -> {
		    if (leftStrand.charAt(i) != rightStrand.charAt(i))
			hammingDistance++;
		});
	return hammingDistance;
    }

}
