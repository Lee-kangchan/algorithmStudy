package programers.level1;

public class solution33 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i =0 ; i <n ; i ++){
            answer[i] = Long.valueOf( x)*(i+1);
        }
        return answer;
    }
}