package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < chars.length){
            result.append(chars[i]);
            i++;
        }
        System.out.print(result);
    }
}
