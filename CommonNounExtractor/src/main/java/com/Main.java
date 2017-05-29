package main.java.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
		
	public static void main(String[] args) {
		//String filesDirectory = "D:\\SpringerNature\\machine learning test\\assignment\\Cell_Phones_and_Accessories_5_1000reviews.json";
		//String modelDirectory = "D:\\Lib\\tagger\\bidirectional-distsim-wsj-0-18.tagger";
		System.out.println(args[0]);
		System.out.println(args[1]);
		String filesDirectory = args[0];
		String modelDirectory = args[1];
		
		
		ObjectMapper mapper = new ObjectMapper();
		File f = new File(filesDirectory);
		PosTagger pos = new PosTagger(modelDirectory);
		Integer i = 0;
		try {
			BufferedReader b = new BufferedReader(new FileReader(f));
			String reviewString = "";
			while ((reviewString = b.readLine()) != null) {
				i++;
				ReviewPOJO review1 = mapper.readValue(reviewString, ReviewPOJO.class);
    			System.out.print("Review No. "+ i+" : ");
    			pos.getPosTag(review1.getReviewText());
    			System.out.println();
            }
			b.close();

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}
}
