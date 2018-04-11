package projet;

import java.util.Date;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class Helloworld {
	private static Scanner sc;

	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 
int[][] tab1=new int[2][5];
int[][] tab2={{0,0,0,0,0},{0,0,0,0,0}};
int[][][] tab4=new int[2][5][8];

int[][] tab3=tab1;
int i,j,k;


for(j=0;j<=1;j++)
{for(i=0;i<=4;i++)
{tab2[j][i]=i+j;
System.out.println(tab2[j][i]);
tab1[j][i]=i+j;
}
System.out.println("\n");
}

for(j=0;j<tab1.length;j++)
{for(i=0;i<tab1[0].length;i++)
{for(k=0;k<tab4[0][0].length;k++)
{
	tab4[j][i][k]=i+j+k;
	System.out.println(tab4[j][i][k]);
}
System.out.println("\n");
}
System.out.println("\n");
}

tab1=null;
System.out.println("\n");
System.out.println("\n");
for(j=0;j<tab4.length;j++)
{for(i=0;i<=4;i++)
{
System.out.println(tab3[j][i]);
}
System.out.println("\n");
}
}
}