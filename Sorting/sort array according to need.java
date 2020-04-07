import java.util.*;
import java.util.Arrays;
class Codechef
{
    public static void main(String args[])
    {
        Point arr[]={new Point(20,10),new Point( 15,5) ,new Point(30,22)};
        Arrays.sort(arr,new Mysort());
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i].x + " "+arr[i].y );
        }
      
    }
    
}
class Point{
    int x,y;
    Point(int i,int j)
    {
        x=i;
        y=j;
    }
}
class Mysort implements Comparator<Point>{
    public int compare(Point a,Point b){
        return (a.x-b.x);
        
    }
}
