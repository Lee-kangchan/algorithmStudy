package old.programers.level3;

import java.util.ArrayList;
// 하노이탑
public class Solution3 {
    public int[][] solution(int n) {

        ArrayList<int[]> list = new ArrayList<>();

        hanoi(n, 1, 3, 2, list);

        int[][] answer = new int[list.size()][2];
        for(int i = 0 ; i < list.size() ; ++i){
            int[] cmd = list.get(i);
            answer[i][0] = cmd[0];
            answer[i][1] = cmd[1];
        }

        return answer;
    }

    private void hanoi(int n, int from, int to, int via, ArrayList<int[]> list){
        int[] move = {from, to};

        if(n == 1) {
            list.add(move);
        } else {
            hanoi(n - 1, from, via, to, list);
            list.add(move);
            hanoi(n - 1, via, to, from, list);
        }
    }

}
