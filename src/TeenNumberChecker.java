public class TeenNumberChecker {
    public static boolean hasTeen(int Num1,int Num2,int Num3){
        if(Num1 >= 13 && 19 >=Num1 || Num2 >= 13 && 19 >=Num2 || Num3 >= 13 && 19 >=Num3){
            System.out.println("Is within the range");
            return true;
        }else{
            return false;
        }

    }
    public static boolean isTeen(int Num4){
        if(Num4 >= 13 && Num4 <= 19){
            System.out.println(+Num4+" isTeen");
            return true;
        }else{
            return false;
        }

    }
}
