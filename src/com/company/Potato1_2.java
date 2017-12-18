package com.company;

class Potato1_2
{
    Potato1_2()
    {
        //androidとかでよく出てくる書きかた（clicklistenerとか）
        //めっちゃ芋仕入れるたび焼いた
        int imoNum = 10;
        Imo1 imos[] = new Imo1[imoNum];
        for(int i = 0; i < imoNum; i++)
        {
            imos[i] = new Imo1() {
                public boolean hokuhoku(int temp) {
                    if(temp > 100)return true;
                    return false;
                }
            };
            isiyaki(imos[i]);
        }

        //構造
        /*
        メソッド( 引数：new インターフェイス名() { //抽象メソッドの実装 } );
         */


    }

    void isiyaki(Imo1 imo)
    {
        //温度を上げてる
        for(int i = 0; imo.hokuhoku(i); i++);
        System.out.println("焼けたよ");
    }


}