package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by pennyfea on 11/1/17.
 */

abstract class LonelyTweet implements Serializable {
    private static final long serialVersionUID = 1L;
    Date tweetDate;
    String tweetBody;

    private Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    protected abstract String getTweetBody();

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    public abstract boolean isValid();

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
