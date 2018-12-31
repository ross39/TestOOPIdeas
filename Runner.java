package ie.gmit.sw;

public class Runner extends CalculateSimilarity {public static void main(String[] args)
{
    printSimilarity("", "");
    printSimilarity("1234567890", "1");
    printSimilarity("1234567890", "123");
    printSimilarity("1234567890", "1234567");
    printSimilarity("1234567890", "1234567890");
    printSimilarity("1234567890", "1234567980");
    printSimilarity("47/2010", "472010");
    printSimilarity("47/2010", "472011");
    printSimilarity("47/2010", "AB.CDEF");
    printSimilarity("47/2010", "4B.CDEFG");
    printSimilarity("47/2010", "AB.CDEFG");
    printSimilarity("The quick fox jumped", "The fox jumped");
    printSimilarity("The quick fox jumped", "The fox");
    printSimilarity("The quick fox jumped", "The quick fox jumped off the balcany");
    printSimilarity("kitten", "sitting");
}

}
