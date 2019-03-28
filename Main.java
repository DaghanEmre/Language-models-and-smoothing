import java.io.File;
import java.util.Hashtable;


public class Main {

	public static void main(String[] args) {
		Hashtable<String, Integer> tableOfOnes = new Hashtable<String,Integer>();
		Hashtable<String, Integer> tableOfTwos = new Hashtable<String,Integer>();
		
		/*String[] task_1_Sentences = {"To work or not to work , that is the problem !",
				"Shall sleep more , Theodore shall sleep more .",
				"It does not matter how slowly you go so log as you do not stop .",
				"Imagination is more important then knowledge ...",
				"Thou seest , the heavens , as troubled with man ' s act"};*/
		
		try {
			File folder = new File("C:\\Users\\EMRE\\Desktop\\BBM495(Doðal Dil Ýþleme)\\BBM 497(NLP lab)\\workspace\\1stProject_BBM497\\data\\comedies");
			File[] file_List = folder.listFiles();
			Manager.preparingCorpus(file_List, tableOfOnes, tableOfTwos);;
			Manager.printingHashMap(tableOfOnes, tableOfTwos);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
