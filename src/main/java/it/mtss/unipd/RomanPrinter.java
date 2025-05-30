////////////////////////////////////////////////////////////////////
// [Amerigo] [Vegliante] [2111004]
// [Giulia] [Romanato] [2104060]
///////////////////////////////////////////////////////////////////
package it.mtss.unipd;

public class RomanPrinter 
{
    public static String print(int num)
    {
      return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber)
    {
      String AsciiArt="";
      romanNumber=romanNumber.toUpperCase();
      char [] Roman= romanNumber.toCharArray();

      String[] AsciiArt_I = {" _____ ","|_   _|","  | |  ","  | |  "," _| |_ ","|_____|"};
      String[] AsciiArt_V = {"__      __", "\\ \\    / /", " \\ \\  / / ","  \\ \\/ /  ","   \\  /   ","    \\/    "};
      String[] AsciiArt_X={"__    __","\\ \\  / /"," \\ \\/ / ","  >  <  "," / /\\ \\ ","/_/  \\_\\"};
      String[] AsciiArt_L={" _      ","| |     ","| |     ","| |     ","| |____ ","|______|"};
      String[] AsciiArt_C={"  ___ "," / __|","| |   ","| |   ","| |__ "," \\___|"};
      String[] AsciiArt_D={" _____  ","|  __ \\ ","| |  | |","| |  | |","| |__| |","|_____/ "};
      String[] AsciiArt_M={" __  __ ","|  \\/  |","| \\  / |","| |\\/| |","| |  | |","|_|  |_|"};

      for (int j=0;j<6;j++)
      {
          for (int i=0;i<Roman.length;i++)
          {
            if(Roman[i]=='I')
            
                {AsciiArt=AsciiArt+AsciiArt_I[j];}
            else if(Roman[i]=='V')
              {AsciiArt+=AsciiArt_V[j];}
            else if(Roman[i]=='X')
              {AsciiArt=AsciiArt+AsciiArt_X[j];}
            else if(Roman[i]=='L')
              {AsciiArt+=AsciiArt_L[j];}
            else if(Roman[i]=='C')
              {AsciiArt+=AsciiArt_C[j];}
            else if (Roman[i]=='D')
                {AsciiArt+=AsciiArt_D[j];}
            else if(Roman[i] == 'M')
              {AsciiArt+=AsciiArt_M[j];}

            if(i!=Roman.length-1)
                {AsciiArt=AsciiArt+" ";}
          }
          AsciiArt=AsciiArt+"\n";
      }
      return AsciiArt;
    }
}