package com.company;

//インターフェイス
interface Imo1
{
    //ほくほくメソッドを実装する約束
    boolean hokuhoku(int temp);
}

class Potato1
{
    Potato1()
    {
        //androidとかでよく出てくる書きかた（clicklistenerとか）
        isiyaki(
                new Imo1()
                {
                    @Override
                    public boolean hokuhoku(int temp)
                    {
                        if(temp > 100)return true;
                        return false;
                    }
                }
        );

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

