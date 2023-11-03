public class FindLongestEvenWord{
	public static void main(String []args){
		String sentence = "Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them";
		System.out.println(findWord(sentence));
	}
	
	public static String findWord(String sentence){
		String str = sentence.replaceAll("[^a-zA-Z]"," ");
		String result="";
		String [] words = str.split(" ");
		
		for(String word:words){
			if(word.length() % 2 == 0 && word.length() > result.length())
				result=word;
		}
		
		return result;
	}
}