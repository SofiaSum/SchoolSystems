package People;

public class Student {
    //Setter & Getter
    private String name;
    private String section;
    private int cellNumber;
    private int ID;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSection() {
        return section;
    }

    private void setSection(String section) {
        this.section = section;
    }

    private int getCellNumber() {
        return cellNumber;
    }

    private void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    private int getID() {
        return ID;
    }

    private void setID(int ID) {
        this.ID = ID;
    }
}
