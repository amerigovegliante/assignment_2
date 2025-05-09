package it.mtss.unipd;

public class IntegerToRoman {
    public static String convert(int number){
        String roman=new String();
        if(number<=3){
            for (int i=0;i<number;i++){
                roman=roman+"I";
            }
        } else if(number <= 6)
        {
            if(number == 4)
                roman = "IV";
            else if(number == 5)
                roman = "V";
            else
                roman = "VI";
        }
        return roman;
    }
}

