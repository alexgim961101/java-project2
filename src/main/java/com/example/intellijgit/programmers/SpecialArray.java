package com.example.intellijgit.programmers;

public class SpecialArray {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) {
                    answer[i][j] = 1;
                }
            }
        }

        return answer;
    }
}
