package com.example.demowearapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import android.os.AsyncTask;

import com.cd.reddit.Reddit;
import com.cd.reddit.RedditException;
import com.cd.reddit.json.mapping.RedditJsonMessage;
import com.cd.reddit.json.mapping.RedditLink;

public class RetrieveAwwTask extends AsyncTask<String, Void, List<String>> {

	    private Exception exception;

	    protected ArrayList<String> doInBackground(String... urls) {
			Reddit reddit = new Reddit("bot/1.0 by name");
			 try {
				RedditJsonMessage response = reddit.login( "", "" );
				List<RedditLink> links = reddit.listingFor("aww", "hot");
				for(RedditLink rl: links){
					System.out.println(rl.getUrl());
				}
				return new ArrayList<String>();
			} catch (RedditException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return new ArrayList<String>();
	    }

	    protected void onPostExecute( ArrayList<String> str) {
	        // TODO: check this.exception 
	        // TODO: do something with the feed
	    }
	
}
