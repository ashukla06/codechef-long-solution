/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=10;i>=1;i--){
		    if(n%i==0){
		        System.out.println(i);
		        break;
		    }
		}
	}
		}
		catch(Exception e) {
		    return;
		}
	}
}
