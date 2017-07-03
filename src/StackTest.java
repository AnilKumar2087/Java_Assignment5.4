public class StackTest {
    public static void main(String args[ ])
    {
            FixedStack fs=new FixedStack(3);
            DynStack ds=new DynStack(5);
            stackop mystk;
            for(int i=0;i<3;i++)
                    fs.push(i);
            System.out.println("Fixed length Stack Contents are.");
            for(int i=0;i<3;i++)
                    System.out.println(fs.pop());
            for(int i=0;i<7;i++)
                    ds.push(i);
            System.out.println("Dynamic length Stack Contents are");
            for(int i=0;i<7;i++)
                    System.out.println(ds.pop());
            mystk=fs;
            for(int i=0;i<3;i++)
                    mystk.push(i);
            System.out.println("Fixed length Stack Contents using interface reference");
            for(int i=0;i<3;i++)
                    System.out.println(mystk.pop());
            mystk=ds;
            for(int i=0;i<7;i++)
                    mystk.push(i);
            System.out.println("Dynamic length Stack Contents using interface reference");
            for(int i=0;i<7;i++)
                    System.out.println(mystk.pop());
    }
}
