class day3 {

    static int fibonacci (int number)
    {
        int fibonacci [] = new int[number+2]; 
        int i;
      
        fibonacci [0] = 0;
        fibonacci [1] = 1;
     
        for (i = 2; i <= number; i++)
        {
            fibonacci [i] = fibonacci [i-1] + fibonacci [i-2];
        }
      
        return fibonacci [number];
    }

    public static void main(String args[])
    {
        int number = 3;
        System.out.println(fibonacci(number));
    }
};



