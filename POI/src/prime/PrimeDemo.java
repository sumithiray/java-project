package prime;

import java.util.Scanner;

public class PrimeDemo {
        public static void main(String args[])
        {
            int i =0;
            int num =0;
            //Empty String
            String  primeNumbers = "";
            int n=0;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            for (i = 1; i <=n; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println(primeNumbers);
        }
    }