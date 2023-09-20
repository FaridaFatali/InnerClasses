package innerClasses.staticClass;

public class CitizenTest {
    public static void main(String[] args) {
        Citizen.Nationality nationality1 = new Citizen.Nationality("Azerbaijan", "AZ");
        Citizen citizen1 = new Citizen(nationality1, "12345", "Farida", "Fatali");
        System.out.println(citizen1);

        System.out.println();

        Citizen.Nationality nationality2 = new Citizen.Nationality("Turkey", "TC");
        Citizen citizen2 = new Citizen(nationality2, "56789", "Zeynep", "Can");
        System.out.println(citizen2);

        System.out.println();

        Citizen.Nationality nationality3 = new Citizen.Nationality("United States", "US");
        Citizen citizen3 = new Citizen(nationality3, "918273", "Amanda", "Brown");
        System.out.println(citizen3);
    }
}
