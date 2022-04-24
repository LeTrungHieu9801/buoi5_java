package truutuong;

import java.sql.SQLOutput;

public class ball implements tossable
{
     String brandname;
 ball()
{

}

    public String getbrandname() {
        return brandname;
    }

    public void bounce()
    {
        System.out.print("ball bounce");
    }

    @Override
    public void toss() {

    }


}


