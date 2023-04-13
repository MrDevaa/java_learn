public class VeryAdvCalc extends AdvancedCalc
{
    public double power(int n1, int n2)
    {
        return Math.pow(n1,n2);
    }
}



/*  comprendre le systeme de extend donc: 

                                        _______________1*
                                        --------------2*
                                        |    Calc     | 
                                        |     |       |
                                        |     |       |
                                        |     |       |
                                        | AdvancdCalc |                // 1. Multilevel inheritance
                                        | ------------|                // 2. Singlelevel inheritance
                                        |     |       |
                                        |     |       |
                                        |     |       |
                                        | VeryAdvCalc |
                                        |             |
                                        _______________
*/
