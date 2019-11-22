public class Card {
	private String content;
	
	public Card (String c) {
		content = c;
	}

	public String getContent () {
		return content;
	}

	public int getOccurrences (Card[] a) {
		int occurrences = 0;
		for (int i=0; i < a.length; i++) {
			if (a[i].equals(this)) {
				occurrences++;
			}
		}
		return occurrences;
	}
}