import java.util.Arrays;

    public class task4 {
    public static void main(String[] args) {
        task4();
    }
    static void task4(){
        /*Текст задачи:
        Во фразе "Добро пожаловать на курс по Java" 
        переставить слова в обратном порядке.*/
        String phrase = "Добро пожаловать на курс по Java";
        String[] parse = phrase.split(" ");
        String revPhrase = "";
        System.out.println(Arrays.toString(parse));
        for (int i = parse.length - 1; i >= 0; i--) {
            revPhrase = revPhrase + parse[i] + " ";
        }
        System.out.println(revPhrase);
    }
}
