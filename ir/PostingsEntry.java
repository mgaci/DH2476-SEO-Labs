import java.io.Serializable;

public class PostingsEntry implements Comparable<PostingsEntry>, Serializable {
    
    public int docID;
    public double score;

    public PostingsEntry(int docID) {
        this.docID = docID;
    }
    /**
     *  PostingsEntries are compared by their score (only relevant 
     *  in ranked retrieval).
     *
     *  The comparison is defined so that entries will be put in 
     *  descending order.
     */
    public int compareTo( PostingsEntry other ) {
	return Double.compare( other.score, score );
    }
}

    
