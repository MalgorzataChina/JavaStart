class Cars {
    public static void main(String[] args) {
        String Marka = "Ford";
        String Model = "Fiesta";
        final String VIN = "12312312312";
        int rocznik = 2012;
        double cena = 35000;

        System.out.println("Czesc, samochod dla Ciebie to ");
        System.out.print(Marka);
        System.out.print(" ");
        System.out.println(Model);

        System.out.print("Rocznik ");
        System.out.println(rocznik);
        System.out.print("Cena jak dla Ciebie to ");
        System.out.println(cena);
        System.out.print("Dodatkowo mozesz sprawdzic nr VIN, tj.");
        System.out.print(VIN);
    }
}