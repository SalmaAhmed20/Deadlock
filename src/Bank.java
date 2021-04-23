public class Bank {
    //number of resource types (input)
    private  int numResourceType;
    // each cell is resource type contain amount of available of it (input)
    private int [] available ;
    // number of processes (input)
    private int numProcess;
    // is the maximum amount of resources that process can use (input)
    private int [][] maximum;
    //the amount currently allocated to each process (input)
    private int [][] allocation;
    //the remaining needs of each process (calculated)
    private int [][] need;
    public  Bank( int nR, int nP , int [][] alloc , int [][] max)
    {
        this.numResourceType=nR;
        this.numProcess=nP;

        this.allocation=new int[numProcess][numResourceType];
        this.allocation=alloc;

        this.maximum=new int[numProcess][numResourceType];
        this.maximum=max;

        this.need = new int [numProcess][numResourceType];
        //calculate need
        for (int i = 0 ; i<numProcess;i++)
        {
            for (int j = 0 ; j <numResourceType;j++)
                need[i][j] = maximum[i][j]-allocation[i][j];
        }
    }

    public int[] getAvailable() {
        return available;
    }

    public void setAvailable( int[] available ) {
        this.available = available;
    }
}
