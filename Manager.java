import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;

public class Manager {
	
	public static void preparingCorpus(File[] file_List,Hashtable<String, Integer> tableOfOnes,Hashtable<String, Integer> tableOfTwos){
		try{
			
			for(File single_file : file_List){
				if(single_file.isFile()){
					String line = null;
					BufferedReader buff = new BufferedReader(new FileReader(single_file));
					while( (line = buff.readLine()) != null){
						if( line.length() > 1 ){
							if((!line.contains("<")) && (!line.contains(">"))){
								String[] splittedLine = line.split("\\s+|(?=\\W\\p{Punct}|\\p{Punct}\\W)|(?<=\\W\\p{Punct}|\\p{Punct}\\W})"); /*Regex is from " http://stackoverflow.com/questions/24222730/split-a-string-and-separate-by-punctuation-and-whitespace "*/
								for(int iter=0; iter<splittedLine.length-1;iter++){
									Integer count = tableOfTwos.get(splittedLine[iter] + " " + splittedLine[iter+1]);
									tableOfTwos.put(splittedLine[iter] + " " + splittedLine[iter+1], (count==null) ? 1 : count + 1);
									
									Integer count2 = tableOfOnes.get(splittedLine[iter]);
									tableOfOnes.put(splittedLine[iter], (count2 == null) ? 1 : count2 + 1);		/*Counting the frequency of strings in corpus with HashMap : "http://www.mkyong.com/java/how-to-count-duplicated-items-in-java-list/" */
									
									if(iter == splittedLine.length-2){
										Integer count3 = tableOfOnes.get(splittedLine[iter + 1]);
										tableOfOnes.put(splittedLine[iter + 1], (count3 == null) ? 1 : count3 + 1);
									}
								}
							}
						}
					}
					buff.close();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void printingHashMap(Hashtable<String, Integer> tableOfOnes,Hashtable<String, Integer> tableOfTwos){
		for (Map.Entry<String, Integer> entry : tableOfTwos.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	public static void preparingSentences(String[] sentences,Hashtable<String, Integer> tableOfOnes,Hashtable<String, Integer> tableOfTwos){
		int sum_ValuesofOnes=0;
		for(int i : tableOfOnes.values()){
			sum_ValuesofOnes += i;
		}
		for(String sentence : sentences){
			String[] oneSentence = sentence.split(" ");
			calculatingTask1(sum_ValuesofOnes,oneSentence, tableOfOnes, tableOfTwos);
		}
	}
	
	public static void calculatingTask1(int sum_ValuesofOnes, String[] sentence,Hashtable<String, Integer> tableOfOnes,Hashtable<String, Integer> tableOfTwos){
		/*float probability = 0.0f;*/ 
		for(int i=0;i<sentence.length;i++){
			if(i==0){
				
			}else{
				
			}
		}
	}

}
