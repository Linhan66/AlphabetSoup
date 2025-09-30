public class Soup {
    //Name: Linhan Zhao
    //Date: 9/29/25
    //This program will allow you to add a word and modify the word
    
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
     public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //precondition- type add in the console and any character work including symbol and number(must include add in the start)
    public void add(String word){
        letters += word;
    }
    //poscondition- returns the character use typed in

    //Use Math.random() to get a random character from the letters string and return it.
    //precondition- use randomLetter to execute this command must already added a word
    public char randomLetter(){
        char random =  letters.charAt((int)(Math.random() * letters.length()));
        return random;
    }
    //poscondition- return a random character from the word


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //precondition-use companyCentered to execute this command must already added a word
    public String companyCentered(){
        String letter1 = letters.substring((letters.length()/2) , letters.length() / 2 + 1);
        return letter1;
    }
     //poscondition-return the character in the middle of the word


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //precondition- use removeFirstVoel to execute this command must already added a word(word must have vowel to world else it will have no effect)
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
    }
    //poscondition-return the word with out the first vowel
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //precondition- use removesome number to execute this command must already added a word
    public void removeSome(int num){
        for(int i = 0; i < num; i++){
            int randomSpot = (int)(Math.random() * letters.length());
            if(num == 0){
                letters = letters.substring(1);
            }else{
                String firstHalf = letters.substring(0, randomSpot);
                String secondHalf = letters.substring(randomSpot + 1);
                letters = firstHalf + secondHalf;
            }

            
        }
    }
    //poscondition-return a word with num amount of random letter deleted 
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
     //precondition-use removeWord word to execute this command must already added a word(if the word from this command is not found in the letter then nothing will happen)
    public void removeWord(String word){
       letters = letters.replaceAll(word, "");
    }
    //poscondition-remove the word from the letters if the word is included in the letters
}
