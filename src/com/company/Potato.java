package com.company;

//インターフェイス
interface Imo
{
    //ほくほくメソッドを実装する約束
    //何がほくほくなのかはその人次第だし、内容は決めないよ
    boolean hokuhoku(int temp);
}

//Imoの実装クラス
public class Potato implements Imo{

    //約束通りほくほくメソッドを実装しました！
    //インターフェイスの決まりで、自動的にPublicメソッドになります
    @Override
    public boolean hokuhoku(int temp)
    {
        //猫舌なので熱いのは無理です！
        if(temp > 40)return true;
        return false;
    }
}
