package com.company;

import java.io.IOException;
import java.lang.*;
import java.util.*;


class Solution {

    public static void main(String[] args) {


    }

}
interface Chessplayer {
    void moves();
}
    class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal");
    }
    
}
class Rookie implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal by 1 step");
    }
}



