class Variables {
    public static void main(String[] args) {
        String firstName = "Slawek";
        String lastName = "Ludwiczak";
        final String pesel = "12312312312";
        int age = 25;
        double height = 179.5;

        System.out.print("Czesc ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.println(lastName);

        System.out.println("Ponizej jest kilka informacji o Tobie:");
        System.out.print("Twoj PESEL to: ");
        System.out.println(pesel);
        System.out.print("Masz ");
        System.out.print(age);
        System.out.println(" lat");

        System.out.print("Twój wzrost to: ");
        System.out.print(height);
        System.out.print("cm");
    }
}