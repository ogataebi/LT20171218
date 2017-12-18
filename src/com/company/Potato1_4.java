package com.company;

//インターフェイス
interface Imo1_4
{
    //ほくほくメソッドを実装する約束
    boolean hokuhoku(int temp);

}


class Potato1_4
{
    //芋の大きさ
    public int imoSize;
    Potato1_4()
    {
        imoSize = 15;


        isiyaki(
                new Imo1_4()
                {
                    int _size;
                    @Override
                    public boolean hokuhoku(int temp)
                    {
                        if(temp > 5 * _size)return true;
                        return false;
                    }

                    //実質的なコンストラクタでは（1番最初に呼び出されるので）
                    public Imo1_4 setSize(int size)
                    {
                        _size = size;
                        return this;
                    }
                }.setSize(imoSize)
                //返り値はImoのオブジェクト
        );



        //構造
        /*
        メソッド( 引数：new インターフェイス名() { //抽象メソッドの実装 } );
         */


    }

    void isiyaki(Imo1_4 imo)
    {
        //インタフェース側でsetter作るお約束してないとここでエラー出るよ
        //imo.setSize(imoSize);
        //温度を上げてる
        for(int i = 0; imo.hokuhoku(i); i++);
        System.out.println("焼けたよ");
    }

}







