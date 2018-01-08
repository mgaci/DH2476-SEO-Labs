 /*  
 *   This file is part of the computer assignment for the
 *   Information Retrieval course at KTH.
 * 
 *   First version:  Johan Boye, 2010
 *   Second version: Johan Boye, 2012
 *   Additions: Hedvig Kjellström, 2012-14
 */  


package ir;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/**
 *   Implements an inverted index as a Hashtable from words to PostingsLists.
 */
public class HashedIndex implements Index {

    /** The index as a hashtable. */
    private HashMap<String,PostingsList> index = new HashMap<String,PostingsList>();


    /**
     *  Inserts this token in the index.
     */
    public void insert(String token, int docID, int offset) {
        PostingsList posting = index.get(token);
        if(posting == null){
            posting = new PostingsList();
            PostingsEntry entry = new PostingsEntry(docID);
            posting.add(entry);
            index.put(token, posting);
        }
    }


    /**
     *  Returns all the words in the index.
     */
    public Iterator<String> getDictionary() {
        Set<String> dictionary = index.keySet();
        return dictionary.iterator();
    }


    /**
     *  Returns the postings for a specific term, or null
     *  if the term is not in the index.
     */
    public PostingsList getPostings(String token) {
        PostingsList posting = index.get(token);
        if(posting != null){
            return posting;
        }else{
            return null;
        }
    }


    /**
     *  Searches the index for postings matching the query.
     */
    public PostingsList search(Query query, int queryType, int rankingType, int structureType) {
        String word = query.terms.get(0);
        PostingsList serachedList = index.get(word);
        return serachedList;
    }


    /**
     *  No need for cleanup in a HashedIndex.
     */
    public void cleanup() {
    }
}
