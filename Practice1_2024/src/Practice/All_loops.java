package Practice;

public class All_loops {
    public static void main(String[] args) {

        char[] letters = {'a', 'b', 'c','d', 'e', 'f', 'g'};

        /**
         * Print the letters from array as below
         * Letter at INDEX-0 : a
         * Letter at INDEX-1 : b
         * ...
         * ...
         */
        System.out.println("---for loop---");

        for (int i = 0 ; i <= letters.length-1 ; i++) {
            System.out.println("Letter at INDEX-" + i + " : " + letters[i]);
        }

        System.out.println("\n---Enhanced for loop---");
        int index =0;
        for ( char letter : letters) {
            System.out.println("Letter at INDEX-" + index + " : " + letter);
            index++;
        }
        System.out.println("\n---while loop---");
        int letterIndex =0;
        while (letterIndex <= letters.length-1) {
            System.out.println("Letter at INDEX-" + letterIndex + " : " + letters[letterIndex]);
            letterIndex++;
        }
        System.out.println("\n---do while loop---");
        int doIndex = 0;
        do {
            System.out.println("Letter at INDEX-" + doIndex + " : " + letters[doIndex]);
            doIndex++;
        }while (doIndex <= letters.length-1);

        /**
         * Reverse a string
         *
         * "learn"
         * "nrael"
         *
         */

        String word = "12345";
        String wordReverse = "";
        //String[] wordSplit = word.split("");

        for (int i = 1 ; i <= word.length() ; i++){
            wordReverse += word.charAt(word.length()-i);
        }
        System.out.println("\nword--> " + word);
        System.out.println("word in reverse --> " + wordReverse
        );



    }
}
