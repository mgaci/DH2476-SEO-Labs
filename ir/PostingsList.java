import java.util.LinkedList;
import java.io.Serializable;

/**
 *   A list of postings for a given word.
 */
public class PostingsList implements Serializable {
    
    /** The postings list as a linked list. */
    private LinkedList<PostingsEntry> list = new LinkedList<PostingsEntry>();


    /**  Number of postings in this list  */
    public int size() {
	return list.size();
    }

    /**  Returns the ith posting */
    public PostingsEntry get( int i ) {
	return list.get( i );
    }

    public LinkedList<PostingsEntry> add(PostingsEntry newEntry){
        list.add(newEntry);
        return list;
    }
}
	

			   
