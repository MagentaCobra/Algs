/*
Solution for February 2019 Platinum Contest (Problem #1)

roses are red
memes are neat
all my test cases time out
lmao yeet
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class CowDating
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new FileReader("cowdate.in"));
         int N = Integer.parseInt(infile.readLine());
         double[] bull = new double[N];
         for(int i=0; i < N; i++)
            bull[i] = Integer.parseInt(infile.readLine())/1000000.0;
         int res = 0;
         double temp = bull[0];
         double func = 1.0-bull[0];
         int a = 0;
         int b = 1;
         while(b < N)
         {
            if(func > temp)
            {
               temp = temp*(1.0-bull[b])+func*bull[b];
               func *= 1.0-bull[b];
               b++;
            }
            else
            {
               func /= 1.0-bull[a];
               temp = (temp-bull[a]*func)/(1-bull[a]);
               a++;
            }
            res = Math.max(res, (int)(temp*1000000.0));
         }
         System.setOut(new PrintStream(new File("cowdate.out")));
         System.out.println(res);
      }
   }
