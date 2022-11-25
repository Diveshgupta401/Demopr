package prati;

public class array {

	
		 public static void main(String[] args) {
		        String str = "Today is the greatest day ever";
		        char[] words = str.toCharArray();
		        // seperating the words
		        // for (char string : words) {
		        // System.out.println(string);
		        // }

		        // checking frequency
		        int[] freq = new int[words.length];
		        for (int i = 0; i < words.length; i++) {
		            freq[i] = 1;
		            for (int j = i + 1; j < words.length; j++) {
		                if (words[i] == words[j]) {
		                    freq[i]++;
		                    // Set string[j] to 0 to avoid printing visited character
		                    words[j] = '0';
		                }
		            }
		        }
		        System.out.println("Characters and their corresponding frequencies");
		        for (int i = 0; i < freq.length; i++) {
		            if (words[i] != ' ' && words[i] != '0' && freq[i] > 1) {
		                System.out.println(words[i] + "-" + freq[i]);
		            }
		        }

		    
	}

}
