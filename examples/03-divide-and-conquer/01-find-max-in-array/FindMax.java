import java.util.Scanner;
import java.util.Vector;

class FindMax
{
    public static int findMaxInVector(Vector<Integer> l, int start, int end) {
        if(start > end) return -1;
        if(start == end) return l.get(start);

        int m = (start+end)/2;

        int left = findMaxInVector(l, start, m);
        int right = findMaxInVector(l, m+1, end);

        return left > right ? left : right;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> l = new Vector<Integer>();
        int size_l, buffer;

        size_l = scanner.nextInt();

        for(int i=0;i<size_l;i++){
          buffer = scanner.nextInt();
          l.add(buffer);
        }
        System.out.println(l.size()-1);
        System.out.println(findMaxInVector(l, 0, l.size()-1));

    }
}
