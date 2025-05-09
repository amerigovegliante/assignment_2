////////////////////////////////////////////////////////////////////
// [Amerigo] [Vegliante] [2111004]
// [Giulia] [Romanato] [2104060]
///////////////////////////////////////////////////////////////////
package it.mtss.unipd;

public class IntegerToRoman {
    public static String convert(int number){
        String roman=new String();
        if(number<0 || number>1000){
            return null;
        }else if(number<=3){
            for (int i=0;i<number;i++){
                roman=roman+"I";
            }
        } else if(number<=8){
            if(number==4){
                roman="IV";
            }else{
                roman="V";
                for (int i=0;i<number-5;i++){
                roman=roman+"I";
               }
            }   
        }else if (number<=10) {
            if(number==9){
                roman="IX";
            }else{roman="X";}
        }else if(number <= 39){
            roman = "X" + convert(number - 10);
        }else if (number<50){
            roman="XL"+convert(number-40);
        }else if(number==50){
            roman="L";
        }else if(number <= 89)
        {
            roman = "L" + convert(number - 50);
        }else if(number <= 99)
        {
            roman = "XC" + convert(number - 90);
        }else if(number == 100){
            roman = "C";
        }
        return roman;
    }
}

