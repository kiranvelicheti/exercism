import java.util.Arrays;

class Scrabble {

    private String scrabbleInput;

    Scrabble(String word) {
	this.scrabbleInput = word;
    }

    int getScore() {
	Arrays.asList(scrabbleInput.split("")).stream().map(a -> {
	    return "AEIOULNRST".contains(a);
	});
	return 1;
    }

}
