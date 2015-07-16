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
        m.Rover(scanner.next());
        m.display();

    }
}

class Move
{
    int x, y, i=0;
    String initd;
    String map[] = {" N"," W"," S"," E"};
    char[] stringArray;
    Move(int a, int b, String s)
    {

        x = a;
        y = b;
        initd = s;

    }

    void Rover(String next)
    {
        stringArray = next.toCharArray();
        for(i=0;i<4;i++)
        {
            if(map[i].equals(initd))
                break;
        }

        for(int j=0;j<stringArray.length;j++) {

            if (stringArray[j]=='L') {
                i++;
                if (i > 3) i = 0;
            }
            else if (stringArray[j]=='R') {
                i--;
                if (i < 0) i = 3;
            }
            else if (stringArray[j]=='M') {
                if (i == 0) y++;
                if (i == 1) x--;
                if (i == 2) y--;
                if (i == 3) x++;
            }
        }

    }

    void display()
    {
       System.out.println(x + " " + y + " " + map[i]);
    }


}
