package ZonaPackage;

public class Protection{
    int n_def;
    private int n_pri;
    protected int n_pro;
    public int n_pub;
    public Protection(){
        System.out.println(" кoнcтpyктop базового класса ");
        n_def = 1;
        n_pri = 2;
        n_pro = 3;
        n_pub = 4;
    }
    public void seeData(){
        System.out.println(" n_def = " + n_def);
        System.out.println(" n_pri " + n_pri);
        System.out.println(" n_pro " + n_pro);
        System.out.println(" n_pub " + n_pub);
    }
}

