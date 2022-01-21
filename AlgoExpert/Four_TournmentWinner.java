package AlgoExpert;

import java.util.HashMap;

public class Four_TournmentWinner {
    public static void main(String[] args) {
        String teamArr[][] = {{"HTML", "C#"}, {"C#", "Python"}, {"Python", "HTML"}};
        int[] winArr = {0, 0, 0};
        System.out.println(tournmentWinner(teamArr, winArr));

    }

    public static String tournmentWinner(String[][] teamArr, int[] winArr){
        HashMap<String, Integer> map = new HashMap<>();
        int pointer = 0;
        int max = 0;
        String ans = "";
        for (int i = 0; i < teamArr.length; i++) {
            if (winArr[i] == 0) {
                if (map.containsKey(String.valueOf(winArr[i + 1]))) {
                    int temp = map.get(String.valueOf(winArr[i + 1]));
                    map.put(String.valueOf(teamArr[i][i + 1]), temp + 3);
                    if (map.get(String.valueOf(teamArr[i][i + 1])) > max){
                        max = map.get(String.valueOf(teamArr[i][i+1]));
                        ans = String.valueOf(teamArr[i][i+1]);
                    }
                }else {
                    map.put(String.valueOf(teamArr[i][i + 1]), 3);
                }
            } else{
                    if (map.containsKey(String.valueOf(winArr[i + 1]))) {
                        int temp = map.get(String.valueOf(winArr[i + 1]));
                        map.put(String.valueOf(teamArr[i][i + 1]), temp + 3);
                    }else {
                        map.put(String.valueOf(teamArr[i][i + 1]), 3);
                    }
                }
            }
        return ans;
    }
}
