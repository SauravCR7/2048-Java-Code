package pkg20482048;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static int[][] box=new int[4][4];
    static int num;
    static int score;
    static int[][]a=new int[4][4];
    static int[][]b=new int[4][4];
    
  static void startgame()
  {int n=ThreadLocalRandom.current().nextInt(0,4); 
  if(n==0)
  {box[0][0]=2;
  box[1][0]=2;}
 
  else if(n==1)
  {box[3][0]=2;
  box[3][1]=2;}
  
  else if(n==2)
          
  {box[0][3]=2;
  box[0][2]=2;}
  
  else if(n==3)
  {box[3][3]=2;
  box[2][3]=2;}
  }
  
  static void swipe()
  {int k,j;
   System.out.println();
   System.out.println("press w to swipe up");
   System.out.println("press a to swipe left");
   System.out.println("press s to swipe down");
   System.out.println("press d to swipe right");
   score();
   Scanner swipe=new Scanner(System.in);
   String s=swipe.next();
   char ss=s.charAt(0);
   
   if(ss=='w')
   {
   
   
   for(k=0;k<3;k++)
   for(j=0;j<4;j++)
   if((box[k][j]==0)&&(box[k+1][j]>0))
   {box[k][j]=box[k+1][j];
   box[k+1][j]=0;}
   
   for(k=0;k<3;k++)
   for(j=0;j<4;j++)
   if((box[k][j]==0)&&(box[k+1][j]>0))
   {box[k][j]=box[k+1][j];
   box[k+1][j]=0;}
   
   for(k=0;k<3;k++)
   for(j=0;j<4;j++)
   if((box[k][j]==0)&&(box[k+1][j]>0))
   {box[k][j]=box[k+1][j];
   box[k+1][j]=0;}
   
   for(k=0;k<3;k++)
   for(j=0;j<4;j++)
   if(box[k][j]==box[k+1][j])
   {box[k][j]=box[k][j]+box[k+1][j];
   box[k+1][j]=0;}
   
   for(k=0;k<3;k++)
   for(j=0;j<4;j++)
   if((box[k][j]==0)&&(box[k+1][j]>0))
   {box[k][j]=box[k+1][j];
   box[k+1][j]=0;}
   }
   
   
   else if(ss=='s')
   {
   
   
   for(k=2;k>=0;k--)
   for(j=3;j>=0;j--)
   if((box[k+1][j]==0)&&(box[k][j]>0))
   {box[k+1][j]=box[k][j];
   box[k][j]=0;}
   
   for(k=2;k>=0;k--)
   for(j=3;j>=0;j--)
   if((box[k+1][j]==0)&&(box[k][j]>0))
   {box[k+1][j]=box[k][j];
   box[k][j]=0;}
   
   for(k=2;k>=0;k--)
   for(j=3;j>=0;j--)
   if((box[k+1][j]==0)&&(box[k][j]>0))
   {box[k+1][j]=box[k][j];
   box[k][j]=0;}
   
   for(k=2;k>=0;k--)
   for(j=3;j>=0;j--)
   if(box[k][j]==box[k+1][j])
   {box[k+1][j]=box[k][j]+box[k+1][j];
   box[k][j]=0;}
   
   for(k=2;k>=0;k--)
   for(j=3;j>=0;j--)
   if((box[k+1][j]==0)&&(box[k][j]>0))
   {box[k+1][j]=box[k][j];
   box[k][j]=0;}
   }   
   
   
   else if(ss=='d')
   {
   
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j+1]==0)&&(box[k][j]>0))
   {box[k][j+1]=box[k][j];
   box[k][j]=0;}
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j+1]==0)&&(box[k][j]>0))
   {box[k][j+1]=box[k][j];
   box[k][j]=0;}
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j+1]==0)&&(box[k][j]>0))
   {box[k][j+1]=box[k][j];
   box[k][j]=0;}
   
   for(j=3;j>=1;j--)
   for(k=3;k>=0;k--)
   if(box[k][j]==box[k][j-1])
   {box[k][j-1]=box[k][j]+box[k][j-1];
   box[k][j]=0;}
 
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j+1]==0)&&(box[k][j]>0))
   {box[k][j+1]=box[k][j];
   box[k][j]=0;}  
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j+1]==0)&&(box[k][j]>0))
   {box[k][j+1]=box[k][j];
   box[k][j]=0;}}   
   
   
   else if(ss=='a')
   {
   
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j]==0)&&(box[k][j+1]>0))
   {box[k][j]=box[k][j+1];
   box[k][j+1]=0;}
  
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j]==0)&&(box[k][j+1]>0))
   {box[k][j]=box[k][j+1];
   box[k][j+1]=0;}
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j]==0)&&(box[k][j+1]>0))
   {box[k][j]=box[k][j+1];
   box[k][j+1]=0;}
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if(box[k][j]==box[k][j+1])
   {box[k][j]=box[k][j]+box[k][j+1];
   box[k][j+1]=0;}
   
   for(j=0;j<3;j++)
   for(k=0;k<4;k++)
   if((box[k][j]==0)&&(box[k][j+1]>0))
   {box[k][j]=box[k][j+1];
   box[k][j+1]=0;}}
   
  }
  
  static int generate()
  {int flag=0;
      int m=ThreadLocalRandom.current().nextInt(0,6);
  int var;
  if(m==0)
  var=4;
  else
  var=2;
  if((box[0][0]==0)||(box[3][0]==0)||(box[0][3]==0)||(box[3][3]==0))
  {int o=ThreadLocalRandom.current().nextInt(0,4);
  if((o==0)&&(box[0][0]==0))
      box[0][0]=var;
  else if((o==1)&&(box[3][0]==0))
      box[3][0]=var;
  else if((o==2)&&(box[0][3]==0))
      box[0][3]=var;
  else if((o==3)&&(box[3][3]==0))
      box[3][3]=var;
  else
  {flag++;
  return flag;}
  }        
  return flag;}
    
  static void dispbox()
  {
      for(int i=0;i<4;i++)
      {System.out.println();
          for(int j=0;j<4;j++)
              System.out.printf(box[i][j]+" ");
         } System.out.println();
  }
  
  static void score()
  {int i,j,k;
   for(j=0;j<4;j++)
   for(k=0;k<4;k++)
   a[j][k]=box[j][k];
   
   for(i=0;i<4;i++)
   for(j=0;j<4;j++)
   if((a[i][j]>b[i][j])&&(b[i][j]>0))
   score=score+a[i][j];
   
   System.out.println();
   System.out.println("Score ="+score);
   System.out.println();
   
   for(i=0;i<4;i++)
   for(j=0;j<4;j++)
   b[i][j]=a[i][j];
  }
  
  static void check()
  {int check=0;
   for(int i=0;i<4;i++)
   for(int j=0;j<4;j++)
   if(box[i][j]==0)
       break;
  else
       check++;
  if((check==16)&&(box[0][0]!=box[0][1])&&(box[0][0]!=box[1][0])&&(box[3][3]!=box[3][2])&&(box[3][3]!=box[2][3])&&(box[0][3]!=box[0][2])&&(box[0][3]!=box[1][3])&&(box[3][0]!=box[3][1])&&(box[3][0]!=box[2][0]))
  {System.out.println("game over");
          score();
  System.exit(0);}}
  
    public static void main(String[] args) {
        int g;
        startgame();
        dispbox();
        swipe();
        dispbox();
        for(int i=0;;i++)
        {g=generate();
        if(g!=0)
            while(g!=0)
                g=generate();
        dispbox();
        check();
        swipe();
        dispbox();
        }
      
    }
    
}
