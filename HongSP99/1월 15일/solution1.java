class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];

        int[][] snail = new int[n][n];
        int rotate = 0;

        int next = 1;
        int x = -1;
        int y = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if(i%3 == 0)
                    x++;
                else if(i%3 == 1)
                    y++;
                else if(i%3 == 2){
                    x--;
                    y--;
                }
                snail[x][y] = next++;
            }
        }

        int nextIndex = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                answer[nextIndex++] = snail[i][j];
            }
        }



        return answer;
    }
}
