import java.sql.SQLOutput;

public interface eatable {
    void eating();

}

interface sleepable
{

}
 interface walkable
{

}
class human implements eatable , sleepable,walkable
{

    @Override
    public void eating() {
        System.out.print("human eating"+ "\n");
    }
}
class pig implements eatable , sleepable,walkable
{

    @Override
    public void eating() {
        System.out.print("pig eating");
    }
}



