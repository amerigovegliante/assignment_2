package it.mtss.unipd;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest 
{
    @Test
    void testSingleCharacters()
    {
        String I = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|";
        assertEquals(I, RomanPrinter.print("i"));

        String V = "__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    ";
        assertEquals(I, RomanPrinter.print("v"));

        String X = "__    __\n\\ \\  / /\n \\ \\/ / \n  >  <  \n / /\\ \\ \n/_/  \\_\\";
        assertEquals(I, RomanPrinter.print("x"));

        String L = " _      \n| |     \n| |     \n| |     \n| |____ \n|______|";
        assertEquals(I, RomanPrinter.print("l"));

        String C = "  ___ \n / __|\n| |   \n| |   \n| |__ \n \\___|";
        assertEquals(I, RomanPrinter.print("c"));

        String D = " _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ ";
        assertEquals(I, RomanPrinter.print("d"));

        String M = " __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|";
        assertEquals(I, RomanPrinter.print("m"));
    }

    @Test 
    void testComplexCombinations() 
    {
        String IV = " _____  __      __\n" + "|_   _| \\ \\    / /\n" + "  | |    \\ \\  / / \n" + "  | |     \\ \\/ /  \n" + " _| |_     \\  /   \n" + "|_____|     \\/    ";
        assertEquals(IV, RomanPrinter.print("iv"));

        String IX = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n  | |     >  <  \n _| |_   / /\\ \\ \n|_____| /_/  \\_\\";
        assertEquals(IX, RomanPrinter.print("ix"));

		String XIV = "__    __  _____  __      __\n\\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /    | |    \\ \\  / / \n  >  <     | |     \\ \\/ /  \n / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ |_____|     \\/    ";;
        assertEquals(XIV,RomanPrinter.print("xiv"));

        String XIX = "__    __  _____  __    __\n\\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /    | |    \\ \\/ / \n  >  <     | |     >  <  \n / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ |_____| /_/  \\_\\";
        assertEquals(XIX, RomanPrinter.print("xix"));

        String XXIV = "__    __ __    __  _____  __      __\n\\ \\  / / \\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\  / / \n  >  <     >  <     | |     \\ \\/ /  \n / /\\ \\   / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ /_/  \\_\\ |_____|     \\/    ";
        assertEquals(XXIV, RomanPrinter.print("xxiv"));

        String XXIX = "__    __ __    __  _____  __    __\n\\ \\  / / \\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\/ / \n  >  <     >  <     | |     >  <  \n / /\\ \\   / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ /_/  \\_\\ |_____| /_/  \\_\\";
        assertEquals(XXIX, RomanPrinter.print("xxix"));

        String XL = "__    __  _      \n" +"\\ \\  / / | |     \n" +" \\ \\/ /  | |     \n" +"  >  <   | |     \n" +" / /\\ \\  | |____ \n" +"/_/  \\_\\ |______|";
        assertEquals(XL, RomanPrinter.print("xl"));

        String XLIV = "__    __  _        _____  __      __\n" +"\\ \\  / / | |      |_   _| \\ \\    / /\n" +" \\ \\/ /  | |        | |    \\ \\  / / \n" +"  >  <   | |        | |     \\ \\/ /  \n" +" / /\\ \\  | |____   _| |_     \\  /   \n" +"/_/  \\_\\ |______| |_____|     \\/    "; 
        assertEquals(XLIV, RomanPrinter.print("XLIV"));

        String XLIX = "__    __  _        _____   __    __\n" +"\\ \\  / / | |      |_   _|  \\ \\  / /\n" +" \\ \\/ /  | |        | |     \\ \\/ / \n" +"  >  <   | |        | |      >  <  \n" +" / /\\ \\  | |____   _| |_    / /\\ \\ \n" +"/_/  \\_\\ |______| |_____|  /_/  \\_\\";
        assertEquals(XLIX, RomanPrinter.print("XLIX"));
        
        String XC = "__    __   ___ \n" +"\\ \\  / /  / __|\n" +" \\ \\/ /  | |   \n" +"  >  <   | |   \n" +" / /\\ \\  | |__ \n" +"/_/  \\_\\  \\___|";
        assertEquals(XC, RomanPrinter.print("XC"));

        String XCIV = "__    __   ___   _____  __      __\n" +"\\ \\  / /  / __| |_   _| \\ \\    / /\n" +" \\ \\/ /  | |      | |    \\ \\  / / \n" +"  >  <   | |      | |     \\ \\/ /  \n" +" / /\\ \\  | |__   _| |_     \\  /   \n" +"/_/  \\_\\  \\___| |_____|     \\/    ";
        assertEquals(XCIV, RomanPrinter.print("XCIV"));

        String XCIX = "__    __   ___   _____  __    __\n" +"\\ \\  / /  / __| |_   _| \\ \\  / /\n" +" \\ \\/ /  | |      | |    \\ \\/ / \n" +"  >  <   | |      | |     >  <  \n" +" / /\\ \\  | |__   _| |_   / /\\ \\ \n" +"/_/  \\_\\  \\___| |_____| /_/  \\_\\";
        assertEquals(XCIX, RomanPrinter.print("XCIX"));

        String CD = "  ___   _____  \n" +" / __| |  __ \\ \n" +"| |    | |  | |\n" +"| |    | |  | |\n" +"| |__  | |__| |\n" +" \\___| |_____/ ";
        assertEquals(CD, RomanPrinter.print("CD"));

        String CDIV =   "___   _____    _____  __      __\n" +" / __| |  __ \\  |_   _| \\ \\    / /\n" +"| |    | |  | |   | |    \\ \\  / / \n" +"| |    | |  | |   | |     \\ \\/ /  \n" +"| |__  | |__| |   | |_     \\  /   \n" +" \\___| |_____/  |_____|     \\/    ";
        assertEquals(CDIV, RomanPrinter.print("CDIV"));

        String CM = "  ___   __  __\n" +" / __| |  \\/  |\n" +"| |    | \\  / |\n" +"| |    | |\\/| |\n" +"| |__  | |  | |\n" +" \\___| |_|  |_|";
        assertEquals(CM, RomanPrinter.print("CM"));

        String CMIX = "  ___   __  __   _____  __    __\n" +" / __| |  \\/  | |_   _| \\ \\  / /\n" +"| |    | \\  / |   | |    \\ \\/ / \n" +"| |    | |\\/| |   | |     >  <  \n" +"| |__    |  | |  _| |_   / /\\ \\ \n" +" \\___| |_|  |_| |_____| /_/  \\_\\";
        assertEquals(CMIX, RomanPrinter.print("CMIX"));

        String VIII = "__      __  _____   _____   _____\n" +"\\ \\    / / |_   _| |_   _| |_   _|\n" +" \\ \\  / /    | |     | |     | |  \n" +"  \\ \\/ /     | |     | |     | |  \n" +"   \\  /     _| |_   _| |_   _| |_ \n" +"    \\/     |_____| |_____| |_____|";
        assertEquals(VIII, RomanPrinter.print("VIII"));

        String XXX = "__    __  __    __  __    __\n" +"\\ \\  / /  \\ \\  / /  \\ \\  / /\n" +" \\ \\/ /    \\ \\/ /    \\ \\/ / \n" +"  >  <      >  <      >  <  \n" +" / /\\ \\    / /\\ \\    / /\\ \\ \n" +   "/_/  \\_\\  /_/  \\_\\  /_/  \\_\\";
        assertEquals(XXX, RomanPrinter.print("XXX"));

        String CCC = "  ___   ___   ___\n" +" / __| / __| / __|\n" +"| |   | |   | |\n" +"| |   | |   | |\n" +"| |__ | |__ | |__\n" +" \\___| \\___| \\___|";;
        assertEquals(CCC, RomanPrinter.print("CCC"));
    }
}
