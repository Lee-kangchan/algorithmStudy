package old.programers.level1;

public class solution29 {
    public double solution(int[] arr) {

        double answer = 0;

        for(int i = 0 ; i < arr.length; i ++)
        {
            answer+=arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }
}
