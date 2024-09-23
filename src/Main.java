import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> WarAndPeace = new HashMap<>();
        String Str = "Мой дядя самых честных правил, " +
                "Когда не в шутку занемог, " +
                "Он уважать себя заставил " +
                "И лучше выдумать не мог. " +
                "Его пример другим наука; " +
                "Но, боже мой, какая скука " +
                "С больным сидеть и день и ночь, " +
                "Не отходя ни шагу прочь! " +
                "Какое низкое коварство " +
                "Полуживого забавлять, " +
                "Ему подушки поправлять, " +
                "Печально подносить лекарство, " +
                "Вздыхать и думать про себя: " +
                "Когда же черт возьмет тебя!";
        /*String[] StrArr = Str.split(" ");
        for (String Word : StrArr) System.out.println(Word);*/
        String[] tokens = Str.split(" ");
        for (String token : tokens) {
            System.out.println(token);
        }
        for (int i = 1; i < tokens.length; i++) {
            WarAndPeace.put(i, tokens[i]);

        }
        System.out.println(WarAndPeace.keySet());
        System.out.println(WarAndPeace.entrySet());
        System.out.println(WarAndPeace.get(18));
    }
}
