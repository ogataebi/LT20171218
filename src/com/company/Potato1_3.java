package com.company;

//インターフェイス
interface Imo1_3
{
    //ほくほくメソッドを実装する約束
    boolean hokuhoku(int temp);

    //サイズのsetter
    void setSize(int size);
}


class Potato1_3
{
    //芋の大きさ
    public int imoSize;
    Potato1_3()
    {
        imoSize = 15;


        isiyaki(
                new Imo1_3()
                {
                    int _size;
                    @Override
                    public boolean hokuhoku(int temp)
                    {
                        if(temp > 5 * _size)return true;
                        return false;
                    }

                    //setter作ればいいんじゃないかな
                    public void setSize(int size)
                    {
                        _size = size;
                    }
                }
        );



        //構造
        /*
        メソッド( 引数：new インターフェイス名() { //抽象メソッドの実装 } );
         */


    }

    void isiyaki(Imo1_3 imo)
    {
        //インタフェース側でsetter作るお約束してないとここでエラー出るよ
        imo.setSize(imoSize);
        //温度を上げてる
        for(int i = 0; imo.hokuhoku(i); i++);
        System.out.println("焼けたよ");
    }

}












/*
*
* 弄れる関数ばかりじゃないんですねこれが
*
* */