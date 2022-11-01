abstract class India{

abstract void speakLanguage();

abstract void eat();

abstract void dress();

static String capital = "New Delhi";

public India(String primeminister)
{
    System.out.println("Our Prime Minister " + primeminister);
}

India(){
    this("Modi");
}

}
