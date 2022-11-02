class Tenali_Raman{

    public static void main(String[] args)
    {
        Tenali_Raman tr = new Tenali_Raman();
        tr.adi(1024);
        tr.dosai_count(8);

  }
    void adi (int adi)
    {
        int security =0;
        while(adi>1)
        {
            adi = adi/2;
            security=security+1;
        }
        System.out.println("Security:"+security);
    }

    void dosai_count(int dosai){
        int count=3;
        while(count>=1)
        {
            dosai=dosai+dosai/2;
            count=count-1;
        }
         System.out.println("dosai:"+dosai);
    }
}
