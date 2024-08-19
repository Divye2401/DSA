class Two_Keys {
    public int minSteps(int n) {


        if(n==1)
        return 0;
        else if(n==2)
        return 2;

        else
        {
            int count=2;
            int no_of_characters=2;
            int copied_char=1;

            while(no_of_characters<n)
            {

                if(n%no_of_characters==0) //Divisible by no of characters currently there
                {
                    
                    copied_char=no_of_characters; //COPY
                    no_of_characters+=copied_char; //PASTE

                    count+=2;// Copying and pasting that set of chracters
;
                }
                else
                {
                    no_of_characters+=copied_char; //Pasting one more A
                    count++;
                }
                

            }

            return count;

        }
    }
}