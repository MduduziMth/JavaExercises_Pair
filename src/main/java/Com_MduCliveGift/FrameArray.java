package Com_MduCliveGift;

public class FrameArray {

    public static void main(String[] args)
    {
        String array1[] = {"hey","go","there","you","man","mannnnn"};
        // String array2[] = {"1","2","3","4"};

        System.out.println(FramedArray(array1));
    }




    public static String FramedArray(String[] array1)
    {
        String TopBottomFrame = "";
        int Maxlength = 0;
        String Words = "";
        for(String array: array1)
        {
            if(array.length()> Maxlength)
                Maxlength= array.length();
        }
        for(int i = 0;i < Maxlength + 5;i++)
        {
            TopBottomFrame += "*";

        }



        for(int i = 0; i <array1.length; i++)
        {
            Words += "*  " + array1[i] ;
            for(int j = array1[i].length();j <= Maxlength-1;j++)
            {
                Words += " ";
            }
            Words +=" *\n";
        }

        return TopBottomFrame +"\n"+ Words + TopBottomFrame;
    }
}
