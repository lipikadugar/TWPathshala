import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by lipikad on 7/16/15.
 */
public class Rover {
    public static void main(String args[]) {
        int tx,ty;
        int x, y;
        String dir, pos;

        Scanner in = new Scanner(System.in);
        tx =in.nextInt();
        ty = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
        dir = in.nextLine();
        pos = in.nextLine();
        Move m = new Move(x, y, dir);



        Scanner scanner = new Scanner(pos);



            m.Rover(scanner.next(),x,y);


        m.display();


    }
}

class Move
{
   // int x, y, i=0;
    int i=0;
    String initd;
    String map[] = new String[]{"N","W","S","E"};
    char[] stringArray;
    Move(int x, int y, String s)
    {

        x = x;
        y = y;
        initd = s;

    }

    void Rover(String next,int x, int y)
    {


        stringArray = next.toCharArray();
//        System.out.println(initd);
        for(i=0;i<4;i++)
        {
            if(map[i].equals(initd))
                break;
            else
                System.out.println("Map");
        }
//        System.out.println("New");
//        for(int index=0; index < stringArray.length; index++)
//            System.out.print(stringArray[index]);
        for(int j=0;j<stringArray.length;j++) {

            if (stringArray[j]=='l') {
                i++;
                if (i > 3) i = 0;
                System.out.println("Left");

            } else if (stringArray[j]=='r') {
                i--;
                if (i < 0) i = 3;
            } else if (stringArray[j]=='m') {
                System.out.println("Move");
                if (i == 0) y++;
                if (i == 1) x--;
                if (i == 2) x++;
                if (i == 3) y--;
            }
            System.out.println(x +" "+ y +" "+ map[i]);
        }

    }

    void display()
    {
       // System.out.println(x+" "+y+" " +i);
    }


}
