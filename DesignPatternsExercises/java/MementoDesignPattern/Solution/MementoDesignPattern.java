public class MementoDesignPattern {
    public static void main(String[] args) {
        LedTV tv1 = new LedTV(10, 100);
        LedTV tv2 = new LedTV(20, 200);

        Speaker speaker1 = new Speaker(1000);
        Speaker speaker2 = new Speaker(2000);

        Warehouse warehouse = new Warehouse();

        HomeTheatre homeTheatre = new HomeTheatre(tv1, speaker1);
        warehouse.addMemento(homeTheatre.getMemento());

        homeTheatre = new HomeTheatre(tv1, speaker2);
        warehouse.addMemento(homeTheatre.getMemento());

        homeTheatre = new HomeTheatre(tv2, speaker1);
        warehouse.addMemento(homeTheatre.getMemento());

        homeTheatre = new HomeTheatre(tv2, speaker2);
        warehouse.addMemento(homeTheatre.getMemento());

        System.out.println("-- -- Current Home Theatre State is " + (HomeTheatre.getStateCount() - 1) + " -- --");
        System.out.println("Home Theatre State " + (HomeTheatre.getStateCount() - 1) + ":\n    " + homeTheatre);

        System.out.println("-- -- Rollback to Home Theatre State 0 -- --");
        homeTheatre.setMemento(warehouse.getMemento(0));
        System.out.println("Home Theatre State 0:\n    " + homeTheatre);
    }
}
