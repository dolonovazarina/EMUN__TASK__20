public enum Nedelia {



        MONDAY("Dyishombu"),
        TUESDAY("SHieshembi"),
        WEDNESDAY("SHarshembi"),
        Thursday(" Paishambi"),
        FRIDAY(" Juma"),
        SATUDAY("Ishembi"),
        SUNDDAY("Jekshembi");



        private String name;

        Nedelia(String name) {
            this.name = name;

        }

    @Override
    public String toString() {
        return "Nedelia{" +
                "name='" + name + '\'' +
                '}';
    }
}






