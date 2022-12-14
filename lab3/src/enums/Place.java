package enums;

public enum Place {
    IN_THE_DOORWAY("в дверях"),
    IN_THE_ROOM("в комнате"),
    NEAR_THE_WINDOW("у окна"),
    ON_THE_ROOF("на крыше");
    private String title;
    Place(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
