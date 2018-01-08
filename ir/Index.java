import java.util.HashMap;
import java.util.Iterator;

public interface Index {

    /* Index types */
    public static final int HASHED_INDEX = 0;

    /* Query types */
    public static final int INTERSECTION_QUERY = 0;
    public static final int PHRASE_QUERY = 1;
    public static final int RANKED_QUERY = 2;
	
    /* Ranking types */
    public static final int TF_IDF = 0; 
    public static final int PAGERANK = 1; 
    public static final int COMBINATION = 2; 

    /* Structure types */
    public static final int UNIGRAM = 0; 
    public static final int BIGRAM = 1; 
    public static final int SUBPHRASE = 2; 
	
    public HashMap<String, String> docIDs = new HashMap<String,String>();
    public HashMap<String,Integer> docLengths = new HashMap<String,Integer>();

    public void insert( String token, int docID, int offset );
    public Iterator<String> getDictionary();
    public PostingsList getPostings( String token );
    public PostingsList search( Query query, int queryType, int rankingType, int structureType );
    public void cleanup();

}
		    
