package refactoring.searchstack;

public class SearchableStack extends Stack {

	public boolean search(int target) {
		return vector.contains(new Integer(target));
	}			
}