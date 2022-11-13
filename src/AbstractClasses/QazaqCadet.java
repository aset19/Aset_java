package AbstractClasses;

public class QazaqCadet extends ForeignCadet {

    @Override
    public void Cadet() {
        String country = getCountry();
        String name = getName();
        String language = getLanguage();
        int  course = getCourse();

        System.out.println(country + "\n"  + name + "\n" + language + "\n" + course );

    }

    @Override
    public void Officer() {
        System.out.println("I am Officer");
    }



}
