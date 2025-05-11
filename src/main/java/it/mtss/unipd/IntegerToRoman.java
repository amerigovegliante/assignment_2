////////////////////////////////////////////////////////////////////
// [Amerigo] [Vegliante] [2111004]
// [Giulia] [Romanato] [2104060]
///////////////////////////////////////////////////////////////////
package it.mtss.unipd;

public class IntegerToRoman 
{
    public static String convert(int number)
    {
        String roman=new String();
        if(number<0 || number>1000)
        {
            return "";
        }
        else if(number<=3)
        {
            for (int i=0;i<number;i++)
            {
                roman=roman+"I";
            }
        } 
        else if(number<=8)
        {
            if(number==4)
            {
                roman="IV";
            }
            else
            {
                roman="V";
                for (int i=0;i<number-5;i++)
                {
                roman=roman+"I";
                }
            }   
        }
        else if (number<=10) 
        {
            if(number==9)
            {
                roman="IX";
            }
            else
            {
                roman="X";
            }
        }
        else if(number <= 39)
        {
            roman = "X" + convert(number - 10);
        }
        else if (number<50)
        {
            roman="XL"+convert(number-40);
        }
        else if(number==50)
        {
            roman="L";
        }
        else if(number <= 89)
        {
            roman = "L" + convert(number - 50);
        }
        else if(number <= 99)
        {
            roman = "XC" + convert(number - 90);
        }
        else if(number < 400){
            roman = "C"+convert(number-100);
        }
        else if(number < 500){
            roman = "CD"+convert(number-400);
        }
        else if(number == 500){
            roman = "D";
        }
        else if(number <= 899)
        {
            roman = "D" + convert(number - 500);
        }
        else if(number <= 999)
        {
            roman = "CM" + convert(number - 900);
        }
        else if(number == 1000)
        {
            roman = "M";
        }
        return roman;
    }
}

