package innerClasses.staticClass;

public class Citizen {
    private String id;
    private String firstName;
    private String lastName;
    private Nationality nationality;

    public Citizen(Nationality nationaly, String id, String firstName, String lastName) {
        this.nationality = nationaly;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    static class Nationality {
        private String country;
        private String abbreviation;

        public Nationality(String country, String abbreviation) {
            this.country = country;
            this.abbreviation = abbreviation;
        }

        public String getCountry() {
            return country;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        @Override
        public String toString() {
            return "\nNationality: " +
                    "country - " + country +
                    ", abbreviation - " + abbreviation;
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Nationality nationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Citizen: " +
                "id - " + id +
                ", First Name - " + firstName +
                ", Last Name - " + lastName + nationality;
    }
}
