class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
         java.math.BigInteger b1 = new java.math.BigInteger(s1);
        java.math.BigInteger b2 = new java.math.BigInteger(s2);
        return String.valueOf(b1.multiply(b2));
        
    }
}

//GFG
