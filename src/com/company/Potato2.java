package com.company;

//応用編
//芋焼き器を沢山置きます
//「extends thread」==「implements Runnable」
//スレッドで定義されている（絶対実装しなければならない）のはrun()メソッドです

class Potato2
{
    //芋の大きさ
    public int imoSize;
    Potato2()
    {
        //めっちゃ芋仕入れた
        int imoNum = 10;
        Imo1_4 imos[] = new Imo1_4[imoNum];
        for(int i = 0; i < imoNum; i++)
        {
            imos[i] = new Imo1_4() {
                public boolean hokuhoku(int temp) {
                    if(temp > 100)return true;
                    return false;
                }
            };
        }

        //たくさんの芋を並列して一気に焼いてる
        for(int i = 0; i < imos.length; i++) {
            new Runnable() {
                Imo1_4 _imo;

                @Override
                public void run() {
                    for (int i = 0; _imo.hokuhoku(i); i++) ;
                    System.out.println("焼けたよ");
                }

                //実質的なコンストラクタでは（1番最初に呼び出されるので）
                public Object init(Imo1_4 imo) {
                    _imo = imo;
                    return this;
                }
            }.init(imos[i]);
        }


        //構造
        /*
        メソッド( 引数：new インターフェイス名() { //抽象メソッドの実装 } );
         */


    }

}







