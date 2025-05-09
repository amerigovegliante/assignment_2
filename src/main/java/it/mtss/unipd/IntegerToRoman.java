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
        }
        return roman;
    }
}

