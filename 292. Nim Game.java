/*
 * 题意：两人玩抓石头游戏，轮流抓，每次可以抓1到3个，最后抓完石头的人赢，我先抓，判断我能不能赢
 */

//只要石头数是4的倍数，我就输，其他情况都赢
public class Solution {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}