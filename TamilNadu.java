class TamilNadu extends SouthIndia{

    static String capital="Chennai";

    public static void main(String[] args)
    {
        SouthIndia si = new TamilNadu();
        System.out.println("TamilNadu capital " + capital);
        System.out.println("India capital " + si.capital);
        si.speakLanguage();
        si.eat();
        si.dress();
        si.cultivate();
        si.livingStyle();
        
    }
       public void speakLanguage(){
            System.out.println("TamilNadu Mother Tongue  is Tamil");
       }
       public void eat(){
            System.out.println("TamilNadu People eating Rice and Wheat");
       }

       public void dress(){
            System.out.println("TamilNadu People wear formal and regular fit dress");
       }

        public void cultivate(){
            System.out.println("Rice and Sugar cultivate");
       }
        public void livingStyle(){
            System.out.println(" Average Develpoment");
       }
}
