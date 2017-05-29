package main.java.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class PosTagger {
	
	MaxentTagger tagger;
	PosTagger(String modelDirectory){
		
		try {
			tagger = new MaxentTagger(modelDirectory);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getPosTag(String review){
		
		// Initialize the tagger
		String tagged = tagger.tagString(review);
		//tagged = 
		String patternStringOne = "(\\w+)(/JJ[RS]?) (\\w+)(/NNS?) ";
		String patternStringTwo = "(\\w+)(/NNS?) ";
		
		Pattern patternOne = Pattern.compile(patternStringOne, Pattern.CASE_INSENSITIVE);
		Pattern patternTwo = Pattern.compile(patternStringTwo, Pattern.CASE_INSENSITIVE);
		Matcher matcherOne = patternOne.matcher(tagged);
		Matcher matcherTwo = patternTwo.matcher(tagged);
		while(matcherOne.find()){
			System.out.print(matcherOne.group(1) + matcherOne.group(2)+" "+matcherOne.group(3)+matcherOne.group(4)+"; ");
		}
		while(matcherTwo.find()){
			System.out.print(matcherTwo.group(1) + matcherTwo.group(2)+"; ");
		}
		
	}
}
